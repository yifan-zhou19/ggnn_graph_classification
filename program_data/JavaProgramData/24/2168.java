package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		char[][] a = new char[200][40];
		int i = 0;
		int j = 0;
		int p;
		int q;
		int[] b = new int[200];
		int d;
		while (c != '\n')
		{
			c = System.in.read();
			if (c != ' ' && c != '\n')
			{
				a[i][j] = c;
				j = j + 1;
			}
			if (c == ' ' || c == '\n')
			{
				a[i][j] = '\0';
				b[i] = String.valueOf(a[i]).length();
				i = i + 1;
				j = 0;
			}
		}
		p = 0;
		q = 0;
		for (d = 0;d < i;d++)
		{
			if (b[d] > b[p])
			{
				p = d;
			}
			if (b[d] < b[q])
			{
				q = d;
			}
		}
		System.out.printf("%s\n%s\n",a[p],a[q]);
	}
}
