package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = char;
		int le = char;
		int n;
		int i;
		int len;
		String str = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		while (n-- != 0)
		{
		  str = new Scanner(System.in).nextLine();
		  len = str.length();
		  if (le(str.charAt(0)) == 0)
		  {
			  System.out.print("0\n");
			  continue;
		  }
			for (i = 0;i < len;i++)
			{
				if ((le(str.charAt(i)) == 0) && (num(str.charAt(i)) == 0))
				{
				  break;
				}
			}
			if (i == len)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
	public static int le(char c)
	{
		if ('a' <= c && c <= 'z')
		{
			return 1;
		}
		else if ('A' <= c && c <= 'Z')
		{
			return 1;
		}
		else if (c == '_')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int num(char c)
	{
		if ('0' <= c && c <= '9')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}

