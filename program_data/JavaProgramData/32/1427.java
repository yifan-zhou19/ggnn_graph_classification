package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int p;
	  int q;
	  int t;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	   scanf("\n");
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  String c = new String(new char[100]);
	  for (i = 0;i <= 99;i++)
	  {
	a = tangible.StringFunctions.changeCharacter(a, i, '\0');
	  }
	 for (i = 0;i <= 99;i++)
	 {
	b = tangible.StringFunctions.changeCharacter(b, i, '\0');
	 }
	  for (i = 1;i <= n;i++)
	  {
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		scanf("\n");
		p = a.length();
		q = b.length();
		for (t = 1;t <= q;t++)
		{
		  if (a.charAt(p - t) >= b.charAt(q - t))
		  {
		  c = tangible.StringFunctions.changeCharacter(c, p - t, a.charAt(p - t) - b.charAt(q - t) + 48);
		  }
		  else
		  {
		  c = tangible.StringFunctions.changeCharacter(c, p - t, a.charAt(p - t) + 58 - b.charAt(q - t));
		  a = tangible.StringFunctions.changeCharacter(a, p - t - 1, a.charAt(p - t - 1) - 1);
		  }
		}
		 for (t = 0;t <= p - q - 1;t++)
		 {
		  c = tangible.StringFunctions.changeCharacter(c, t, a.charAt(t));
		 }
		for (j = 0;j <= p - 1;j++)
		{
		   System.out.printf("%c",c.charAt(j));
		}
	System.out.print("\n");
	  }
	return 0;
	}

}

