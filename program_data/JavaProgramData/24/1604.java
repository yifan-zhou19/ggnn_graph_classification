package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[2000]);
		int i;
		int len;
		int[] sz = new int[200];
		int k = 1;
		int max;
		int maxword = 0;
		int min;
		int minword = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if ((str.charAt(i) == ' ' || str.charAt(i) == ',') && (str.charAt(i + 1) != ' ' && str.charAt(i + 1) != ','))
			{
			sz[k] = i + 1;
			k++;
		   str = str.substring(0, i);
			}
		}
		sz[k] = len + 1;
			max = sz[1] - 1;
			min = sz[1] - 1;
		for (i = 1;i < k;i++)
		{
			if (sz[i + 1] - sz[i] - 1 > max)
			{
			max = sz[i + 1] - sz[i] - 1;
			maxword = sz[i];
			}
			else if (sz[i + 1] - sz[i] - 1 < min)
			{
				min = sz[i + 1] - sz[i] - 1;
				minword = sz[i];
			}
		}
		System.out.printf("%s\n", str.charAt(maxword));
		System.out.printf("%s\n", str.charAt(minword));

		return 0;
	}

}
