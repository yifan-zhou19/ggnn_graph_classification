package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[50][20];
		int n;
		int i;
		int j = 0;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == 32 && a.charAt(i - 1) != 32)
			{
				b[j][k] = '\0';
				k = 0;
				j++;
			}
			else if (a.charAt(i) == 32 && a.charAt(i - 1) == 32)
			{
				continue;
			}
			else
			{
				b[j][k] = a.charAt(i);
				k++;
			}
		}
		b[j][k] = '\0';
		for (i = 0;i <= j;i++)
		{
			if (i == 0)
			{
				System.out.printf("%s",b[i]);
			}
			else
			{
				System.out.printf(" %s",b[i]);
			}
		}
		return 0;
	}

}
