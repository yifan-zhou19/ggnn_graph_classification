package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[3]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String max;


		while (scanf("%s %s",str,substr) != EOF)
		{
		for (p = str,max = p; * p != '\0';p++)
		{
			if (*p > max)
			{
				max = p;
			}
		}
		for (p = str;p <= max;p++)
		{
			System.out.printf("%c",*p);
		}
		System.out.printf("%s",substr);
		for (p = max.Substring(1); * p != '\0';p++)
		{
			System.out.printf("%c",*p);
		}
		System.out.print("\n");
		}
	}
}
