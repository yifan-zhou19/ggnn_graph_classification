package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		char b = '0';
		int[] c = new int[201];
		int i = 0;
		int j = 0;
		int n;
		int p = 0;
		int q = 100;
		int x = 0;
		int y = 0;
		while ((b = System.in.read()) != '\n')
		{
			if (b != ' ' && b != ',')
			{
				a[i][j++] = b;
			}
			else
			{
				i++;
				j = 0;
			}
		}
		n = i;
		for (j = 0;j <= n;j++)
		{
			c[j] = String.valueOf(a[j]).length();
		}
		for (j = 0;j <= n;j++)
		{
			if (c[j] > p)
			{
				p = c[j];
				x = j;
			}
			if (c[j] < q && c[j]>0)
			{
				q = c[j];
				y = j;
			}
		}
		System.out.println(a[x]);
		System.out.println(a[y]);
		return 0;
	}
}
