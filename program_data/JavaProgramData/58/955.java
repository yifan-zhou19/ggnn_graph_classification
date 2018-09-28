package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String s = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				if ((s.charAt(j) == '_') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= '0' && s.charAt(j) <= '9' && j>0))
				{
					;
				}
				else
				{
				break;
				}
			}
			if (s.charAt(j) != null)
			{
			System.out.print("0\n");
			}
			else
			{
			System.out.print("1\n");
			}
		}
	}

}

