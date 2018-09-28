package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d = 0;
		int t = 0;
		String s = new String(new char[40]);
		String s0 = new String(new char[40]);
		final String s1 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		d = s.length();
		s1 += s;
		for (i = 0;i < n - 1;i++)
		{
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  s = tempVar3.charAt(0);
		  }
		  for (j = 0;s.charAt(j) != '\0';j++)
		  {
		   s0 = tangible.StringFunctions.changeCharacter(s0, t, s.charAt(j));
		   t++;
		  }
		  d = d + s.length() + 1;
		  if (d <= 80)
		  {
			  s0 = tangible.StringFunctions.changeCharacter(s0, t, '\0');
			  s1 += " ";
			  s1 += s0;
		  }
		  if (d > 80)
		  {
			   s0 = tangible.StringFunctions.changeCharacter(s0, t, '\0');
			   s1 += "\n";
			   s1 += s0;
			   d = s0.length();
		  }
		   t = 0;

		}
		System.out.println(s1);
		return 0;
	}




}

