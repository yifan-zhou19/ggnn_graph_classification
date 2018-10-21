package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] point = new int[number][number];
		int n;
		int s;
		int sum;
		int result;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					point[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0; i < n;)
		{
			for (j = 0; j < n; j++)
			{
				if (point[i][j] == 0)
				{
					a = a + 1;
				}
			}
			if (a != 0)
			{
				break;
			}
			else
			{
				i++;
			}
		}
		for (j = 0; j < n;)
		{
			for (i = 0; i < n; i++)
			{
				if (point[i][j] == 0)
				{
					b = b + 1;
				}
			}
			if (b != 0)
			{
				break;
			}
			else
			{
				j++;
			}
		}
		sum = 2 * (a + b - 2);
		s = a * b;
		result = s - sum;
		System.out.printf("%d\n", result);
		return 0;
	}
}

