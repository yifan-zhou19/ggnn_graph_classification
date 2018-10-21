package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[5000]);
		int i;
		int[] sz = new int[1000];
		int j = 0;
		int k;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) != ' ')
			{
			   sz[j]++;
			}
			if (zfc.charAt(i) == ' ' && zfc.charAt(i + 1) != ' ')
			{
				j++;
			}
		}
		for (k = 0;k < j;k++)
		{
		System.out.printf("%d,",sz[k]);
		}
		System.out.printf("%d",sz[j]);
		return 0;
	}

}
