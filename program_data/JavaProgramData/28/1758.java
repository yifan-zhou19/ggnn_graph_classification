package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300 * 50]);
		int[] wl = new int[300];
		int w = 0;
		int i;
		int j;
		zfc = new Scanner(System.in).nextLine();
		for (i = 0;zfc.charAt(i) != 0;i++)
		{
			if (zfc.charAt(i) != ' ')
			{
				for (j = i + 1;zfc.charAt(j) != 0 && zfc.charAt(j) != ' ';j++)
				{
					;
				}
				wl[w] = j - i;
				w++;
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
		System.out.printf("%d",wl[0]);
		for (i = 1;i < w;i++)
		{
			System.out.printf(",%d",wl[i]);
		}
		return 0;
	}
}
