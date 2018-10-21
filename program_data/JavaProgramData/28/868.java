package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		int i;
		int n;
		int m = 0;
		int n1 = 0;
		int n2 = 0;
		for (i = 0;s.charAt(i) != ' ' && s.charAt(i) != '\0';i++)
		{
			m = i + 1;
		}
		System.out.printf("%d",m);
		for (i = m;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
			{
				n1 = i;
			}
			if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ')
			{
				n2 = i;
				n = n2 - n1;
			System.out.printf(",%d",n);
			}


		}
		if (s.length() != m)
		{
			System.out.printf(",%d",s.length() - n1 - 1);
		}
		return 0;
	}

}
