package <missing>;

public class GlobalMembers
{
	public static String zfc = new String(new char[1000]);
	public static int Main()
	{
		int len;
		int[] sz = new int[100];
		int i;
		int k = 1;
		int maxw = 0;
		int minw = 0;
		int max;
		int min;
		zfc = new Scanner(System.in).nextLine();
		len = zfc.length();
		for (i = 0;i < len;i++)
		{
			if (zfc.charAt(i) == ' ' || zfc.charAt(i) == ',')
			{
				sz[k] = i + 1;
				k++;
				zfc = zfc.substring(0, i);
			}
		}
		max = min = sz[1] - 1;
		for (i = 0;i < k;i++)
		{
			if (String.valueOf(zfc.charAt(sz[i])).length() > max)
			{
				max = String.valueOf(zfc.charAt(sz[i])).length();
				maxw = i;
			}
			else if (String.valueOf(zfc.charAt(sz[i])).length() < min && String.valueOf(zfc.charAt(sz[i])).length()>0)
			{
				min = String.valueOf(zfc.charAt(sz[i])).length();
				minw = i;
			}
		}
		System.out.println(zfc.charAt(sz[maxw]));
		System.out.println(zfc.charAt(sz[minw]));
		return 0;
	}

}
