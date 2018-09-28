package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sum = new int(int a,int b,int c);
		int n;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		t = n;
		System.out.printf("%d\n",sum(n + 1, k, t));
	}

	public static int sum(int a,int b,int c)
	{
		int x;
		int j;
		if (a == 1)
		{
			x = 1;
			if (c != 2)
			{
				for (j = 1;j <= c;j++)
				{
				x = x * (c - 1);
				}
			x = x - b * (c - 1);
			}
		}
			else
			{
			x = sum(a - 1, b, c) * c / (c - 1) + b;
			}
		return (x);
	}

}

