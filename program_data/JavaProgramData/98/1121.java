package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] paper = new char[500][50];
		for (int i = 0 ; i < n ; i++)
		{
			* (paper + i) = ConsoleInput.readToWhiteSpace(true);
		}
		int l = 81;
		for (int i = 0 ; i < n ; i++)
		{
			if (l + String.valueOf(* (paper + i)).length() + 1 <= 80) //???????
			{
				System.out.print(' ');
				System.out.print((paper + i));
				l = l + String.valueOf(* (paper + i)).length() + 1;
			}
			else //???????
			{
				System.out.print("\n");
				System.out.print((paper + i));
				l = String.valueOf(* (paper + i)).length();
			}
		}

		return 0;
	}
	// ( > w < ) finished~
}

