//**************************
//*?????(14-4) ????  **
//*?????? 1200012888 **
//*???2013.12.11**
//**************************
//C++ TO JAVA CONVERTER NOTE: Classes must be named in Java, so the following class has been named AnonymousClass:
public class AnonymousClass //????????? Point ?? x y z ??
{
	public int x;
	public int y;
	public int z;
}
public class dis //????????? dis ?? ????d???????Point????????
{
	public int pos_1;
	public int pos_2;
	public double d;
}

package <missing>;

public class GlobalMembers
{
	public static AnonymousClass[] Point = tangible.Arrays.initializeWithDefaultAnonymousClassInstances(10); //????? Point
	public static dis[] Dis = tangible.Arrays.initializeWithDefaultdisInstances(45);
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0 ; i < n ; i++) //??n?????
		{
			Point[i].x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			Point[i].y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			Point[i].z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int count = 0; //count????
		for (int i = 0 ; i < n ; i++)
		{
			for (int j = i + 1 ; j < n ; j++)
			{
				Dis[count].d = Math.sqrt(1.0 * (Point[i].x - Point[j].x) * (Point[i].x - Point[j].x) + (Point[i].y - Point[j].y) * (Point[i].y - Point[j].y) + (Point[i].z - Point[j].z) * (Point[i].z - Point[j].z));
																	//???????
				Dis[count].pos_1 = i; //?????????
				Dis[count].pos_2 = j;
				count++;
			}
		}
		for (int i = 0 ; i < count - 1 ; i++) //?????
		{
			for (int j = 0 ; j < count - i - 1; j++)
			{
				if (Dis[j].d < Dis[j + 1].d)
				{
					dis temp = new dis();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp = Dis[j];
					temp.copyFrom(Dis[j]);
					Dis[j] = Dis[j + 1];
					Dis[j + 1] = temp;
				}
			}
		}
		for (int i = 0 ; i < count ; i++) //????????
		{
			System.out.print('(');
			System.out.print(Point[Dis[i].pos_1].x);
			System.out.print(',');
			System.out.print(Point[Dis[i].pos_1].y);
			System.out.print(',');
			System.out.print(Point[Dis[i].pos_1].z);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print(Point[Dis[i].pos_2].x);
			System.out.print(',');
			System.out.print(Point[Dis[i].pos_2].y);
			System.out.print(',');
			System.out.print(Point[Dis[i].pos_2].z);
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f", Dis[i].d);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}
}

