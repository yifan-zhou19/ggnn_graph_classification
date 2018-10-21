package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = ""; //???????
		int i = 0;
		int j = 0;
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			*(a.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
		}
		int sum = 0;
		for (i = 0; i < n; i++)
		{
			if (sum == 0) //?????????
			{
				System.out.print((a.Substring(i)));
				sum = sum + String.valueOf(*(a.Substring(i))).length();
			}
			else if (sum == 80) //??????80???
			{
				System.out.print("\n");
				sum = 0;
				i--;
			}
			else if (sum + String.valueOf(*(a.Substring(i))).length() >= 80) //?????????????80
			{
				System.out.print("\n");
				sum = 0;
				i--;
			}
			else //?????
			{
				System.out.print(' ');
				System.out.print((a.Substring(i)));
				sum = sum + String.valueOf(*(a.Substring(i))).length() + 1;
			}
		}

		return 0;
	}
}

