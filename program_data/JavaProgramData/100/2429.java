package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		final String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int[] a = new int[52];
		str = new Scanner(System.in).nextLine();
		int m = 0;
		int i;
		int j;
		int k = 0;
		m = str.length();
		for (i = 0;i < m;i++)
		{
			for (j = 65;j < 91;j++)
			{
				if (str.charAt(i) == j)
				{
					a[j - 65]++;
				k++;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 97;j < 123;j++)
			{
				if (str.charAt(i) == j)
				{
					a[j - 71]++;
				k++;
				}
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (a[i] != 0)
			{
				System.out.printf("%c=%d\n",str1.charAt(i),a[i]);
			}
		}

		   if (k == 0)
		   {
			System.out.print("No");
		   }
			return 0;
	}
}
