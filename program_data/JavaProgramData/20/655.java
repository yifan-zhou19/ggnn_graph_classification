package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[5]);
		while (scanf("%s %s", str, substr) != EOF)
		{
			int k = 0;
			int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * p;
			char max;
			for (p = str,max = str.charAt(0); * p != '\0';p++,i++)
			{
				if (*p > max)
				{
					max = p,k = i;
				}
			}
			for (p = str;p <= (str.Substring(k));p++)
			{
				System.out.printf("%c",*p);
			}
			System.out.printf("%s",substr);
			for (p = str.Substring(k) + 1; * p != '\0';p++)
			{
				System.out.printf("%c",*p);
			}
				System.out.print("\n");
		}
	}
}
