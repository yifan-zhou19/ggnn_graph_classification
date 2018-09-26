package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int k = 0;
		int[] c = new int[100];
		String a = new String(new char[100]);
		char[][] b = new char[100][100];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l - 1;i++)
		{
			if (a.charAt(i) != ' ')
			{
				if (a.charAt(i + 1) != ' ')
				{
					 b[k][c[k]] = a.charAt(i);
					c[k]++;
				}
				else
				{
					b[k][c[k]] = a.charAt(i);
					b[k][c[k] + 1] = ' ';
					b[k][c[k] + 2] = '\0';
					k++;
				}
			}
		}
		b[k][c[k]] = a.charAt(l - 1);
		b[k][c[k] + 1] = '\0';
		k++;
		for (i = 0;i < k;i++)
		{
			System.out.printf("%s",b[i]);
		}
		return 0;
	}

}
