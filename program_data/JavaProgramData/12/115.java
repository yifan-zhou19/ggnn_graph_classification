package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] p = new int[15];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p[0] = Integer.parseInt(tempVar);
		}
			int i;
			int l = 0;
		for (i = 1;i < 15;i++)
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			if (a == 0)
			{
				break;
			}
			else
			{
				p[i] = a;
				l++;
			}
		};
		int j;
		int m;
		int max;
		for (j = 0;j < l - 1;j++)
		{
			for (m = j + 1;m < l;m++)
			{
		if (p[j] > p[m])
		{
		max = p[j];
		p[j] = p[m];
		p[m] = max;
		}
			}
		}
		int num = 0;
		int k;
		int n;
		for (k = 0;k < l - 1;k++)
		{
			for (n = k + 1;n < l;n++)
			{
			if ((p[n] / p[k]) == 2 && p[n] % p[k] == 0)
			{
				num++;
			}
			if (p[n] / p[k] > 2)
			{
				break;
			}
			}
		}
		System.out.printf("%d",num);
	}
}

