package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[999]);
		char[][] z = new char[200][55];
		int i;
		int j = 0;
		int l = 0;
		int m;
		int[] n = new int[200];
		int w;
		a = new Scanner(System.in).nextLine();
		for (i = 0;1;i++)
		{
			if (a.charAt(i) == '\0')
			{
			z[j][l] = '!';
			w = j;
			break;
			}
			if (a.charAt(i) == ' ')
			{
			z[j][l] = '!';
			j++;
			l = 0;
			}
			else
			{
				z[j][l] = a.charAt(i);
				l++;
			}
		}
		l = 0;
		for (j = 0;j <= w;j++)
		{
			n[l] = 0;
			for (i = 0;1;i++)
			{
				if (z[j][i] == '!')
				{
				break;
				}
				n[l]++;
			}
			l++;
		}
		m = 0;
		w = 0;
		for (i = 1;i < l;i++)
		{
			if (n[m] > n[i])
			{
			m = i;
			}
		if (n[w] < n[i])
		{
			w = i;

		}
		}
		for (i = 0;z[w][i] != '!';i++)
		{
		System.out.printf("%c",z[w][i]);
		}
		System.out.print("\n");
		for (i = 0;z[m][i] != '!';i++)
		{
		System.out.printf("%c",z[m][i]);
		}

	return 0;
	}
}
