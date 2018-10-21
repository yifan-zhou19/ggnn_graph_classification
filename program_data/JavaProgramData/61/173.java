package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] iNum = new int[n - 1];
		while (i <= (n - 1))
		{
			iNum[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i = i + 1;
		}
		i = 0;
		while (i <= (n - 1))
		{
			int x1 = 1;
			int x2 = 1;
			int x3;
			int j = 3;
			if (iNum[i] <= 2)
			{
				System.out.print(1);
			}
			else
			{
				while (j <= iNum[i])
				{
					x3 = x2 + x1;
					x1 = x2;
					x2 = x3;
					j = j + 1;
				}
				System.out.print(x2);
				System.out.print("\n");
			}
			i = i + 1;
		}
		return 0;
	}

}

