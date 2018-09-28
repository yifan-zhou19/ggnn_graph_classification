package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		int i;
		int t;
		int[] b = new int[100];
		int k = 0;
		int n;
		int m = 0;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			if (str.charAt(i) == ' ')
			{
				m = m + 1;
			}
		}
			for (i = 0;i < n;i++)
			{

				if (str.charAt(i) == ' ')

				{
						t = i;
						b[k] = t;
						k++;

				}
			}
				if (t >= n - 1)
				{

								  for (i = 0;i < n;i++)
								  {
						System.out.printf("%c",str.charAt(i));
								  }
				}
				else
				{
				for (i = b[m - 1] + 1;i < n;i++)
				{
			System.out.printf("%c",str.charAt(i));
				}
			System.out.print(" ");
			for (k = m - 1;k > 0;k--)
			{
				for (i = b[k - 1] + 1;i <= b[k];i++)
				{
					System.out.printf("%c",str.charAt(i));
				}
			}
				for (i = 0;i < b[0];i++)
				{
				System.out.printf("%c",str.charAt(i));
				}
				}
	}

}
