package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int asc;
		int n = 0;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		while (scanf("%s%s",str,substr) != EOF)
		{
			p = str;
			asc = p;
			for (i = 0;i < str.length();i++,p++)
			{
				if (*p > asc)
				{
					asc = p;
					n = i;
				}
			}
			p = str;
			for (i = 0;i <= n;i++)
			{
				System.out.printf("%c",str.charAt(i));
			}
			 System.out.printf("%s",substr);
			 for (i = n + 1;i < str.length();i++)
			 {
				System.out.printf("%c",str.charAt(i));
			 }
	System.out.print("\n");
		}
	}


}
