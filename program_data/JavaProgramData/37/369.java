package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t;
		int i;
		int j;
		int[][] num = new int[100][26];
	 char[][] a = new char[100][10000];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < t;i++)
	 {
		 for (j = 0;;j++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 a[i][j] = tempVar2.charAt(0);
			 }
	 if (a[i][j] == '\n')
	 {
		 break;
	 }
		 }
	 }
	 for (i = 0;i < t;i++)
	 {
		 {
			 for (j = 0;;j++)
			 {
			 if (a[i][j] != '\n')
			 {
			 num[i][a[i][j] - 'a']++;
			 }
			 else
			 {
				 break;
			 }
			 }
	 }
	   for (j = 0;;j++)
	   {
		   if (a[i][j] != '\n')
		   {
			   if (num[i][a[i][j] - 'a'] == 1)
			   {
				   System.out.printf("%c\n",a[i][j]);
				   break;
			   }
		   }
		   else
		   {
			   break;
		   }
	   }
		   if (a[i][j] == '\n')
		   {
			   System.out.print("no\n");
		   }
	 }
	}





}

