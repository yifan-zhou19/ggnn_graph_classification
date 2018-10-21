package <missing>;

public class GlobalMembers
{
	//***********************************
	//* &sup3;&Igrave;&ETH;�&Atilde;&ucirc;&pound;&ordm;n-gram&acute;&reg;&AElig;&micro;&Iacute;&sup3;&frac14;&AElig;         ** 
	//* ��&Otilde;&szlig;&pound;&ordm;&Agrave;&icirc;&Otilde;&aelig;&Ograve;&raquo; 1300012948        ** 
	//* &Ecirc;�&frac14;&auml;&pound;&ordm;2013.12.13               ** 
	//***********************************
	public static int Main()
	{
		 int[] count = new int[500];
		 int n;
		 int len;
		 int most = 1;
		 int j;
		 String a = new String(new char[502]);
		 char[][] b = new char[502][6];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p;
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 len = a.length();
		 for (int i = 0; i <= len - n; i++)
		 {
				 for (j = 0, p = a.Substring(i); j < n; j++, p++)
				 {
						 b[i][j] = p;
				 }
		 }
		 for (int i = 0; i <= len - n; i++)
		 {
				 for (int m = i; m <= len - n; m++)
				 {
						 if (strcmp(b[i], b[m]) == 0)
						 {
										  count[i]++;
						 }
				 }
		 }
		 for (int i = 0; i <= len - n; i++)
		 {
				 most = most > count[i] != 0 ? most : count[i];
		 }
		 if (most == 1)
		 {
				 System.out.print("NO");
				 System.out.print("\n");
		 }
		 else
		 {
			 System.out.print(most);
			 System.out.print("\n");
			 for (int i = 0; i <= len - n; i++)
			 {
					 if (count[i] == most)
					 {
								 System.out.print(b[i]);
								 System.out.print("\n");
					 }
			 }
		 }
		 return 0;
	}
}

