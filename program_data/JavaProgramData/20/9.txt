package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char ma;
		int i;
		int m;
		while (scanf("%s%s",str,substr) != EOF)
		{

			p = str;
			ma = p;
			m = 0;

			for (i = 0;i < str.length();i++,p++)
			{
				if (*p > ma)
				{
					ma = p;
					m = i;
				}
			}

			p = str;

			for (i = 0;i <= m;i++,p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.printf("%s",substr);
			for (;i < str.length();i++,p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.print("\n");
		}

	}


}
