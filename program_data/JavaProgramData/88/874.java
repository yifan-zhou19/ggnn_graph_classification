package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		String p;
	  int i;
	  int t;
	  int n;
	  a = new Scanner(System.in).nextLine();
	  n = a.length();
	  p = a.charAt(0);
	  t = 0;
	  for (i = 0;i <= (n - 1);i++)
	  {
			if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57)
			{
				System.out.printf("%c",*(p.Substring(i)));
				t = 0;
			}
			else if (t == 0)
			{
				System.out.print("\n");
				t = 1;
			}
	  }

	}
}
