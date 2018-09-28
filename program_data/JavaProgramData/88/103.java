package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int s;
		int e;
		int n;
		String a = new String(new char[30]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (s = 0;s < n;s++)
		{
			if ((s == 0 && a.charAt(s) <= '9' && a.charAt(s) >= '0') || (a.charAt(s) <= '9' && a.charAt(s) >= '0') && (a.charAt(s - 1) > '9' || a.charAt(s - 1) < '0'))
			{
				e = s;
				while (e != n)
				{
					if (a.charAt(e+1) > '9' || a.charAt(e+1) < '0')
					{
						break;
					}
					e++;
				}
				for (i = s;i <= e;i++)
				{
					System.out.printf("%c",a.charAt(i));
				}
				System.out.print("\n");
			}
		}
		return 0;
	}
}
