package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*???????                                          *
	//*?  ?????                                          *
	//*?  ??1000012806                                      *
	//*?????2010.11.17.                                   *
	//**********************************************************
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		int A;
		int B;
		int C;
		for (i = 0; i <= 2; i++)
		{
			a = i;
			for (j = 0; j <= 2; j++)
			{
				b = j;
				if (b == a)
				{
					continue;
				}
				for (k = 0; k <= 2; k++)
				{
					c = k;
					if (c == a || c == b)
					{
						continue;
					}
					A = (b > a) + (c == a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					if ((a + A) == 2 && (b + B) == 2 && (c + C) == 2)
					{
						if (a > b && b > c)
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
							System.out.print("\n");
						}
						if (a > c && c > b)
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
							System.out.print("\n");
						}
						if (b > a && a > c)
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
							System.out.print("\n");
						}
						if (b > c && c > a)
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
							System.out.print("\n");
						}
						if (c > a && a > b)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
							System.out.print("\n");
						}
						if (c > b && b > a)
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}

}
