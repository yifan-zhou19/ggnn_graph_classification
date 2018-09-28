package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String a = new String(new char[30]); //??????????????
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //???????
		{
			n = a.length(); //?????
			for (i = 0;i < n;i++) //???
			{
				if (a.charAt(i) == '1' || a.charAt(i) == '0' || a.charAt(i) == '2' || a.charAt(i) == '3' || a.charAt(i) == '4' || a.charAt(i) == '5' || a.charAt(i) == '6' || a.charAt(i) == '7' || a.charAt(i) == '8' || a.charAt(i) == '9')
				{
						System.out.print(a.charAt(i));
				}
				else
				{
						if (a.charAt(i - 1) == '1' || a.charAt(i - 1) == '0' || a.charAt(i - 1) == '2' || a.charAt(i - 1) == '3' || a.charAt(i - 1) == '4' || a.charAt(i - 1) == '5' || a.charAt(i - 1) == '6' || a.charAt(i - 1) == '7' || a.charAt(i - 1) == '8' || a.charAt(i - 1) == '9')
						{
							System.out.print("\n");
						}
				}
			}
		}
		return 0;
	}
}

