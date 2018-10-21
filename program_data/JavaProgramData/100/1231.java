package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String la = new String(new char[301]);
		int[] sz = new int[30];
		char c;
		la = new Scanner(System.in).nextLine();
		int k;
		int l = 0;
		int len = la.length();
			for (int i = 0;i <= len - 1;i++)
			{
				k = la.charAt(i) - 'a';
				sz[k] += 1;
			}
			for (int j = 0;j <= 25;j++)
			{
				if (sz[j] == 0)
				{
					l++;
				}
			}
			if (l == 26)
			{
				System.out.print("No");
			}
			else
			{
				for (int m = 0;m < 26;m++)
				{
				c = 97 + m;
				if (sz[m] > 0)
				{
					System.out.printf("%c=%d\n",c,sz[m]);
				}
				}
			}
			return 0;
	}


}
