package <missing>;

public class GlobalMembers
{
	public static int b = 0;
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[100];
		int I;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j != 0)
				{
					k = 1;
				}
				else
				{
					k = 0;
					break;
				}
			}
			if (k == 1)
			{
				I = 0;
				t = i;
				while (t > 0)
				{
					I = I * 10 + t % 10;
					t = t / 10;
				}
				if (I == i)
				{
					a[b] = i;
					b++;
				}
			}
		}
		if (a[0] == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;a[i + 1] != 0;i++)
			{
				 System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d\n",a[i]);
		}
	}
}

