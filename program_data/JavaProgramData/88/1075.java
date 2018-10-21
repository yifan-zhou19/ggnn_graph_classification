package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[31]);
		int i;
		int t = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 0;s.charAt(i);i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
			  System.out.printf("%c",s.charAt(i));
			  t = 1;

			}
			else
			{
			  t = 0;
			}
			if (t = 1 && s.charAt(i + 1) && (s.charAt(i + 1) < '0' || s.charAt(i + 1)>'9'))
			{
			  System.out.print("\n");
			}

		}
	   return 0;


	}
}
