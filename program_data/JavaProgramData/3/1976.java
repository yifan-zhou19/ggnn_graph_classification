package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //??n?????k?t
		int t = 0;
		int[] num = new int[1000]; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //??n??
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int x = 0; //??break???
		for (int j = 0; j < n; j++)
		{
			for (int k = j + 1; k < n; k++)
			{
				if (num[j] + num[k] == t)
				{
					System.out.print("yes");
					x = x + 1;
					break;
				}
				if (j == n - 2 && k == n - 1)
				{
					System.out.print("no");
				}
			}
			if (x == 1)
			{
				break;
			}
		}
		return 0;
	}
}

