package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String start;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * space;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pri;
		str1 = new Scanner(System.in).nextLine();
		start = str1 - 1;
		for (space = str1 + str1.length() - 1;space >= start;space--)
		{
			if (*space == ' ')
			{
				for (pri = space+1;(*pri != ' ') && (pri != str1 + str1.length());pri++)
				{
				   System.out.printf("%c",*pri);
				}
				System.out.print(" ");
			}
			if (space == start)
			{
				for (pri = space+1;(*pri != ' ') && (pri != str1 + str1.length());pri++)
				{
				   System.out.printf("%c",*pri);
				}
			}
		}
	}
}
