package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int i;
		int m;
		String a = new String(new char[A]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			m = 0;
			if (a.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				if (s != 0)
				{
					System.out.print(",");
				}
				for (;i < n;i++)
				{


					if (a.charAt(i) == ' ')
					{
						System.out.printf("%d",m);
						s = 1;
						break;
					}
					if (i == n - 1)
					{
						System.out.printf("%d",m + 1);
						s = 1;
						break;
					}
					m++;
				}
			}
		}
		return 0;
	}
}
