package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[50]);
		String substr = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
	 int i;
	 int len;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 substr = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 str = tempVar2.charAt(0);
	 }
	 len = substr.length();
	 p = str;
	 while (*p != '\0')
	 {
			int flag = 1;
		 for (i = 0;i < len;i++)
		 {
			 if (*(p + i) != substr.charAt(i))
			 {
				 flag = 0;
			 }
		 }
		 if (flag == 1)
		 {
			 break;
		 }
		 p++;
	 }
	 System.out.printf("%d",p - str);
	}

}

