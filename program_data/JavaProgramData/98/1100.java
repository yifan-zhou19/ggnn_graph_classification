package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num = 0;
		int l;
		int j;
		String a = new String(new char[40]);
		String p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a, 40, '\0');
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = a.length();
			a = tangible.StringFunctions.changeCharacter(a, l, '\t');
			p = a;
			if (num + l <= 80)
			{
				if (num > 0)
				{
					System.out.print(" ");
				}
				for (i = 0; a.charAt(i) != '\t'; i++)
				{
					System.out.print((p.Substring(i)));
				}
				num += l + 1;
			}
			else
			{
				num = 0;
				System.out.print("\n");
				for (i = 0; i < l; i++)
				{
					System.out.print((p.Substring(i)));
				}
				num += l + 1;
			}
			n--;
		}
		return 0;
	}
}

