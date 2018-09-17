package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int l;
		l = a.length();
		int i;
		int n = 1;
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) == a.charAt(i + 1) || a.charAt(i) == a.charAt(i + 1) - 32 || a.charAt(i) == a.charAt(i + 1) + 32)
			{
				n++;
			}
			else
			{
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
				{
					a.charAt(i) -= 32;
				}
				System.out.print("(");
				System.out.print(a.charAt(i));
				System.out.print(",");
				System.out.print(n);
				System.out.print(")");
				n = 1;
			}
		}
		return 0;
	}


}

