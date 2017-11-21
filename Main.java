package HW;
/*1. �������� ����������� ����� Shape � ������� ���� ���
����������� ������ double getPerimetr() � double getArea().
2. �������� ����� Point � ������� ���� ��� �������� double x
double y.
3. �������� ������ ������� ��������� ��� ������� 3
�������������� ������ (��� ������ ���� �����������
Shape), ��� ���� ��� � �������� ������� ������ ���������
������ Point*/

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
