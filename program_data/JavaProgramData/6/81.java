package <missing>;

public class GlobalMembers
{
	public static void sum(int i)
	{
		int m;
		int n;
		int j;
		int k;
		int sum = 0;
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
		int[] p = (int [100])calloc(100,100 * (Integer.SIZE / Byte.SIZE));
		for (j = 0;j < m;j++)
		{
			for (k = 0;k < n;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j] + k = tempVar3;
				}
			}
		}
		for (j = 0;j < m;j++)
		{
			if (j == 0 || j == m - 1)
			{
				for (k = 0;k < n;k++)
				{
					sum = sum + *(p[j] + k);
				}
			}
			else
			{
				sum = sum + *(p[j]) + *(p[j] + n - 1);
			}
		}
		System.out.printf("%d\n",sum);
	}



	public static void Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < k;i++)
		{
			sum(i);
		}
	}

}

