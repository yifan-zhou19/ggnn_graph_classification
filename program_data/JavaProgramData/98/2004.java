package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] s = new char[1000][40];
	 int n;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 System.in.read();
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s[i] = tempVar2.charAt(0);
		 }
		 System.in.read();
	 }
	  int h = String.valueOf(s[0]).length();
	  System.out.printf("%s",s[0]);
	  for (i = 1;i < n;i++)
	  {
		 h += String.valueOf(s[i]).length() + 1;
		 if (h <= 80)
		 {
			   System.out.printf(" %s",s[i]);
			   System.in.read();
		 }
		 else
		 {
			   h = String.valueOf(s[i]).length();
			   System.out.print("\n");
			   System.in.read();
			   System.out.printf("%s",s[i]);
		 }
	  }
		return 0;
	}
}

