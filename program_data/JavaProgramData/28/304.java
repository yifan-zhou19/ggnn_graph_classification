package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] b = new int[111];
		int j;
		int p;
		int w = 0;
		int l = 0;
		String a = new String(new char[1111]);
		a = new Scanner(System.in).nextLine();
		p = a.length();
		for (j = 0;;j++)
		{
			b[j] = 0;
			for (i = l; * (a.Substring(i)) != ' ' && *(a.Substring(i)) != '\0';i++)
			{
				b[j] = b[j] + 1;
			}
			m = i;
			w = 0;
			for (i = m; * (a.Substring(i)) == ' ';i++)
			{
				w = w + 1;
			}
			l = m + w;
			if (i == p)
			{
				break;
			}
		}
		n = j;
		for (j = 0;j < n;j++)
		{
			System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d",b[n]);

	}

}
