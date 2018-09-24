package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s1 = new String(new char[MAX]);
	  String s2 = new String(new char[MAX]);
	  s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	  int l1 = s1.length();
	  int l2 = s2.length();
	  int g = 0;
	  String ans = new String(new char[2 * MAX]);
	  int iter;
	  for (iter = 0;g || iter < Math.max(l1,l2);iter++)
	  {
		int p1 = 0;
		int p2 = 0;
		if (iter < l1)
		{
			p1 = s1.charAt(l1 - iter - 1) - '0';
		}
		if (iter < l2)
		{
			p2 = s2.charAt(l2 - iter - 1) - '0';
		}
		int sum = p1 + p2 + g;
		ans = tangible.StringFunctions.changeCharacter(ans, iter, sum % 10 + '0');
		g = sum / 10;
	  }
	  int ok = 0;
	  for (int i = 0;i < iter;i++)
	  {
		if (!(ans.charAt(iter - i - 1) == '0' && ok == 0 && iter != 1))
		{
		  System.out.print(ans.charAt(iter - i - 1));
		  if (ok == 0)
		  {
			  ok = 1;
		  }
		}
	  }
	  return 0;
	}

}

