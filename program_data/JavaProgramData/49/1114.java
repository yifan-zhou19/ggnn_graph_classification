package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[500]);
		int m;
		int n;
		int N;
		int i;
		int j;
		int k;
		int B;
		int x;
		a = new Scanner(System.in).nextLine();
		N = a.length();
		for (k = 2;k < N;k++)
		{
			for (B = 1,j = 0;j < N - k + 1;j++)
			{
				for (m = j,n = m + k - 1;m < n;m++,n--)
				{
					if (a.charAt(m) == a.charAt(n))
					{
						B = 1;
					}
					else
					{
						B = 0;
						break;
					}
				}
			if (B == 1)
			{
				for (i = j,x = 0;x < k;i++,x++)
				{
					System.out.printf("%c",a.charAt(i),m,n);
				}
				System.out.print("\n");
			}
			}
		}
		return 0;
	}

}
