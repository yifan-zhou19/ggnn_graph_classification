package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int times;
		int m;
		int n;
		int i;
		int j;
		int k;
		times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = times;
		while (m-- != 0)
		{
			n = times;
			int[] p = array;
			for (i = 0;i < times;i++)
			{
				for (j = 0;j < times;j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			int sum = 0;
			for (k = 1;k <= times - 1;k++)
			{
				int min;
				int now;
				for (i = 0;i < n;i++)
				{
					min = (p[i]);
					for (j = 1;j < n;j++)
					{
						now = (p[i] + j);
						if (now < min)
						{
							min = now;
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
					for (i = 1;i < n;i++)
					{
						now = (p[i] + j);
						if (now < min)
						{
							min = now;
						}
					}
					for (i = 0;i < n;i++)
					{
						*(p[i] + j) = *(p[i] + j) - min;
					}
				}
				sum = sum + (*(p[1] + 1));
				if (n == 2)
				{
					break;
				}
				for (i = 2;i < n;i++)
				{
					for (j = 0;j < n;j++)
					{
						*(p[i - 1] + j) = *(p[i] + j);
					}
				}
				for (j = 2;j < n;j++)
				{
					for (i = 0;i < n - 1;i++)
					{
						*(p[i] + j - 1) = *(p[i] + j);
					}
				}
				n--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

