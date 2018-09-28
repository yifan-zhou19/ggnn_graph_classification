package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] jin = new int[100];
		int[] liu = new int[100];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N == 0)
		{
			System.out.print('1');
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < N;i++) //??? N ?2
			{
				for (j = 0;j < 100;j++)
				{
					b[j] = b[j] * 2;
				}
				for (j = 0;j < 100;j++)
				{
					if (b[j] >= 10)
					{
						b[j + 1] = b[j + 1] + b[j] / 10;
						b[j] = b[j] % 10;
					}
				}
			}
			for (i = 99;i >= 0;i--)
			{
				if (b[i] != 0)
				{
					break;
				}
			}
			for (j = i;j >= 0;j--) //??
			{
				System.out.print(b[j]);
			}
		}
		return 0;
	}
}

