package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
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
			if (k < str.length())
			{
				for (p = str.Substring(k) + 1; * p != '\0';p++)
				{
					System.out.printf("%c",*p);
				}
				System.out.print("\n");
			}
			else
			{
				System.out.print("\n");
			}
		}
	}

}
