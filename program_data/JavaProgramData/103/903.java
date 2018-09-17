package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1001]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = s.length();
		int i = 0;
		int j;
		int k;
		int flag = 0;
		while (i < len)
		{
			flag = 0;
			while (true)
			{
				if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 1) + 32 || s.charAt(i + 1) == s.charAt(i) + 32)
				{
					flag++;
					i++;
				} //??????????
				else
				{
					System.out.print("(");
					System.out.print((char)(s.charAt(i) < 90?s.charAt(i):s.charAt(i) - 32));
					System.out.print(",");
					System.out.print(flag + 1);
					System.out.print(")");
					i++;
					break;
				}
			}
		}
		return 0;
	}

}

