package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[200]);
	public static String b = new String(new char[200]);
	public static void Main()
	{
		 a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * q = b;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }

		 int n = a.length();
		 b = tangible.StringFunctions.changeCharacter(b, n, '\0');

		 for (p = a;p < a.Substring(n) - 1;p++)
		 {
						   *q = p + *(p + 1);
						   q++;
		 }
		 *q = a + *p;
		 System.out.printf("%s",b);

	}

}

