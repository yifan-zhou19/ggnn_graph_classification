package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[20]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String max;
		int i;
		int l;
		while (gets(s))
		{
			p = s;
			max = p;
			l = s.length();
			for (i = 0;i < l - 4;i++)
			{
				if (*(p + i) > max)
				{
					max = p + i;
				}
			}
			for (p = s;p <= max;p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.printf("%c%c%c",s.charAt(l - 3),s.charAt(l - 2),s.charAt(l - 1));
			for (p = max.Substring(1);p < s.charAt(l - 4);p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.print("\n");
		}
	return 0;
	}

}
