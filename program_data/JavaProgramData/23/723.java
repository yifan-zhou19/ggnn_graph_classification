package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		int i;
		int j = 0;
		int k = 0;
		int l;
		int p = 0;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != 32)
			{
				if (p == 0)
				{
					b[j][k] = 0;
					j = j + 1;
					k = 0;
				}
				b[j][k] = a.charAt(i);
				k++;
				p = 1;
			}
			else
			{
				p = 0;
			}
		}
		b[j][k] = 0;
		for (i = j;i > 1;i--)
		{
			k = 0;
			while (b[i][k] != 0)
			{
				System.out.printf("%c",b[i][k]);
				k++;
			}
			System.out.print(" ");

		}

		System.out.println(b[i]);

	}
}
