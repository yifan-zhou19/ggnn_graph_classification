package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] p = new int[100];
		int[] e = new int[100];
		int j;
		int m = 0;
		int max;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		if ((a[i] <= 140) && (a[i] >= 90) && (b[i] <= 90) && (b[i] >= 60))
		{
			p[i] = 1;
		}
		else
		{
			p[i] = 0;
		}
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == 1)
			{
				e[m] = 0;
				for (j = i;j < n && p[j] == 1;j++)
				{
				e[m]++;
				}
				m++;
			}
		}
		if (m == 0)
		{
		e[0] = 0;
		}
		max = e[0];
		for (i = 1;i < m;i++)
		{
			if (e[i] > max)
			{
			max = e[i];
			}
		}
		System.out.printf("%d\n",max);



	return 0;


	}






}

