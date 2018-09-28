package <missing>;

public class GlobalMembers
{
	public static void nixu(String s)
	{
		int j;
		int k;
		int h;
		int len = s.length();


		if (s[0].equals('-'))
		{
			if (s[1].equals('0'))
			{
				System.out.print("0\n");
			}
		else
		{
			System.out.print("-");
				for (k = 0;k < len;k++)
				{
				 s[k] = s[k + 1];
				}

				nixu(s);
		}
		}
		else if (s[0].equals('0'))
		{
			System.out.print("0\n");
		}
		else if (s[0].compareTo(49) >= 0 && s[0].compareTo(57) <= 0)
		{
				for (h = len - 1;h >= 0;h--)
				{
				if (h == len - 1 && !s[h].equals('0'))
				{
					System.out.printf("%c",s[h]);
				}
			else if (h != len - 1 && (!s[h + 1].equals('0')) || (!s[h].equals('0')))
			{
				System.out.printf("%c",s[h]);
			}
				}
		System.out.print("\n");
		}
	}
	public static int Main()
	{
		int i;
		String a = new String(new char[10]);
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}

		nixu(a);
		}
	return 0;
	}
}

