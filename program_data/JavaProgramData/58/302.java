package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
	 int k;
	 int m;
	 for (k = 0;k <= 9;k++)
	 {
		 if (x == k)
		 {
	  break;
		 }
	 }
	  if (k > 9)
	  {
		  m = 0;
	  }
	  else
	  {
		  m = 1;
	  }
	  return m;
	}
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int l;
	 String a = new String(new char[80]);
	 String b = new String(new char[5]);
	 b = new Scanner(System.in).nextLine();
	 n = Integer.parseInt(b);
	 for (j = 0;j < n;j++)
	 {
	  a = new Scanner(System.in).nextLine();
	  l = a.length();


	  if ((a.charAt(0) == '_') || ((a.charAt(0) >= 'A') && (a.charAt(0) <= 'Z')) || ((a.charAt(0) >= 'a') && (a.charAt(0) <= 'z')))
	  {
	  for (i = 1;i < l;i++)
	  {
		  if ((a.charAt(i) == '_') || ((a.charAt(i) >= 'A') && (a.charAt(i) <= 'Z')) || ((a.charAt(i) >= 'a') && (a.charAt(i) <= 'z')))
		  {
		 continue;
		  }
		 else if (f(a.charAt(i) - '0') == 1)
		 {
		 continue;
		 }
		 else
		 {
			 break;
		 }
	  }
	  if (i == l || i == l + 1)
	  {
	  System.out.print("1\n");
	  }
	  else
	  {
	  System.out.print("0\n");
	  }
	  }
	  else
	  {
	  System.out.print("0\n");
	  }
	 }

	  System.in.read();
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}

}
