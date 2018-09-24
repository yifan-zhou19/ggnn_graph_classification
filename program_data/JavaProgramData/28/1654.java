package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30000]);
		char[][] d = new char[300][100];
		int l;
		int i;
		int n = 0;
		int k = 0;
		int p;
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
				if (a.charAt(i - 1) == ' ')
				{
					continue;
				}
				else
				{
				d[n][k] = '\0';
				n++;
				k = 0;
				}
			}
		}
			d[n][k] = '\0';
			p = String.valueOf(d[0]).length();
			System.out.printf("%d",p);
		for (i = 1;i <= n;i++)
		{
			p = String.valueOf(d[i]).length();

			System.out.printf(",%d",p);
		}

	return 0;




	}

}
