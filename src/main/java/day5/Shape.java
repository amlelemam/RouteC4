package day5;

class Shape {
    public void draw() {
        System.out.println(" Drawing a shape ");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println(" Drawing a Circle ");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println(" Drawing a Square ");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println(" Drawing a Triangle ");
    }
}

