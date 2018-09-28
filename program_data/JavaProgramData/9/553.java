package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h;
		int i;
		int j;
		int k;
		int s;
		int t;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n - 1];
		int[] c = new int[n - 1];
		char[][] string = new char[n - 1][10];
		char[][] b = new char[n - 1][10];
		for (h = 0;h <= n - 1;h++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				string[h] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[h] = Integer.parseInt(tempVar3);
			}
		}
		for (p = 0,j = 0;p <= n - 1;p++)
		{
			if (a[p] >= 60)
			{
				c[j] = a[p];
				b[j] = string[p];
				j++;
			}
		}
		for (k = 1;k <= j;k++)
		{
			for (s = 1;s <= j;s++)
			{
				for (i = 0,t = 0;i < j;i++)
				{
					if (c[s - 1] >= c[i])
					{
						t++;
					}
				}
				if (t == j)
				{
					System.out.printf("%s\n",b[s - 1]);
					c[s - 1] = 0;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < 60)
			{
				System.out.printf("%s\n",string[i]);
			}
		}
		System.in.read();
		System.in.read();
	}

}

