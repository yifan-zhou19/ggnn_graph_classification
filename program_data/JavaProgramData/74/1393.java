package <missing>;

public class GlobalMembers
{
	public static int huiwen(int i)
	{
		int z = 0;
		while (i != 0)
		{
			z = z * 10 + i % 10;
			i = i / 10;
		}
		return (z);
	}
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int flag = 0;
		int l;
		int a;
		int b;
		int[] c = new int[1000];
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}

		for (i = a;i <= b;i++)
		{
			t = 1;
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					t = 0;
				}
			}

			if (t != 0)
			{
				l = huiwen(i);
				if (l == i)
				{
					k++;
					c[k] = i;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 1;i <= k;i++)
			{
				if (flag != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",c[i]);
				flag = 1;
			}
		}
	}

}

