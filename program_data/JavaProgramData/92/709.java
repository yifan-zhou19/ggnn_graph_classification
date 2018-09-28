package <missing>;

public class GlobalMembers
{
	public static int fun(int x,int y)
	{
		int z = 0;
		if (x > y)
		{
			z = 1;
		}
		if (x < y)
		{
			z = -1;
		}
		return (z);
	}
	public static int Main()
	{
		int n;
		int media;
		int k;
		int max;
		int temp;
		int[] t = new int[1000];
		int[] w = new int[1000];
		int[] sum = new int[1000];
		int i;
		int i1;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(sum,0,(Integer.SIZE / Byte.SIZE));
			max = -1000; //?????????
			for (i1 = 0;i1 < n;i1++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					t[i1] = Integer.parseInt(tempVar2);
				}
			}
			for (i1 = 0;i1 < n;i1++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					w[i1] = Integer.parseInt(tempVar3);
				}
			}
			for (i1 = 0;i1 < n;i1++)
			{
				for (j = 0;j < n - 1;j++)
				{
					if (t[j] < t[j + 1])
					{
						media = t[j];
						t[j] = t[j + 1];
						t[j + 1] = media;
					}
				}
			}
			for (i1 = 0;i1 < n;i1++)
			{
				for (j = 0;j < n - 1;j++)
				{
					if (w[j] < w[j + 1])
					{
						media = w[j];
						w[j] = w[j + 1];
						w[j + 1] = media;
					}
				}
			} //??
			for (i = 0;i <= n / 2;i++)
			{
				for (i1 = 0;i1 < n;i1++)
				{
						sum[i] = sum[i] + fun(t[i1], w[i1]);
				}
							max = max > sum[i] != 0?max:sum[i];
				temp = w[0];
				for (i1 = 0;i1 < n - 1;i1++)
				{
					w[i1] = w[i1 + 1];
				}
				w[n - 1] = temp;
			}
			System.out.printf("%d\n",max * 200);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}while (n != 0); //??????
	}

}

