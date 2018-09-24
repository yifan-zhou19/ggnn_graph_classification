package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??????
		int b;
		int c;
		int true1; //????
		int true2;
		int true3;
		for (a = 1;a <= 3;a++) //????????
		{
			for (b = 1;b <= 3;b++)
			{
				for (c = 1;c <= 3;c++)
				{
					true1 = (a < b) + (a == c);
					true2 = (a > b) + (a > c);
					true3 = (c > b) + (b > a);
					if (a > b && b > c && true3 > true2 && true2 > true1)
					{
						System.out.print("C");
						System.out.print("B");
						System.out.print("A");
					}
					else if (a > c && c > b && true2 > true3 && true3 > true1)
					{
						System.out.print("B");
						System.out.print("C");
						System.out.print("A");
					}
					else if (b > a && a > c && true3 > true1 && true1 > true2)
					{
						System.out.print("C");
						System.out.print("A");
						System.out.print("B");
					}
					else if (b > c && c > a && true1 > true3 && true3 > true2)
					{
						System.out.print("C");
						System.out.print("B");
						System.out.print("A");
					}
					else if (c > a && a > b && true2 > true1 && true1 > true3)
					{
						System.out.print("B");
						System.out.print("A");
						System.out.print("C");
					}
					else if (c > b && b > a && true1 > true2 && true2 > true3)
					{
						System.out.print("A");
						System.out.print("B");
						System.out.print("C");
					}
				} //????????????
			}
		}
		return 0;
	}

}
