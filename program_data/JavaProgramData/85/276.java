package <missing>;

public class GlobalMembers
{
	public static int first(char x)
	{
		if (x == '_' || (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z'))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int term(char x)
	{
		if (x == '_' || (x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x >= '0' && x <= '9'))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		String ch = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
			t = 1;
			if (first(ch.charAt(0)) == 0)
			{
				System.out.print("no\n");
			}
			else
			{
				for (j = 1;j < ch.length();j++)
				{
					if (term(ch.charAt(j)) == 0)
					{
						t = 0;
						break;
					}
				}
				if (t == 1)
				{
					System.out.print("yes\n");
				}
				else
				{
					System.out.print("no\n");
				}
			}
		}
		return 0;
	}
}

