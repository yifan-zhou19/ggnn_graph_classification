package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[100][100];
	public static int n;
	public static int count1 = 0;
	public static int[] p = null;
	public static int deal()
	{
		int min;
		int i;
		int j;
		int k;
		for (k = 0;k < n - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
				min = (p[i]);
				for (j = 0;j < n;j++)
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
			for (j = 0;j < n;j++)
			{
				min = (p[0] + j);
				for (i = 0;i < n;i++)
				{
					if (*(p[i] + j) < min)
					{
						min = (p[i] + j);
					}
				}
				for (i = 0;i < n;i++)
				{
					*(p[i] + j) = *(p[i] + j) - min;
				}
			}
			count1 += *(p[1] + 1);
			for (i = 1;i < n - 1;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(p[i] + j) = *(p[i + 1] + j);
				}
			}
			for (j = 1;j < n - 1;j++)
			{
				for (i = 0;i < n;i++)
				{
					*(p[i] + j) = *(p[i] + j + 1);
				}
			}
		}
		System.out.print(count1);
		System.out.print("\n");
		return 0;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = a;
		for (k = 0;k < n;k++)
		{
			count1 = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			deal();
		}
	return 0;
	}
}

