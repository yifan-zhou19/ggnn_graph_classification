package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int max;
		int t;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[5]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String p0;
		while (scanf("%s %s",str1,str2) != EOF)
		{
			n = str1.length();
			p1 = str1;
			max = 0;
			for (;p1 < str1.Substring(n);p1++)
			{
				if (*p1 > max)
				{
					max = p1;
					p0 = p1;
				}
			}
			p2 = str2;
			p1 = str1;
			t = 1;
			for (;p1 < str1.Substring(n);p1++)
			{
				System.out.printf("%c",*p1);
				if (*p1 == max && t != 0)
				{
					System.out.printf("%c%c%c", p2,*(p2.Substring(1)),*(p2.Substring(2)));
					t = 0;
				}
			}
			System.out.print("\n");
		}
	}
}
