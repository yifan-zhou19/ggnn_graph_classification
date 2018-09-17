package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[1000]);
		String = new Scanner(System.in).nextLine();
		int m;
		int i;
		m = 1;
		for (i = 0;(String[i] != '\0');i++)
		{
									  if (String[i] >= 'a')
									  {
										  String[i] = string.charAt(i) + 'A'-'a';
									  }
									  else
									  {
										  ;
									  }
									  if (String[i] == string.charAt(i + 1) || string.charAt(i) == string.charAt(i + 1) + 'A'-'a')
									  {
										  m = m + 1;
									  }
									  else
									  {
										  System.out.printf("(%c,%d)",string.charAt(i),m);
										  m = 1;
									  }
		}
		return 0;
	}
}
