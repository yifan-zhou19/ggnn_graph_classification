package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[105];
		char[][] c = new char[105][11];
		int i;
		int j;

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
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		int[] aa = new int[105];
		int[] num = new int[105];
		int u = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 60)
			{
				aa[i] = a[i];
				num[u] = i;
				u++;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (aa[i] > 0 && aa[i] == aa[j])
				{
					aa[i] = 0;
				}
			}
		}
		for (i = n;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (aa[j] < aa[j + 1])
				{
					int t = aa[j];
					aa[j] = aa[j + 1];
					aa[j + 1] = t;
	/*				char tt[11];
					strcpy(tt,c[i]);
					strcpy(c[i],c[i+1]);
					strcpy(c[i+1],tt);*/
				}
			}
		}
		for (i = 0;aa[i] != 0;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[j] == aa[i])
				{
					System.out.printf("%s\n",c[j]);
				}
			}
		}
		int tem = 0;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < u;i++)
			{
				if (j == num[i])
				{
					tem = 1;
				}
			}
			if (tem == 0)
			{
				System.out.printf("%s\n",c[j]);
			}
			tem = 0;
		}

	}
}

