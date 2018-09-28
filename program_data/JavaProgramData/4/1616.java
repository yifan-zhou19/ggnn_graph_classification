package <missing>;

public class GlobalMembers
{
	public static void move1(int[][] p, int m, int n)
	{
		int i;
		int k;
			for (i = 0;i < m - 1;i++)
			{
				for (k = 0;k <= i;k++)
				{
					System.out.printf("%d\n",*(p[0 + k] + i - k));
				}
			}
			for (i = m - 1;i < n - 1;i++)
			{
				for (k = 0;k < m;k++)
				{
					System.out.printf("%d\n",*(p[0 + k] + i - k));
				}
			}
			for (i = 0;i < m;i++)
			{
				for (k = 0;k < m - i;k++)
				{
					System.out.printf("%d\n",*(p[i + k] + n - 1 - k));
				}
			}
	}
	public static void move2(int[][] p, int m, int n)
	{
		int i;
		int k;
			for (i = 0;i < n - 1;i++)
			{
				for (k = 0;k <= i;k++)
				{
					System.out.printf("%d\n",*(p[0 + k] + i - k));
				}
			}
			for (i = 0;i < m - n;i++)
			{
				for (k = 0;k < n;k++)
				{
					System.out.printf("%d\n",*(p[i + k] + n - 1 - k));
				}
			}
			for (i = m - n;i < m;i++)
			{
				for (k = 0;k < m - i;k++)
				{
					System.out.printf("%d\n",*(p[i + k] + n - 1 - k));
				}
			}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[100]={0};
		int[] p = new int[100];
		int[][] head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc(n * (Integer.SIZE / Byte.SIZE));
		}
		head = p;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[i] + j = tempVar3;
		}
			}
		}
		if (m <= n)
		{
			move1(p, m, n);
		}
		else
		{
			move2(p, m, n);
		}
	}
}

