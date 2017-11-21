package HW;
/*1. Создайте абстрактный класс Shape в котором есть два
абстрактных метода double getPerimetr() и double getArea().
2. Создайте класс Point в котором есть два свойства double x
double y.
3. Создайте классы которые описывают как минимум 3
геометрические фигуры (они должны быть подклассами
Shape), при этом они в качестве свойств должны содержать
классы Point*/

public class Main {

	public static void main(String[] args) {
		Triangular tr = new Triangular(1, 2, 3, 4, 5);
		
		System.out.println(tr.getPerimetr());
		System.out.println(tr.getArea());
		System.out.println();

		Circle cr = new Circle(1,2,5);
		System.out.println(cr.getPerimetr());
		System.out.println(cr.getArea());
		System.out.println();
		
		Square sq = new Square(1,2,5);
		System.out.println(sq.getPerimetr());
		System.out.println(sq.getArea());
				
	}

}
