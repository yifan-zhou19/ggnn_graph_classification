package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300 * 50]);
		int i;
		int j;
		int[] sz = new int[300];
		int m = 0;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != 0;i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				for (j = i + 1;zfc.charAt(j) != 0 && zfc.charAt(j) != ' ';j++)
				{
				}
				sz[m] = j - i;
				m++;
				if (zfc.charAt(j) == 0)
				{
					break;
				}
				else
				{
					i = j;
				}
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			 System.out.printf("%d,",sz[i]);
		}
		System.out.printf("%d",sz[m - 1]);
		return 0;
	}

}
