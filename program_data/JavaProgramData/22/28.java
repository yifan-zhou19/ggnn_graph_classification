package <missing>;

public class GlobalMembers
{
	public static void change(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}

	public static int min(int x,int y)
	{
		int z;
		if (x < y)
		{
			z = x;
		}
		else
		{
			z = y;
		}
		return (z);
	}


	public static int MAX(int x,int y)
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

	public static void Main()
	{
		int[] num = new int[300];
		int i;
		int n;
		int max = 0;
		int max_2 = 0;
		int t = 0;
		char str = ',';
		for (i = 0;str == ',';i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				num[i] = Integer.parseInt(tempVar);
			}
			str = System.in.read();
		}
		n = i;
		if (n == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				max = MAX(max, num[i]);
			}
			for (i = 0;i < n;i++)
			{
				if (num[i] < max)
				{
					max_2 = MAX(max_2, num[i]);
					t = 1;
				}
			}
			if (t == 0)
			{
				System.out.print("No");
			}
			else
			{
				System.out.printf("%d",max_2);
			}
		}
		System.out.print("\n");
	}
}

