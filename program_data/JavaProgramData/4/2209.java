package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int m;
		int n;
		int a = 0;
		int[] p = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (int [10000])calloc(10000,10000);
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = tempVar3;
				}
			}
		}
		i = 0;
		j = 0;
		while (a < n + m - 1)
		{
			while (i != m && j != -1)
			{
				System.out.printf("%d\n",*(p[i] + j));
				i++;
				j--;
			}
			a++;
			if (a > n - 1)
			{
				j = n - 1;
				i = a - (n - 1);
			}
			else if (a <= n - 1)
			{
				j = a;
				i = 0;
			}
		}
	}
}

