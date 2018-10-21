package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[100]);
		String q = new String(new char[50]);
		String p = new String(new char[50]);
		int j = 0;
		int sum;
		int i;
		int k;
		int n;
		int m = 0;
		int l = 0;
		z = new Scanner(System.in).nextLine();


	//	for(i=0;z[i]!='')

		n = z.length();

		for (i = 0;i <= n - 1;i++)
		{
			if (z.charAt(i) != ' ')
			{
				p = tangible.StringFunctions.changeCharacter(p, i, z.charAt(i));
				m++;
			}
			if (z.charAt(i) == ' ')
			{
				break;
			}
		}
		for (i = m + 1;i <= n - 1;i++)
		{
			q = tangible.StringFunctions.changeCharacter(q, j, z.charAt(i));
			j++;
			l++;

		}
		for (i = 0;i < l;i++)
		{
			if (q.charAt(i) == p.charAt(0))
			{
				sum = 1;
				for (k = i + 1;k <= i + m - 1;k++)
				{
					if (q.charAt(k) == p.charAt(k - i))
					{
						sum++;
					}
					else
					{
						break;
					}
				}
				if (sum == m)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
		return 0;
	}

}

