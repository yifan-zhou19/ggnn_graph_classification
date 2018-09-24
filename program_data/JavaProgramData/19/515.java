package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[100]);
		char[][] word = new char[50][15];
		String subword = new String(new char[15]);
		String subed = new String(new char[15]);
	 String = new Scanner(System.in).nextLine();
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 subed = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 subword = tempVar2.charAt(0);
	 }
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p = String;
	 int i = 0;
	 int j;
	 while (*p != '\0')
	 {
			sscanf(p,"%s",word[i]);
		 p += String.valueOf(word[i]).length();
		 i++;
		 if (*p == ' ')
		 {
			 p++;
		 }
	 }
	 for (j = 0;j < i;j++)
	 {
		 if (strcmp(word[j],subed) == 0)
		 {
			 word[j] = subword;
		 }
	 }
	 System.out.printf("%s",word[0]);
	 for (j = 1;j < i;j++)
	 {
		 System.out.printf(" %s",word[j]);
	 }
	}

}

