package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int l;
	 char[][] s = new char[1000][100];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= n;i++)
	 {
	  s[i] = new Scanner(System.in).nextLine();
	 }
	 for (i = 1;i <= n;i++)
	 {
	  k = 0;
	  l = String.valueOf(s[i]).length();
	  if (s[i][0] <= '9' && s[i][0] >= '0')
	  {
	   System.out.print("0\n");
	  }
	  else
	  {
	   for (j = 0;j < l;j++)
	   {
		if (s[i][j] >= 'a' && s[i][j] <= 'z' || s[i][j] >= 'A' && s[i][j] <= 'Z' || s[i][j] >= '0' && s[i][j] <= '9' || s[i][j] == '_')
		{
		  k = 0;
		}
		else
		{
		 k = 1;
		 System.out.print("0\n");
		 break;
		}
	   }
	   if (k == 0)
	   {
		System.out.print("1\n");
	   }
	  }
	 }
	 System.in.read();
	 System.in.read();
	 return 0;
	}

}

