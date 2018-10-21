package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char x;
		String a = new String(new char[1000]);
		int len;
		int i;
		int count = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = a.length();
		if (a.charAt(0) >= 65 && a.charAt(0) <= 90)
		{
			x = a.charAt(0);
		}
		else
		{
			x = a.charAt(0) - 32;
		}
		System.out.print('(');
		System.out.print(x);
		System.out.print(',');
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == x || a.charAt(i) - 32 == x)
			{
				count++;
			}
			else
			{
				System.out.print(count);
				System.out.print(')');
				count = 1;
				if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
				{
					x = a.charAt(i);
				}
				else
				{
					x = a.charAt(i) - 32;
				}
				System.out.print('(');
				System.out.print(x);
				System.out.print(',');
			}
		}
		System.out.print(count);
		System.out.print(')');
		return 0;
	}


}

