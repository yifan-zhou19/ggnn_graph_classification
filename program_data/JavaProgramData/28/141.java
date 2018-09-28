package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
	 int[] count = new int[300];
	 int i = 0;
	 int j = 0;
	 String = new Scanner(System.in).nextLine();
	 p = String;
	 char[][] word = new char[300][20];
	 do
	 {
			while (*p == ' ')
			{
				p++;
			}
		 word[i][j] = p;
		 p++;
		 j++;
		 if (*p == ' ' || *p == '\0')
		 {
				count[i] = j;
			 i++;
			 j = 0;
		 }
	 }while (*p != null);
	 System.out.printf("%d",count[0]);
	 for (j = 1;j < i;j++)
	 {
		 System.out.printf(",%d",count[j]);
	 }
	}
}
