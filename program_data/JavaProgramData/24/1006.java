package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s = 0;
		int i;
		int j = 0;
		int n = 0;
		int a = 0;
		int b = 0;
		int x = 0;
		int y = 0;
		int[] sz = new int[1000];
		String z = new String(new char[1000]);
		char[][] f = new char[1000][100];
		z = new Scanner(System.in).nextLine();
		s = z.length();
		for (i = 0;i <= s;i++)
		{
			if (z.charAt(i) == ' ' || z.charAt(i) == '\0')
			{
				f[n][j] = '\0';
				n++;
				j = 0;
				continue;
			}
			f[n][j] = z.charAt(i);
			j++;
		}
		f[n][j] = '\0';

		for (i = 0;i <= n;i++)
		{
			sz[i] = String.valueOf(f[i]).length();
		}
		a = sz[0];
		b = sz[0];
		for (i = 0;i < n;i++)
		{
			if (a < sz[i])
			{
				a = sz[i];
				x = i;
			}
			if (b > sz[i])
			{
				b = sz[i];
				y = i;
			}
		}
		System.out.printf("%s\n",f[x]);
		System.out.printf("%s\n",f[y]);
		return 0;
	}
}
