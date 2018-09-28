package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] s1 = new char[1000][256];
	 int n;
	 int l;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (int i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s1[i] = tempVar2.charAt(0);
	  }
	 }
	 for (int m = 0;m < n;m++)
	 {
		 l = String.valueOf(s1[m]).length();
		 s1[m][l] = 0;
	  for (int j = 0;s1[m][j] != 0;j++)
	  {
	   if (s1[m][j] == 'A')
	   {
		s1[m][j] = 'T';
	   }
	   else if (s1[m][j] == 'T')
	   {
		s1[m][j] = 'A';
	   }
	   else if (s1[m][j] == 'C')
	   {
		s1[m][j] = 'G';
	   }
	   else
	   {
		s1[m][j] = 'C';
	   }
	  }
	 }
	 for (int k = 0;k < n;k++)
	 {
	  System.out.printf("%s\n",s1[k]);
	 }
	 return 0;
	}

}

