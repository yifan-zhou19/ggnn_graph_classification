package <missing>;

public class GlobalMembers
{
	public static int f(char c)
	{
		if ((c == '_') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
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
		int out;
		String s = new String(new char[100]);
		char r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			r = tempVar2.charAt(0);
		}
		while (n-- != 0)
		{
			s = new Scanner(System.in).nextLine();
			if (f(s.charAt(0)) == 0)
			{
				out = 0;
			}
			else
			{
				for (i = 1;s.charAt(i) != '\0';i++)
				{
					if (!(f(s.charAt(i)) != 0 || (s.charAt(i) >= '0' && s.charAt(i) <= '9')))
					{
						out = 0;
						break;
					}
				}
				if (s.charAt(i) == '\0')
				{
					out = 1;
				}
			}
			System.out.printf("%d\n",out);
		}
		return 0;
	}

}

