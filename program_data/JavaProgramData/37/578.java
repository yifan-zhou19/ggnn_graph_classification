package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int t;
	 int i;
	 int j;
	 int k;
	 int l;
	 int p;
	 int q;
	 char[][] s = new char[100][100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 t = Integer.parseInt(tempVar);
	 }
	 for (k = 0;k < t;k++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[k] = tempVar2.charAt(0);
	  }
	 }
	 for (k = 0;k < t;k++)
	 {
	  l = String.valueOf(s[k]).length();
	  for (i = 0;i < l;i++)
	  {
	   q = 0;
	   for (j = 0;j < l;j++)
	   {
		p = 0;
		if (s[k][i] == s[k][j] && j != i)
		{
		 p = 1;
		 break;
		}
	   }
	   if (p == 0)
	   {
		 System.out.printf("%c\n",s[k][i]);
		 q = 1;
		 break;
	   }
	  }
	  if (q == 0)
	  {
		System.out.print("no\n");
	  }
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

