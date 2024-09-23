class Test {
    public static void main(String[] args) {
        // Creating a heterogeneous array of Shape objects
        Shape[] s = new Shape[3];
        
        // Assigning instances of subclasses to the array
        s[0] = new Rectangle();
        s[1] = new Circle();
        s[2] = new Triangle();
        
        // Iterating through the array and calling draw() method of each object
        for (int i=0 ; i<s.length ; i++) {
            s[i].draw();
        }
    }
}

class Shape {
    void draw() {
        System.out.println("drawing...");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}
