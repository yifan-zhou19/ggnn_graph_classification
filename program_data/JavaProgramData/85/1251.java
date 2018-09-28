package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zz = new String(new char[100]);
		int n;
		int l;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.in.read();
		while (n-- != 0)
		{
			zz = new Scanner(System.in).nextLine();
			l = zz.length();
			for (i = 0 ; i < l ; i++)
			{
				if (zz.charAt(i) >= 'a' && zz.charAt(i) <= 'z' || zz.charAt(i) >= '0' && zz.charAt(i) <= '9' || zz.charAt(i) >= 'A' && zz.charAt(i) <= 'Z' || zz.charAt(i) == '_')
				{
					;
				}
				else
				{
					break;
				}
			}
			if (zz.charAt(0) >= '0' && zz.charAt(0) <= '9')
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else if (i == l)
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
	}




}

