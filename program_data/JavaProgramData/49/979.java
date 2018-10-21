package <missing>;

public class GlobalMembers
{
	public static char[][][] str = new char[510][510][510];


	public static int huiwen(String c1)
	{
	   int n;
	   int l;
	   String c2 = new String(new char[510]);
	   n = c1.length();
	   for (l = 0;l < n;l++)
	   {
		 c2 = tangible.StringFunctions.changeCharacter(c2, l, c1[n - 1 - l]);
	   }
	   c2 = tangible.StringFunctions.changeCharacter(c2, n, '\0');
	   if (strcmp(c1,c2) == 0)
	   {
		 return 1;
	   }
	   else
	   {
		 return 0;
	   }
	}
	public static int Main()
	{
	   String s = new String(new char[510]);
	   int i;
	   int j;
	   int k;
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   s = tempVar.charAt(0);
	   }
	   n = s.length();
	   for (i = 2;i <= n;i++)
	   {
		 for (j = 0;j < n - i + 1;j++)
		 {
		   for (k = 0;k < i;k++)
		   {
			  str[i][j][k] = s.charAt(j + k);
		   }
		 }
	   }
	   for (i = 2;i <= n;i++)
	   {
		 for (j = 0;j < n - i + 1;j++)
		 {
			 if (huiwen(str[i][j]) != 0)
			 {
				System.out.printf("%s\n",str[i][j]);
			 }
		 }
	   }
	   return 0;
	}
}

