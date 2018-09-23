package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int num;
		int min1 = 2000;
		int min2 = 2000;
		int max1 = -1;
		int max2 = -1;
		int area;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (num == 0)
				{
					if (i < min1)
					{
						min1 = i;
					}
					else if (i > max1)
					{
						max1 = i;
					}
					if (j < min2)
					{
						min2 = j;
					}
					else if (j > max2)
					{
						max2 = j;
					}
				}
			}
		}
		area = (max1 - min1 - 1) * (max2 - min2 - 1);
		System.out.print(area);
		System.out.print("\n");
		return 0;
	}
}

