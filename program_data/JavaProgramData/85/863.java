package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int j;
	 int i;
	 int n;
	 int l;
	 int t = 0;
	 char[][] s = new char[10000][20];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s[i] = tempVar2.charAt(0);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  l = String.valueOf(s[i]).length();
	  if ((s[i][0] >= 'a' && s[i][0] <= 'z') || (s[i][0] >= 'A' && s[i][0] <= 'Z') || s[i][0] == '_')
	  {
	   for (j = 1;j < l;j++)
	   {
		if ((s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || s[i][j] == '_' || (s[i][j] >= '0' && s[i][j] <= '9'))
		{
		 t = 0;
		}
		else
		{
		 t = 1;
		 System.out.print("no\n");
		 break;
		}
	   }
	   if (t == 0)
	   {
	   System.out.print("yes\n");
	   }
	  }
	  else
	  {
	   System.out.print("no\n");
	  }
	 }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	  return 0;
	}






}

