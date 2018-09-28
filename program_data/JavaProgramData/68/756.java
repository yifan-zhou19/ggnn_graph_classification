package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int u;
		int p;
		int a;
		int q;
		int n;
		int i;
		int j;
		int k;
		int m;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i++,i++)
		{
			for (j = 3;j <= i / 2;j++,j++)
			{
				p = Math.sqrt(j);
				for (k = 1;k <= p;k++,k++)
				{
				if (k != 1)
				{
					r = j % k;
				if (r == 0)
				{
					break;
				}
				}
				}
				if (k > p)
				{
					q = i - j;
				u = Math.sqrt(q);
				for (m = 1;m <= u;m++,m++)
				{
				if (m != 1)
				{
					a = q % m;
				if (a == 0)
				{
					break;
				}
				}
				}
				if (m > u && q >= 3)
				{
					System.out.printf("%d=%d+%d\n",i,j,q);
					break;
				}
				}
			}
		}
	}
}

