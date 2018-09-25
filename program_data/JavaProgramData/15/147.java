package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] tumor = new int[100][100];
		int n;
		int i;
		int j;
		int a;
		int b;
		int sum;
		a = 0;
		b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				tumor[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{

				if (tumor[i][j] == 0)
				{
					a++;
				}
			}
				if (a != 0)
				{
					break;
				}
				else if (a == 0)
				{
					continue;
				}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				if (tumor[i][j] == 0)
				{
					b++;
				}
			}
			if (b != 0)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		sum = (a - 2) * (b - 2);
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

