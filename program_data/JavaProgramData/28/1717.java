package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[N]);
		int i;
		int j;
		int m;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < N;i++)
		{
			if (s.charAt(i) == '\0')
			{
				break;
			}
		}
		for (m = 0,j = 0;j <= i;j++)
		{
			if (s.charAt(j) != '\0' && s.charAt(j) != ' ')
			{
				m++;
			}
			else if (s.charAt(j) == ' ')
			{
				if (m != 0)
				{
					System.out.printf("%d,",m);
					m = 0;
				}
			}
			else if (s.charAt(j) == '\0')
			{
				System.out.printf("%d",m);
				break;
			}
		}
		return 0;
	}


}
