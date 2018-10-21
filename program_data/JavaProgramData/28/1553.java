package <missing>;

public class GlobalMembers
{
	public static String zfc = new String(new char[1000]);
	public static int Main()
	{
		int len;
		int[] sz = new int[300];
		int i;
		int k;
		int[] cd = new int[300];
		zfc = new Scanner(System.in).nextLine();
		len = zfc.length();
		for (i = 0,k = 1;i < len;i++)
		{
			if (zfc.charAt(i - 1) == ' ' && zfc.charAt(i) != ' ')
			{
				sz[k] = i;
				k++;
			}
		}
		for (i = 0;i < len - 1;i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				zfc = zfc.substring(0, i);
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",String.valueOf(zfc.charAt(sz[i])).length());
		}
		System.out.printf("%d",String.valueOf(zfc.charAt(sz[k - 1])).length());
		return 0;
	}


}
