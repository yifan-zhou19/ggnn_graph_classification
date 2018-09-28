package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int len;
		int[][] b = new int[100][1000];
		int i;
		int j;
		int t;
	   char[][] sen = new char[100][1000];

	   t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	   for (i = 1;i <= t;i++)
	   {
		   sen[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   }

	   for (i = 1;i <= t;i++)
	   {
		 len = String.valueOf(sen[i]).length();

		 for (j = 0;j <= len - 1;j++)
		 {
			 b[i][sen[i][j] - 'a']++;
		 }

		 for (j = 0;j <= len - 1;j++)
		 {
			 if (b[i][sen[i][j] - 'a'] == 1)
			 {
				 System.out.print(sen[i][j]);
				 System.out.print("\n");
				 break;

			 }
		 }
		 if (j == len)
		 {
			 System.out.print("no");
			 System.out.print("\n");
		 }
	   }
	   return 0;
	}

}

