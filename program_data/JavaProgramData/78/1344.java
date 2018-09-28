package <missing>;

public class GlobalMembers
{
	//??:???
	//???1000012856
	//???2010.11.20
	//???

	public static int Main()
	{
		int[] a = new int[4];
		int i;
		int j;
		int m;
		int n;
		for (i = 10; i <= 50; i = i + 10)
		{
			for (j = 10; j <= 50; j = j + 10)
			{
				for (m = 10; m <= 50; m = m + 10)
				{
					for (n = 10; n <= 50; n = n + 10)
					{
						a[0] = i;
						a[1] = j;
						a[2] = m;
						a[3] = n;
						if ((a[0] != a[1]) && (a[0] != a[2]) && (a[0] != a[3]) && (a[1] != a[2]) && (a[1] != a[3]) && (a[2] != a[3]) && ((a[0] + a[1]) == (a[2] + a[3])) && ((a[0] + a[3]) > (a[2] + a[1])) && ((a[0] + a[2]) < a[1]))
						{
							System.out.print('l');
							System.out.print(' ');
							System.out.print(a[3]);
							System.out.print("\n");
							System.out.print('q');
							System.out.print(' ');
							System.out.print(a[1]);
							System.out.print("\n");
							System.out.print('z');
							System.out.print(' ');
							System.out.print(a[0]);
							System.out.print("\n");
							System.out.print('s');
							System.out.print(' ');
							System.out.print(a[2]);
							System.out.print("\n");
						}
					}
				}
			}
		}

		return 0;
	}

}
