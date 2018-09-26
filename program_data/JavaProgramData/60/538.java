package <missing>;

public class GlobalMembers
{
	public static int pan(int a)
	{
		int p = 1;
		int i;
		for (i = 3;i * i <= a;i = i + 2)
		{
		if (a % i == 0)
		{
			p = 0;
		}
		}
		return (p);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i = i + 2)
		{
			if (pan(i) == 1)
			{
			if (pan(i + 2) == 1)
			{
			System.out.printf("%d %d\n",i,i + 2);
			k = 1;
			}
			}

		}
		if (k == 0)
		{
			System.out.print("empty");
		}
	}
}

