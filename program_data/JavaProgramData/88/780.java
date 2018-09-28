package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		 q = p;
		 q = new Scanner(System.in).nextLine();
		 for (q = p; * q != '\0';q++)
		 {
							  if (*q >= 48 && *q <= 57)
							  {
								  continue;
							  }
							  else
							  {
								  *q = '*';
							  }
		 }
		 for (q = p; * q != '\0';q++)
		 {
							  if (*q != '*')
							  {
								  System.out.printf("%c",*q);
							  }
							  if (*q == '*' && *(q + 1) != '*')
							  {
								  System.out.print("\n");
							  }
		 }


	}

}
