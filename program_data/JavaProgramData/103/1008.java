package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[1000]);
	  int i;
	  int n = 1;
	  s = new Scanner(System.in).nextLine();
	  if (s.charAt(0) >= 'a')
	  {
		  s.charAt(0) += 'A'-'a';
	  }
	  for (i = 1;s.charAt(i);i++)
	  {
		if (s.charAt(i) >= 'a')
		{
			s.charAt(i) += 'A'-'a';
		}
		if (s.charAt(i) == s.charAt(i - 1))
		{
			n++;
		}
		else
		{
		  System.out.printf("(%c,%d)",s.charAt(i - 1),n);
		  n = 1;
		}
	  }
	  System.out.printf("(%c,%d)",s.charAt(i - 1),n);
	}
}
