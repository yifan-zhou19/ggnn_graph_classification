package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j = 0;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int k;
		int m = 0;
		int sum = 59;
		char[][] c = new char[100][10];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 60)
			{
				m++;
			}
		}
		for (j = 0;j < m;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (a[i] > sum)
				{
					sum = a[i];
					k = i;
				}
			}
			a[k] = 0;
			b[j] = k;
			sum = 59;
		}
		for (j = 0;j < m;j++)
		{
			System.out.printf("%s\n",c[b[j]]);
		}
		for (i = 0;i < n;i++)
		{
			if ((a[i] > 0) && (a[i] < 60))
			{
				System.out.printf("%s\n",c[i]);
			}
		}
	}

}

