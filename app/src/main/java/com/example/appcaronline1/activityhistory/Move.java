package com.example.appcaronline1.activityhistory;

public class Move {
    String moveFrom_422,moveTo_422,start_422,end_422;

    public Move(String moveFrom_422, String moveTo_422,  String start_422, String end_422) {
        this.moveFrom_422 = moveFrom_422;
        this.moveTo_422 = moveTo_422;

        this.start_422 = start_422;
        this.end_422 = end_422;
    }

    public String getMoveFrom_422() {
        return moveFrom_422;
    }

    public void setMoveFrom_422(String moveFrom_422) {
        this.moveFrom_422 = moveFrom_422;
    }

    public String getMoveTo_422() {
        return moveTo_422;
    }

    public void setMoveTo_422(String moveTo_422) {
        this.moveTo_422 = moveTo_422;
    }


    public String getStart_422() {
        return start_422;
    }

    public void setStart_422(String start_422) {
        this.start_422 = start_422;
    }

    public String getEnd_422() {
        return end_422;
    }

    public void setEnd_422(String end_422) {
        this.end_422 = end_422;
    }

    @Override
    public String toString() {
        return "Move{" +
                "moveFrom_422='" + moveFrom_422 + '\'' +
                ", moveTo_422='" + moveTo_422 + '\'' +
                ", start_422='" + start_422 + '\'' +
                ", end_422='" + end_422 + '\'' +
                '}';
    }
}
