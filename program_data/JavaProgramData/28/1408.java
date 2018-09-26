package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int i;
		int len;
		int k;
		int[] sz = new int[1000];
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0,k = 1;i < len;i++)
		{
			if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ')
			{
			sz[k] = i;
			k++;

			}
		}
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) == ' ')
			{
				str = str.substring(0, i);
			}
		}

		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,", String.valueOf(str.charAt(sz[i])).length());
		}
		System.out.printf("%d", String.valueOf(str.charAt(sz[k - 1])).length());
	 return 0;
	}

}
