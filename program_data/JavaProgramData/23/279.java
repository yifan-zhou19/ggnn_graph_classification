package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		int i;
		int j;
		int k;
		int l;
		a = new Scanner(System.in).nextLine();
		k = a.length();
		j = 0;
		l = 0;
		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) == ' ')
			{
				b[j][l + 1] = '\0';
				j++;
				l = 0;
				continue;

			}
			else
			{
				b[j][l] = a.charAt(i);
			}
			l++;
		}
		b[j][l] = '\0';
		System.out.printf("%s",b[j]);
		for (i = j - 1;i >= 0;i--)
		{
			System.out.printf(" %s",b[i]);
		}

	}
}
