package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 1;
		int l;
		int m;
		int n;
		String a = new String(new char[501]);
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (m = 1;m < l;m++)
		{
			for (i = 0;i < l;i++)
			{
				j = i + m;
				if (a.charAt(i) == a.charAt(j))
				{
					for (k = m;k > 0;k--)
					{
						if (a.charAt(i + k) != a.charAt(j - k))
						{
							k = 1;
							break;
						}
					}
					if (k == 0)
					{
						n = i;
						for (;n <= j;n++)
						{
							System.out.print(a.charAt(n));
						}
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}



}
