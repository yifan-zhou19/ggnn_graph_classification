package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[500]);

	public static int substr(String s, int start, int end)
	{
		while ((end > start) && (s[start].equals(s[end])))
		{
			start++;
			end--;
		}
		if (end > start)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static void osubstr(String s, int start, int end)
	{
		int i;
		for (i = start;i <= end;i++)
		{
			System.out.print(s[i]);
		}
		System.out.print('\n');
	}

	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int m,n,width;
		int m;
		int n;
		int width;
		s = new Scanner(System.in).nextLine();
		for (width = 1; width < s.length(); width++)
		{
			for (m = 0; m <= s.length() - width;m++)
			{
				if (substr(s, m, m + width) != 0)
				{
					osubstr(s, m, m + width);
				}
			}
		}
	}
}
