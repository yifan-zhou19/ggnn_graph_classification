package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int t;
	 int i;
	 int j;
	 int k;
	 int c = 0;
	 int m;
	 int p;
	 int q;
	 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 String a = new String(new char[100001]);
	 for (k = 0;k <= t;k++)
	 {
		 for (i = 0;i <= 100000;i++)
		 {
		  a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
	   if (a.charAt(i) == '\0' || a.charAt(i) == '\n')
	   {
		   m = i - 1;
		break;
	   }
		 }
	  for (i = 0;i <= m;i++)
	  {
		  p = 0;
	   for (j = 0;j <= m;j++)
	   {
		   if (a.charAt(j) == a.charAt(i))
		   {
			p = p + 1;
		   }
	   }
	   if (p == 1)
	   {
		   System.out.print(a.charAt(i));
		   System.out.print("\n");
		c = c + 1;
		break;
	   }
	   if (i == m && p != 1)
	   {
		   System.out.print("no");
		   System.out.print("\n");
		c = c + 1;
		break;
	   }
		c = c + 1;
	  }
	 }
	return 0;
	}
}

