package com.mega.day12;

final class ImmutableClass {
    private final int id;
    private final String color;
    private final int points;

    public ImmutableClass(int id,String color,int points){
        this.id=id;
        this.color=color;
        this.points=points;
    }

    public int getPoints(){
        return points;
    }

}
