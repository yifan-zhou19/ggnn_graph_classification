package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[][] p;
		int i;
		int j;
		int sum;
		int m;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (l = 0,sum = 0;l < N;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			p = new int[m];
			for (i = 0;i < m;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			*(p + i) = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
			}
			for (i = 0;i < m;i++)
			{
			  for (j = 0;j < n;j++)
			  {
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						*(p + i) + j = tempVar4;
					}
					if (i == 0 || j == 0 || i == m - 1 || j == n - 1)
					{
					sum += *(*(p + i) + j);
					}
			  }
			}
				System.out.printf("%d\n",sum);
				sum = 0;
		}
	}

}

