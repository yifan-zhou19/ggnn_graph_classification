package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
		str = new Scanner(System.in).nextLine();
		int n;
		int i;
		int m;
		n = str.length();
		for (i = 0,m = 0;i < n;i++)
		{
			if (str.charAt(i) != ' ')
			{
				m++;
				if (i == n - 1)
				{
					System.out.printf("%d",m);
				}
			}
			if (str.charAt(i) == ' ')
			{
				if (m != 0)
				{
					System.out.printf("%d,",m);
					m = 0;
				}
			}
		}
		System.out.print("\n");
	}
}
