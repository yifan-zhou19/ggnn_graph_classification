package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char substr = new char(char s[],int,int);
		char osubstr = new char(char s[],int,int);
		int len;
		int width;
		int m;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (width = 1; width <= len; width++)
		{
			for (m = 0; m <= len - width; m++)
			{
				if (substr(s, m, m + width) != null)
				{
					osubstr(s, m, m + width);
				}
			}
		}
		return 0;
	}

	public static char substr(String s, int start, int end)
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

	public static char osubstr(String s, int start, int end)
	{
		while (start <= end)
		{
			System.out.print(s[start++]);
		}
		System.out.print('\n');
	}
}
