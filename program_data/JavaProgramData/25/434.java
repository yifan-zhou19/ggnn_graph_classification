package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] temp = new int[100];
		int[] tag = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		temp[0] = 1;
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 99; j++)
			{
				if (temp[j] * 2 + tag[j] < 10)
				{
					temp[j] = temp[j] * 2 + tag[j];
					tag[j] = 0;
				}
				else
				{
					temp[j] = temp[j] * 2 + tag[j] - 10;
					tag[j] = 0;
					tag[j + 1] = 1;
				}
			}
		}
		for (i = 99; i >= 0; i--)
		{
			if (temp[i] != 0)
			{
				break;
			}
		}
		for (j = i; j >= 0; j--)
		{
			System.out.print(temp[j]);
		}
		System.out.print("\n");
		return 0;
	}

}

