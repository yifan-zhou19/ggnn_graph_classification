package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		int a = 1;
		int i;
		for (i = 2;i <= Math.sqrt(n);i++)
		{
		if (n % i == 0)
		{
			a = 0;
		}
		}
		return (a);
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int t;
		int j;
		int s = 0;
		int k;
		int[] b = new int[100];
		int l = 0;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = n;i <= m;i++)
		{
			k = i;
			if (judge(k) == 1)
			{
				t = i;
				j = 0;
				while (t > 0)
				{
					j = j * 10 + t % 10;
					t /= 10;
				}
				if (j == i)
				{
					s = 1;
					b[l] = i;
					l++;
					p = l;
				}
			}
		}
		if (s == 1)
		{
			for (l = 0;l < p - 1;l++)
			{
				System.out.printf("%d,",b[l]);
			}
			System.out.printf("%d\n",b[l]);
		}
		if (s == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}

}

