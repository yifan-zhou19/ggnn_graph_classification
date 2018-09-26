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
		 String a = new String(new char[502]);
		 char[][] b = new char[502][6];
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 len = a.length();
		 for (int i = 0; i <= len - n; i++)
		 {
				 for (int j = 0, k = i; j < n; j++, k++)
				 {
						 b[i][j] = a.charAt(k);
				 }
		 }
		 for (int i = 0; i <= len - n; i++)
		 {
				 for (int j = i; j <= len - n; j++)
				 {
						 if (strcmp(b[i], b[j]) == 0)
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

