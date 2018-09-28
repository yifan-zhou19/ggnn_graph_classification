package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static int Main()
	{
		int T;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			T = Integer.parseInt(tempVar);
		}
		while (T-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			if (Character.isLetter(s.charAt(0)) || s.charAt(0) == '_')
			{
				for (i = 1;s.charAt(i);i++)
				{
					if (!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && s.charAt(i) != '_')
					{
						break;
					}
				}
				if (s.charAt(i) != null)
				{
					System.out.println("no");
				}
				else
				{
					System.out.println("yes");
				}
			}
			else
			{
				System.out.println("no");
			}
		}
	}
}

