package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int line;
		int x;
		int l;
		int i;
		String a = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (line = 1;line <= N;line++)
		{
			a = new Scanner(System.in).nextLine();
			l = a.length();
			if ((a.charAt(0) == '_') || (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') || (a.charAt(0) >= 'a' && a.charAt(0) <= 'z'))
			{
				for (i = 1;i < l;i++)
				{
					if ((a.charAt(i) == '_') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') || (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= '0' && a.charAt(i) <= '9'))
					{
						x = 1;
					}
					else
					{
						x = 0;
						break;
					}
				}

				if (x == 1)
				{
				System.out.print("yes\n");
				}
				else if (x == 0)
				{
				System.out.print("no\n");
				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

}

