package com.sts;

public class DummyCreated {
    private String groupTransactionId;

    private Dummy dummy;

    public String getGroupTransactionId() {
        return groupTransactionId;
    }

    public void setGroupTransactionId(String groupTransactionId) {
        this.groupTransactionId = groupTransactionId;
    }
    public Dummy getDummy() {
        return dummy;
    }

    public void setDummy(Dummy dummy) {
        this.dummy = dummy;
    }

    @Override
    public String toString() {
        return "DummyCreated{" +
                "groupTransactionId='" + groupTransactionId + '\'' +
                ", dummy=" + dummy.toString() +
                '}';
    }
}
