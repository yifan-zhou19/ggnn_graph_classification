package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		int i;
		int j;
		int k;
		int t;
		int m;
		int n;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		t = a.length();
		for (k = 1;k <= t - 1;k++)
		{
			for (i = 0;i < t - 1;i++)
			{
				if (i + k < t && a.charAt(i) == a.charAt(i + k))
				{
					for (m = i,n = i + k;m < n;m++,n--)
					{
						if (a.charAt(m) != a.charAt(n))
						{
							break;
						}
					}
					if (m >= n)
					{
						for (j = i;j <= i + k;j++)
						{
						System.out.print(a.charAt(j));
						}
					System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

