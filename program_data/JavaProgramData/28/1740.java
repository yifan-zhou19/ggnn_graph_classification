package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		char[][] d = new char[200][50];
		int n = 0;
		int k = 0;
		int i;
		int j;
		int l;
		int t;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) != ' ')
			{
				d[n][k] = a.charAt(i);
				k++;
			}
			else
			{
				if (a.charAt(i - 1) != ' ')
				{
					n++;
					k = 0;
				}
			}
		}
		n++;
		for (i = 0;i < n - 1;i++)
		{
			t = String.valueOf(d[i]).length();
			System.out.printf("%d,",t);
		}

		t = String.valueOf(d[n - 1]).length();
		System.out.printf("%d",t);
			return 0;
	}

}
