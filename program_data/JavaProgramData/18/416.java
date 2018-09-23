package <missing>;

public class GlobalMembers
{
	public static int f(int[] p, int n)
	{
		int sum;
		int i;
		int j;
		int min = 0;
		sum = 0;
		{
			for (i = 0;i < n;i++)
			{
				min = p[i];
				{
					for (j = 1;j < n;j++)
					{
					if (*(p[i] + j) < min)
					{
					 min = (p[i] + j);
					}
					}
					for (j = 0;j < n;j++)
					{
					*(p[i] + j) = *(p[i] + j) - min;
					}
				}
			}
		}
		{
			for (j = 0;j < n;j++)
			{
				min = (p[0] + j);
				{
					{
						for (i = 1;i < n;i++)
						{
					if (*(p[i] + j) < min)
					{
						min = (p[i] + j);
					}
						}
				}
					for (i = 0;i < n;i++)
					{
						*(p[i] + j) = *(p[i] + j) - min;
					}
					sum = (p[1] + 1);
				}
			}
			{
				for (i = 1;i < n - 1;i++)
				{
				*(p[0] + i) = *(p[0] + i + 1);
				}
		}
		{
				for (i = 1;i < n - 1;i++)
				{
				for (j = 1;j < n - 1;j++)
				{
					*(p[i] + j) = *(p[i + 1] + j + 1);
				}
				}
		}
		{
				for (i = 1;i < n - 1;i++)
				{
				p[i] = p[i + 1];
				}
		}
				return (sum);
	}
	}
	public static void Main()
	{
		int[] p = new int[100];
		(int)(*q)[100];
		int n;
		int i;
		int j;
		int sum = 0;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int [100])malloc(100 * (Integer.SIZE / Byte.SIZE) * 10000);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						p[k * n + i] + j = tempVar2;
					}
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			sum = 0;
			q = p + k * n;
			{
				for (i = n;i > 1;i--)
				{
				sum = sum + f(q, i);
				}
			}
		   System.out.printf("%d\n",sum);
		}
	}

}

