package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int WN;
		int i;
		WN = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] len = new int[WN];
		char[][] wo = new char[WN][40];
		for (i = 0;i < WN;i++)
		{
			wo[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(wo[i]).length();
		}
		int sum = len[0] + len[1];
		System.out.print(wo[0]);
		for (i = 1;i < WN;i++)
		{
			if (sum < 80)
			{
				System.out.print(" ");
				System.out.print(wo[i]);
				sum = sum + len[i + 1] + 1;
			}
			else
			{
				System.out.print('\n');
				System.out.print(wo[i]);
				sum = len[i] + len[i + 1];
			}
		}
		return 0;
	}


}

