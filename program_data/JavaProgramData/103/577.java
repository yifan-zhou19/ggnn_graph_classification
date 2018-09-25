package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s1 = new String(new char[1000]);
		  String s2 = new String(new char[1000]);
		  int i;
		  int n;
		  int j;
		  int sum = 1;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s1 = tempVar.charAt(0);
		  }
		  n = s1.length();
		  for (i = 0;i <= n - 1;i++)
		  {
							 if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
							 {
							 s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i) - 32);
							 }
							 if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
							 {
							 s2 = tangible.StringFunctions.changeCharacter(s2, i, s1.charAt(i));
							 }
		  }
							 for (i = 1;i <= n;i++)
							 {

												 if (s2.charAt(i - 1) == s2.charAt(i))
												 {
													  sum = sum + 1;
												 }

													  if (s2.charAt(i - 1) != s2.charAt(i))
													  {
								 System.out.printf("(%c,%d)",s2.charAt(i - 1),sum);
											 sum = 1;
													  }
							 }

	}

}

