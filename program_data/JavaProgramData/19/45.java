package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char[][] c = new char[100][100];
		int i;
		int[] n = new int[100];
		int k;
		int m;
		int j = 0;
		n[0] = -1;
		ch = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;ch.charAt(i) != '\0';i++)
		{
			if (ch.charAt(i) == ' ')
			{
				j++;
				n[j] = i;
				for (k = 0, m = n[j - 1] + 1;k < i - n[j - 1] - 1 && m < i;k++, m++)
				{
					c[j][k] = ch.charAt(m);
				}
			}
			continue;
		}
		for (i = n[j] + 1;ch.charAt(i) != '\0';i++)
		{
			c[j + 1][i - 1 - n[j]] = ch.charAt(i);
		}
		for (m = 1;m <= j + 1;m++)
		{
			if (strcmp(c[m],a) == 0)
			{
				c[m] = b;
			}
		}
		for (m = 1;m <= j;m++)
		{
			System.out.printf("%s ",c[m]);
		}
		System.out.printf("%s",c[j + 1]);

		return 0;
	}
}
