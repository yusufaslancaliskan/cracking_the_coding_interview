package com.cosef.ctci.recursiveandynamic;

import java.util.Stack;

public class RD2 {

    private static int XLENGTH = 7, YLENGTH = 5;

    public static int solution(int[][] labyrinth, Stack<Move> path, Boolean goDown) {
        if (path.empty()) {
            path.push(new Move(0, 0, Move.Direction.RIGHT));
            goRight(labyrinth, path);
        }
        Move m = path.peek();
        if (m.x == XLENGTH - 1 && m.y == YLENGTH -1) {
            return 1;
        }
        if (m.x == -1) {
            path = goBack(path);
            if (m.direction == Move.Direction.RIGHT) {
                goDown(labyrinth, path);
            } else {
                path = goBack(path);
                return solution(labyrinth, path, true);
            }
        } else {
            if (goDown) {
                goDown(labyrinth, path);
            } else {
                goRight(labyrinth, path);
            }
        }

        return solution(labyrinth, path, false);
    }

    public static Stack<Move> goRight(int[][] labyrinth, Stack<Move> path) {
        Move m = path.peek();
        if (m.y + 1 < RD2.YLENGTH && labyrinth[m.x][m.y + 1] != -1) {
            path.push(new Move(m.x, m.y + 1, Move.Direction.RIGHT));
        } else {
            path.push(new Move(-1, -1, Move.Direction.RIGHT));
        }
        return path;

    }

    public static Stack<Move> goDown(int[][] labyrinth, Stack<Move> path) {
        Move m = path.peek();
        if (m.x + 1 < RD2.XLENGTH && labyrinth[m.x + 1][m.y] != -1) {
            path.push(new Move(m.x + 1, m.y, Move.Direction.DOWN));
        } else {
            path.push(new Move(-1, -1, Move.Direction.DOWN));
        }
        return path;

    }

    public static Stack<Move> goBack(Stack<Move> path) {
        if (path.empty()) {
            return null;
        }
        path.pop();
        return path;
    }

}

class Move {
    int x;
    int y;
    Direction direction;

    enum Direction {
        DOWN, RIGHT
    }

    public Move(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
