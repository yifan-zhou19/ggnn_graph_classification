package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
	 String a = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
	 String head;
	 p = a;
	 head = a;
	 a = new Scanner(System.in).nextLine();
	 i = a.length();

	 for (p = a;p < a.Substring(i) - 1;p++)
	 {
								System.out.printf("%c",*p + *(p + 1));
	 }
	 System.out.printf("%c",*p + head);
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   i = Integer.parseInt(tempVar);
	   }
	return 0;
	}

}

