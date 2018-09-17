package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int lanjie = new int(int s[],int n,int m,int k);
		int k;
		int i;
		int[] s = new int[25];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		n = lanjie(s, 10000, 0, k);
		System.out.printf("%d",n);
	}
	public static int lanjie(int[] a, int n, int m, int k) //n?????
	{
		int c;
		int b;
		int z;
		if (m != k - 1)
		{
			if (n >= a[m])
			{
				c = lanjie(a, a[m], m + 1, k) + 1;
				b = lanjie(a, n, m + 1, k);
				if (c > b)
				{
					z = c;
				}
				else
				{
					z = b;
				}
			}
			else
			{
				z = lanjie(a, n, m + 1, k);
			}
		}
		else
		{
			if (n >= a[m])
			{
				z = 1;
			}
			else
			{
				z = 0;
			}
		}
		return (z);

	}
}

