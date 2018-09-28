package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[20]);
		String k = new String(new char[10]);
		int i;
		int n;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		k = new Scanner(System.in).nextLine();
		for (j = 0;j < m;j++)
		{
		s = new Scanner(System.in).nextLine();
		i = s.length() - 1;
		if (s.charAt(i) == 'y' && s.charAt(i - 1) == 'l')
		{
			n = s.length() - 2;
			for (i = 0;i < n - 1;i++)
			{
			System.out.printf("%c",s.charAt(i));
			}
			System.out.printf("%c\n",s.charAt(i));
		}
		else if (s.charAt(i) == 'r' && s.charAt(i - 1) == 'e')
		{
			n = s.length() - 2;
			for (i = 0;i < n - 1;i++)
			{
			System.out.printf("%c",s.charAt(i));
			}
			System.out.printf("%c\n",s.charAt(i));
		}
		else if (s.charAt(i) == 'g' && s.charAt(i - 1) == 'n' && s.charAt(i - 2) == 'i')
		{
			n = s.length() - 3;
			for (i = 0;i < n - 1;i++)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.printf("%c\n",s.charAt(i));
		}
		}
			return 0;
	}

}

