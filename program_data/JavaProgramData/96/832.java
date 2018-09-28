package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int i;
		int j = 0;
		int m;
		int n;
		int k;
		a = new Scanner(System.in).nextLine();
		if (a.length() == 1)
		{
		System.out.printf("0\n%s",a);
		}
		else
		{
		 m = 10 * (a.charAt(0) - '0');
		for (i = 1;i < a.length() - 1;i++)
		{
		   m += a.charAt(i) - '0';
		   if (m < 13)
		   {
				if (i != 1)
				{
				System.out.print("0");
				}
				m = m * 10 + (a.charAt(i + 1) - '0');
				i += 1;
		   }
			n = m / 13;
			System.out.printf("%d",n);
			m = m % 13 * 10;
		}
		if (i == a.length())
		{
			System.out.printf("\n%d",m);
		}
		else
		{
			m += a.charAt(i) - '0';
			if (m >= 13)
			{
			n = m / 13;
			System.out.printf("%d",n);
			m = m % 13;
			System.out.printf("\n%d",m);
			}
			else
			{
				System.out.print("0");
				System.out.printf("\n%d",m);
			}
		}
		}
		return 0;
	}

}
