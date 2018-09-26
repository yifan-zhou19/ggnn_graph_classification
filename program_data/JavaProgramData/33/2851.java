package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   char[][] s = new char[n][255];
	   for (i = 0;i < n;i++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  s[i] = tempVar2.charAt(0);
		  }
		  for (j = 0;s[i][j] != '\0';j++)
		  {
			 switch (s[i][j])
			 {
				case 'C':
				   s[i][j] = 'G';
				   break;
				case 'G':
				   s[i][j] = 'C';
				   break;
				case 'A':
				   s[i][j] = 'T';
				   break;
				case 'T':
				   s[i][j] = 'A';
				   break;
			 }
		  }
		  System.out.printf("%s\n",s[i]);
	   }
	   return 0;
	}


}

