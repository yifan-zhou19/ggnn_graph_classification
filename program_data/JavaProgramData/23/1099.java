package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		int n = 0;
		int m = 0;
		int k;
		int i;
		a = new Scanner(System.in).nextLine();
		scanf("\n");
		for (i = 0;i < 100;i++)
		{
			if (a.charAt(i) == '\0')
			{
				break;
			}
			if ((a.charAt(i) != ' ') && (a.charAt(i) != '\0'))
			{
				b[m][n] = a.charAt(i);
				n++;
				if (a.charAt(i + 1) == ' ' || a.charAt(i + 1) == '\0')
				{
					m++;
					n = 0;
				}
			}
		}
		System.out.printf("%s",b[m - 1]);
		for (i = m - 2;i >= 0;i--)
		{
			System.out.printf(" %s",b[i]);
		}

	}


}
