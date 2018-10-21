package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sz = new char[300][100];
		String zf = new String(new char[30001]);
		int[] result = new int[300];
		int n = 0;
		int k = 0;
		int i;
		int num = 0;
		zf = new Scanner(System.in).nextLine();
		num = zf.length();
		for (i = 0;i < num;i++)
		{
			if (zf.charAt(i) != ' ')
			{
				sz[n][k] = zf.charAt(i);
				k++;
			}
			else
			{
				sz[n][k] = '\0';
				if (zf.charAt(i + 1) != ' ')
				{
				n++;
				k = 0;
				}
			}
		}
		sz[n][k] = '\0';
		for (i = 0;i <= n;i++)
		{
			result[i] = String.valueOf(sz[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d,",result[i]);
		}
		System.out.printf("%d",result[n]);
		return 0;
	}

}
