package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 int len;
	 int s1 = 'g';
	 char[][] s = new char[N][32];
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
	  len = String.valueOf(s[i]).length();
	  if (s[i][len - 1] == s1)
	  {
		s[i][len - 3] = 0;
	  }
	  else
	  {
		s[i][len - 2] = 0;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  System.out.printf("%s\n",s[i]);
	 }
	return 0;
	}
}

