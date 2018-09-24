package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		char[][] s = new char[100000][81];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n + 1;i++)
		{
		  s[i] = new Scanner(System.in).nextLine();
		}
		for (i = 1;i < n + 1;i++)
		{
		 if (s[i][0] != '_' && (s[i][0] < 'A' || s[i][0]>'Z') && (s[i][0] < 'a' || s[i][0]>'z'))
		 {
		 System.out.print("0\n");
		 }
		else
		{
		   l = 0;
		 for (j = 1;s[i][j] != '\0';j++)
		 {
		   if (s[i][j] != '_' && (s[i][j] < 'A' || s[i][j]>'Z') && (s[i][j] < 'a' || s[i][j]>'z') && (s[i][j] < '0' || s[i][j]>'9'))
		   {
			l++;
		   }
		 }
		  if (l == 0)
		  {
		   System.out.print("1\n");
		  }
		 else
		 {
		  System.out.print("0\n");
		 }
		}

		}
	  System.in.read();
	  System.in.read();
	}


}

