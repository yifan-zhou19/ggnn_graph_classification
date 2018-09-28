package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max = new int(int m,int b[]);
		int i;
		int n;
		int c;
		int[] a = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		c = max(n, a);
		System.out.printf("%d\n",c);
		for (i = 0;i < n;i++)
		{
			if (a[i] == c)
			{
				a[i] = -1;
			}
		}

		System.out.printf("%d\n",max(n, a));
	}


	public static int max(int m, int[] b)
	{
		int i;
		int ma;
		ma = b[0];
		for (i = 1;i < m;i++)
		{
			if (ma < b[i])
			{
				ma = b[i];
			}
		}

		return (ma);
	}





}

