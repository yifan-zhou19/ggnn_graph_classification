package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			int m;
			int n;
			int[][] p;
			int a;
			int b;
			int sum;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			p = new int[m];
			for (a = 0;a < m;a++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[a] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
			}
			for (a = 0;a < m;a++)
			{
				for (b = 0;b < n;b++)
				{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					*(p + a) + b = tempVar4;
				}
				}
			}
			sum = 0;
			for (b = 0;b < n;b++)
			{
			sum = sum + *(p + b) + *(*(p + m - 1) + b);
			}
			for (a = 1;a < m - 1;a++)
			{
			sum = sum + **(p + a) + *(*(p + a) + n - 1);
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

