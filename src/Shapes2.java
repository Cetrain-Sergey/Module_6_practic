class Shapes2 {
    public static void main(String[] args) {
        Triangle tl = new Triangle();
        Triangle t2 = new Triangle();
        tl.setWidth(4.0);
        tl.setHeight(4.0);
        tl.style = "закрашенный";
        t2.setWidth(8.0);
        t2.setHeight(12.0);
        t2.style = "контурный";
        System.out.println("Инфopмaция о tl: ");
        tl. showStyle () ; tl.showDim();
        System.out.println("Плoщaдь - "+ tl.area());
        System.out.println();
        System.out.println("Инфopмaция о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Плoщaдь - "+ t2.area());
    }
}
