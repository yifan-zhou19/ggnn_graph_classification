package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 int p = 0;
	 char[][] s = new char[N][21];
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
	  if ((s[i][0] >= '0') && (s[i][0] <= '9'))
	  {
		System.out.print("no\n");
	  }
	  else
	  {
		  for (k = 0;s[i][k] != 0;k++)
		  {
			 if (((s[i][k] >= 'a') && (s[i][k] <= 'z')) || ((s[i][k] >= 'A') && (s[i][k] <= 'Z')) || ((s[i][k] >= '0') && (s[i][k] <= '9')) || (s[i][k] == '_'))
			 {
			  p = 1;
			 }
			 else
			 {
				 System.out.print("no\n");
				 break;
			 }

		  }
	  if (s[i][k] == 0)
	  {
		System.out.print("yes\n");
	  }
	  }
	 }
	return 0;
	}
}

