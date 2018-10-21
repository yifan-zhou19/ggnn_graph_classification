package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
		int sum = 59;
		int[] a = new int[100];
		int[] b = new int[100];
		char[][] c = new char[101][10];
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
				else
				{
					continue;
				}
			}
			a[k] = -1;
			b[j] = k;
			sum = 59;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",c[b[i]]);
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 0 && a[i] < 60)
			{
				System.out.printf("%s\n",c[i]);
			}
		}
	}
}

