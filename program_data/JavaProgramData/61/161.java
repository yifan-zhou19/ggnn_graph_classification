package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a0 = 1;
		int a1 = 1;
		int a3 = 0;
		int i = 0;
		int[] num = new int[10];
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a1 = 1;
			a0 = 1;
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (num[i] > 2)
			{
				for (j = 0;j < (num[i] - 2);j++)
				{
						a3 = a0 + a1;
						a0 = a1;
						a1 = a3;
				}
				System.out.print(a1);
				System.out.print("\n");
			}
			if (num[i] == 1 || num[i] == 2)
			{
				System.out.print(a1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

