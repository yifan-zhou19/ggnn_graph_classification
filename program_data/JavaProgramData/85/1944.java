package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String s = new String(new char[21]);
			s = new Scanner(System.in).nextLine();
			if (1 ^ ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) == '_')))
			{
				System.out.print("no\n");
				continue;
			}
			for (j = 1;j < s.length();j++)
			{
				if (1 ^ ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) == '_')))
				{
					break;
				}
			}
			if (j < s.length())
			{
				System.out.print("no\n");
			}
			  else
			  {
				  System.out.print("yes\n");
			  }
		}
	}
}

