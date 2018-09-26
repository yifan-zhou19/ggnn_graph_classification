package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int[] norm = new int[100];
		int[] num = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			num[i] = 0;
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				norm[i] = 1;
			}
			else
			{
				norm[i] = 0;
			}
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = i; j <= n; j++)
			{
				if (norm[j] == 1)
				{
					num[i] = num[i] + 1;
				}
				else
				{
					break;
				}
			}
		}
		for (int i = 2; i <= n - 1; i++)
		{
			num[1] = num[1] >= num[i] != 0? num[1]:num[i];
		}
		System.out.print(num[1]);
		System.out.print("\n");
		return 0;
	}
}

