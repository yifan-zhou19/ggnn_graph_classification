package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[100]);
	  int i;
	  a = new Scanner(System.in).nextLine();
	  int m = a.length();
	  for (i = 0;i < m;i++)
	  {
		if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
		{
		System.out.print("");
		}
		else
		{
			System.out.printf("%c",a.charAt(i));
		}

	  }
	  return 0;
	}

}
