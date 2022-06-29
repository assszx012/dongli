package com.huawei.it.stack;

public class StackArray {

    // 栈顶位置
    private int top;

    // 栈的初始化容量
    private int length;

    // 栈容器
    private int[] stack;

    public StackArray(int length) {
        this.stack = new int[length];
    }

    // 入栈
    public boolean pop(int val) {
        if (top == length) {
            throw new IllegalStateException("stack is full");
        }
        stack[top] = val;
        top++;
        return true;
    }


    public int push() {
        if (top == 0) {
            throw new IllegalStateException("stack is empty");
        }
        int value = stack[top];
        stack[top] = 0;
        top--;
        return value;
    }

}
