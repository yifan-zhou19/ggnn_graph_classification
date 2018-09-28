package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
	 String head;
	 char c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc((Character.SIZE / Byte.SIZE) * 30);
	 head = p;
	 String tempVar = ConsoleInput.scanfRead(null, 1);
	 if (tempVar != null)
	 {
		 p = tempVar.charAt(0);
	 }
	 while (*p != '\n')
	 {
		 p++,*p = System.in.read();
	 }
	 *p = '\0';
	 p = head;
	 for (; * p != '\0';p++)
	 {
		 if (*p <= '9' && *p >= '0')
		 {
			 System.out.printf("%c",*p);
		 }
	  else if (*(p + 1) < 58 && *(p + 1)>47)
	  {
		  System.out.print('\n');
	  }
	 }
	}
}

