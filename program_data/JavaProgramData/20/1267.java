package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int k;
	 int n = 0;
	 int max;
	 char[][] s = new char[100][11];
	 char[][] sb = new char[100][4];
	 while (scanf("%s%s",s[n],sb[n]) != EOF)
	 {
		 n++;
	 }
	 for (i = 0;i < n;i++)
	 {
		  max = 0;
	   for (j = 0;j < String.valueOf(s[i]).length();j++)
	   {
		   if (s[i][j] > max)
		   {
			   max = s[i][j];
		   }
	   }
	   for (j = 0;j < String.valueOf(s[i]).length();j++)
	   {
		   if (s[i][j] == max)
		   {
		   for (k = 0;k <= j;k++)
		   {
			   System.out.printf("%c",s[i][k]);
		   }
		for (k = 0;k < String.valueOf(sb[i]).length();k++)
		{
			System.out.printf("%c",sb[i][k]);
		}
		for (k = j + 1;k < String.valueOf(s[i]).length();k++)
		{
			System.out.printf("%c",s[i][k]);
		}
	   System.out.print("\n");
	   break;
		   }
	   }
	 }
	}

}
