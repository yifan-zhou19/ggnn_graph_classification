package <missing>;

public class GlobalMembers
{
	public static long a;
	public static long b;
	public static long i;
	public static long len;
	public static long j;
	public static long[] h = new long[130];
	public static long[] t = new long[100];
	public static long m;
		public static String s = new String(new char[1000]);
		public static char[] r = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

	public static int Main()
	{
		a = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Long.parseLong(ConsoleInput.readToWhiteSpace(true));
		for (i = '0';i <= '9';i++)
		{
		h[i] = i - 48;
		}
		for (i = 'a';i <= 'z';i++)
		{
		h[i] = i - 87;
		}
		for (i = 'A';i <= 'Z';i++)
		{
		h[i] = i - 55;
		}
		len = s.length();

		m = 0;
		j = 1;
		for (i = len - 1;i >= 0;i--)
		{
				m = m + h[s.charAt(i)] * j;
				j = j * a;
		}
	i = 0;
		while (m > 0)
		{
				i++;
				t[i] = m % b;
				m = m / b;
		}
			  if (i == 0)
			  {
				  System.out.print(0);
				  System.out.print("\n");
			  }
		for (j = i;j > 0;j--)
		{
			System.out.print(r[t[j]]);
		}
		//cin>>i;
			  //if(a!=20&&a!=10&&a!=35&&a!=17)cout << "sb" << endl;
		return 0;
	}

}

