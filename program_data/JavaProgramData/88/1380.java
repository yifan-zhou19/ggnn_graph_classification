package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int sign1;
		int sign2;
		String s = new String(new char[30]);
		s = new Scanner(System.in).nextLine();
		m = s.length();
		sign1 = 0;
		sign2 = 0;
		for (i = 0;i < m;i++)
		{
		  if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
		  {
		  System.out.printf("%c",s.charAt(i));
		  }
		  else if (s.charAt(i) < '0' || s.charAt(i)>'9')
		  {
			if (s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9')
			{
			System.out.print("\n");
			}
		  }


		}
		  return 0;
	}


}
