package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		String str = new String(new char[300]);
		char i;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		for (ps = str; * ps != '\0';ps++)
		{
			 if (*ps >= 'a' && *ps <= 'z')
			 {
			 count++;
			 }
		}
			 if (count == 0)
			 {
			 System.out.print("No");
			 }
			 else
			 {
				 for (i = 'a';i <= 'z';i++)
				 {
					 count = 0;
					 for (ps = str; * ps != '\0';ps++)
					 {
					 if (*ps == i)
					 {
					 count++;
					 }
					 }
					 if (count != 0)
					 {
					 System.out.printf("%c=%d\n",i,count);
					 }
				 }
			 }

	}
}

