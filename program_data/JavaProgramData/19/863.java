package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		char[][] sz = new char[51][101];
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int j;
		int k;
		int n;
		int max = 0;
		int min = 0;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0,k = 0;i < n;i++)
		{
			for (j = 0;s.charAt(i) != ' ' && i < n;i++, j++)
			{
				sz[k][j] = s.charAt(i);
			}
			sz[k][j] = '\0';
			k++;
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();

		for (i = 0;i < k - 1;i++)
		{
			if (strcmp(sz[i],a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",sz[i]);
			}
			System.out.print(" ");
		}
		if (strcmp(sz[k - 1],a) == 0)
		{
			System.out.printf("%s\n",b);
		}
		else
		{
			System.out.printf("%s\n",sz[k - 1]);
		}

		return 0;
	}

}
