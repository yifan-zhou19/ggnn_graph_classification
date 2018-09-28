package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int a;
	 int j;
	 int b = 1;
	 String p = new String(new char[100]);
	 String m = new String(new char[3]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 m = new Scanner(System.in).nextLine();
	 for (i = 1;i <= n;i++)
	 {
	  p = new Scanner(System.in).nextLine();
	  if ((p.charAt(0) >= 'a' && p.charAt(0) <= 'z') || (p.charAt(0) >= 'A' && p.charAt(0) <= 'Z') || p.charAt(0) == '_')
	  {
		a = 1;
	  }
	  else
	  {
		a = 0;
	  }
	  for (j = 1;p.charAt(j) != '\0';j++)
	  {
		 if ((p.charAt(j) >= 'a' && p.charAt(j) <= 'z') || (p.charAt(j) >= 'A' && p.charAt(j) <= 'Z') || p.charAt(j) == '_' || (p.charAt(j) >= '0' && p.charAt(j) <= '9'))
		 {
		   b = 1;
		 }
		 else
		 {
		   b = 0;
		   break;
		 }
	  }
	  System.out.printf("%d\n",a * b);
	  b = 1;
	 }
	}

}

