package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int i;
		int j;
		int k = 0;
		int[] p = new int[N];
		int[] a = {0, 0};
		for (i = 2;i < N;i++)
		{
			p[i] = 1;
		}
		//for(i=0;i<N;i++)b[i]=i;
		for (i = 2;i < N;i++)
		{
		if (p[i] != 0)
		{
			a[k++] = i;
		for (j = 1;i * j < N;j++)
		{
		p[i * j] = 0;
		}
		}
		}
		for (x = 6;x <= N;x += 2)
		{
			for (i = 0;a[i] != 0;i++)
			{
		for (j = i;j < N;j++)
		{
		if (x == a[i] + a[j])
		{
			System.out.printf("%d=%d+%d\n",x,a[i],a[j]);
		}
		}
			}
	 return 0;
		}
	}
}
