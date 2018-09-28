package <missing>;

public class GlobalMembers
{
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

	public static void osubstr(String s, int start, int end)
	{
		 while (start <= end)
		 {
			 System.out.print(s[start++]);
		 }
		 System.out.print('\n');
	}
	public static int Main()
	{
		String s = new String(new char[500]);
		int m;
		int n;
		int len;
		int width;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (width = 1; width < len; ++width)
		{
			  for (m = 0; m <= len - width;++m)
			  {
						if (substr(s, m, m + width) != null)
						{
							osubstr(s, m, m + width);
						}
			  }
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}
