package <missing>;

public class GlobalMembers
{
	public static String f = new String(new char[1]);
	public static int Main()
	{
		  String s = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		  int p = 0;
		  int k;
		  int n;
		  int t = 0;
		  n = s.length();
		  s = tangible.StringFunctions.changeCharacter(s, n, 'a');
		  if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z')
		  {
		  f = tangible.StringFunctions.changeCharacter(f, 0, s.charAt(0) + 'A'-'a');
		  }
		  else
		  {
		  f = tangible.StringFunctions.changeCharacter(f, 0, s.charAt(0));
		  }
		  for (k = 1;k <= n;k++)
		  {
						   if (s.charAt(k - 1) >= 'a' && s.charAt(k - 1) <= 'z')
						   {
						   s = tangible.StringFunctions.changeCharacter(s, k - 1, s.charAt(k - 1) + 'A'-'a');
						   }
						   if (s.charAt(k - 1) != s.charAt(p))
						   {
										   System.out.printf("(%s,%d)",f,t);
										   f = tangible.StringFunctions.changeCharacter(f, 0, s.charAt(k - 1));
										   p = k - 1;
										   t = 1;
						   }
						   else
						   {
							   t++;
						   }
						   if (k == n)
						   {
						   System.out.printf("(%s,%d)",f,t);
						   }

		  }
	}

}

