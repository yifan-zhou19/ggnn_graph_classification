package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int i;
		int j;
		int n;
		int p = -1;
		int k;
		for (i = 0;i < 100;i++)
		{
		if (a.charAt(i) == ' ')
		{
			n = i;
		}
		}
		for (i = n;i < 100;i++)
		{
			if (p > 0)
			{
				break;
			}
			if (a.charAt(i) == a.charAt(0))
			{
				for (j = 1;a[i + j] = a.charAt(j);j++)
				{
					if (j > n - 2)
					{
						p = i - n - 1;
					break;
					}
				}
			}
		}

			System.out.printf("%d",p);
	return 0;
	}

}
