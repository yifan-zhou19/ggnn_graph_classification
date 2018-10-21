package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String p;
		String q;
		char[][] sum = new char[20][100];
		char[][] da = new char[20][100];
		int[] c = new int[20];
		int[] d = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sum[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				da[i] = tempVar3.charAt(0);
			}
			c[i] = String.valueOf(sum[i]).length();
			d[i] = String.valueOf(da[i]).length();
			scanf("\n");
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			sum[n - 1] = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			da[n - 1] = tempVar5.charAt(0);
		}
		c[n - 1] = String.valueOf(sum[n - 1]).length();
		d[n - 1] = String.valueOf(da[n - 1]).length();
		for (i = 0;i < n;i++)
		{
			for (p = sum[i][c[i] - 1], q = da[i][d[i] - 1], j = 0;j < d[i];j++, p--, q--)
			{
				if (p >= q)
				{
					sum[i][c[i] - 1 - j] = p - q.Substring(48);
				}
				else if (p < q)
				{
					sum[i][c[i] - 1 - j] = p - q.Substring(58);
					*(p - 1) = *(p - 1) - 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",sum[i]);
		}
	}





}

