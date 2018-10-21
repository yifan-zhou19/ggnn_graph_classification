package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] str1 = new char[100][100];
	   final String str2 = "";
	   int i;
	   int j;
	   int k;
	   int l1;
	   int l2;
	   int[] t = new int[100];
	   int l;
	   for (i = 0;i < 100;i++)
	   {
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   str1[i] = tempVar.charAt(0);
		   }
		   k = String.valueOf(str1[i]).length();
		   if (k == 0)
		   {
			   break;
		   }
		   System.out.println(str1[i]);
		   l1 = 0;
		   l2 = 0;
		   for (j = 0;j < k;j++)
		   {
			   if (str1[i][j] == ')')
			   {
				   t[l2] = j;
				   l2++;
			   }
		   }
		   for (l = 0;l < l2;l++)
		   {
			   for (j = t[l];j >= 0;j--)
			   {
				  if (str1[i][j] == '(')
				  {
					  str1[i][t[l]] = 'A';
					  str1[i][j] = 'A';
					  break;
				  }
			   }
		   }
		   for (j = 0;j < k;j++)
		   {
			   if (str1[i][j] == '(')
			   {
				   str2.charAt(i)[j] = '$';
			   }
		   else if (str1[i][j] == ')')
		   {
			   str2.charAt(i)[j] = '?';
		   }
		   else
		   {
			   str2.charAt(i)[j] = ' ';
		   }
		   }
		   System.out.println(str2.charAt(i));
	   }
	   return 0;
	}
}

