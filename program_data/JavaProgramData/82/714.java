package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int s = 0;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *sf=(int*)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int sf = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			sz[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * 2);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
					if (sz[i][0] >= 90 && sz[i][0] <= 140 && sz[i][1] >= 60 && sz[i][1] <= 90)
					{
					s++;
					}
				else
				{
					sf[a] = s;
					a++;
					s = 0;
				}
			}
			if (i == n - 1)
			{
					if (sz[i][0] >= 90 && sz[i][0] <= 140 && sz[i][1] >= 60 && sz[i][1] <= 90)
					{
					s++;
					sf[a] = s;
					a++;
					}
				else
				{
					sf[a] = s;
					a++;
				}
			}

		}

		for (i = 0;i < a - 1;i++)
		{
			if (sf[i] > sf[i + 1])
			{
				e = sf[i];
				sf[i] = sf[i + 1];
				sf[i + 1] = e;
			}
		}
		System.out.printf("%d",sf[a - 1]);
		return 0;
	}
}

