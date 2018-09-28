package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int m;
	  int i;
	  int j;
	  int x;
	  int y;
	  int s;
	  String s1 = new String(new char[100]);
	  String s2 = new String(new char[100]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 s1 = tempVar.charAt(0);
	 }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  s2 = tempVar2.charAt(0);
	  }
	  x = s1.length();
	  y = s2.length();
	  if (x == y)
	  {
	for (j = 1;j <= 50;j++)
	{
	  for (i = 0;i <= x - 2;i++)
	  {
		  if (s1.charAt(i) < s1.charAt(i + 1))
		  {
			m = s1.charAt(i);
			s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i + 1));
			s1 = tangible.StringFunctions.changeCharacter(s1, i + 1, m);
		  }
	  }
	}
	for (j = 1;j <= 50;j++)
	{
	 for (i = 0;i <= x - 2;i++)
	 {
		  if (s2.charAt(i) < s2.charAt(i + 1))
		  {
			m = s2.charAt(i);
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i + 1));
			s2 = tangible.StringFunctions.changeCharacter(s2, i + 1, m);
		  }
	 }
	}
	 for (i = 0;i <= x - 1;i++)
	 {
	   if (s1.charAt(i) != s2.charAt(i))
	   {
		   System.out.print("NO");
		   break;
	   }
	   if (i == x - 1)
	   {
		   System.out.print("YES");
	   }
	 }
	  }
	  else
	  {
		  System.out.print("NO");
	  }
	}

}

