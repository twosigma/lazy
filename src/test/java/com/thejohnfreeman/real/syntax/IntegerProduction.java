package com.thejohnfreeman.real.syntax;

public class IntegerProduction
    implements StartNode
{
    private final ListNode _list;

    public IntegerProduction(ListNode list) {
        _list = list;
    }

    public ListNode list() {
        return _list;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return _list.toString();
    }
}