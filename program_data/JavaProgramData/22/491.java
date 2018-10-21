package <missing>;

public class GlobalMembers
{
	public static int maxaaaa(int x,int y)
	{
		int z;
		if (x > y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}



	public static int minaaaa(int x,int y)
	{
		int z;
		if (x > y)
		{
			z = y;
		}
		else
		{
			z = x;
		}
		return (z);
	}

			/*?????*/
	public static int Main()
	{
		int i;
		int j;
		int m;
		int[] a = new int[1000];
		int max;
		int min;
		int maxaaaa = new int(int x,int y);
		int minaaaa = new int(int x,int y);
		char q;
		for (i = 1;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i - 1] = Integer.parseInt(tempVar);
			}
			q = System.in.read();
			if (q == '\n')
			{
				break;
			}
		}
		/*????*/
		if (i == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (m = i;m >= 1;m--)
			{
				for (j = 1;j <= m - 1;j++)
				{
					min = minaaaa(a[j], a[j - 1]);
					max = maxaaaa(a[j], a[j - 1]);
					a[j] = max;
					a[j - 1] = min;
				}
			}
			for (m = i;m >= 2;m--)
			{
				if (a[m - 1] > a[m - 2])
				{
					System.out.printf("%d",a[m - 2]);
					break;

				}

			}
			if (m == 1)
			{
				System.out.print("No");
			}
		}
		return 0;
	}

}

