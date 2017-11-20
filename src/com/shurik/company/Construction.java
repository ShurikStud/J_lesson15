package com.shurik.company;

public class Construction {

    private int base;
    private int floor;
    private int roof;
    private int walls;

    public static class Builder{

        private int baseBuilder;
        private int floorBuilder;
        private int roofBuilder;
        private int wallsBuilder;

        public Builder(){}

        public Builder addBase(int value){
            baseBuilder = value;
            return this;
        }

        public Builder addFloor(int value){
            floorBuilder    = value;
            return this;
        }

        public Builder addRoof(int value){
            roofBuilder = value;
            return this;
        }

        public Builder addWalls(int value){
            wallsBuilder    = value;
            return this;
        }

        public Construction build(){
            return new Construction(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "baseBuilder=" + baseBuilder +
                    ", floorBuilder=" + floorBuilder +
                    ", roofBuilder=" + roofBuilder +
                    ", wallsBuilder=" + wallsBuilder +
                    '}';
        }
    }

    public Construction(Builder builder) {
        base = builder.baseBuilder;
        floor   = builder.floorBuilder;
        roof    = builder.roofBuilder;
        walls   = builder.wallsBuilder;

    }

    @Override
    public String toString() {
        return "Construction{" +
                "base=" + base +
                ", floor=" + floor +
                ", roof=" + roof +
                ", walls=" + walls +
                '}';
    }
}
