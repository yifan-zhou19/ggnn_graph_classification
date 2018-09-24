package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[120]);
		String r = new String(new char[104]);
		String f = new String(new char[104]);
		int i;
		int j;
		int k;
		int nc;
		int nr;
		int nf;
		c = new Scanner(System.in).nextLine();
		nc = c.length();
		r = new Scanner(System.in).nextLine();
		nr = r.length();
		f = new Scanner(System.in).nextLine();
		nf = f.length();
		i = 0;
		while (i < nc)
		{
			while ((i < nc) && (c.charAt(i) == ' '))
			{
				System.out.printf("%c",c.charAt(i));
				i++;
			}
			j = i;
			while ((j < nc) && (c.charAt(j) != ' '))
			{
				j++;
			}
			k = 0;
			while ((i + k < nc) && (k < nr) && (c.charAt(i + k) == r.charAt(k)))
			{
				k++;
			}
			if ((k == nr) && (i + k == j))
			{
				System.out.printf("%s",f);
			}
			else
			{
				for (k = i;k < j;k++)
				{
					System.out.printf("%c",c.charAt(k));
				}
			}
			i = j;
		}

		return 0;
	}
}
