package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10]);
		String substr = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char t;
		int i;
		int j;
		int k;
		while (scanf("%s%s",str,substr) != EOF)
		{
			p = str;
			t = p;
			j = 0;
			k = str.length();
			for (i = 0;i < k;i++,p++)
			{
				if (*p > t)
				{
					t = p;
					j = i;
				}
			}

			for (p = str,i = 0;i < j + 1;i++,p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.printf("%s",substr);
			for (i = j + 1;i < k;i++,p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.print("\n");
		}
	}

}
