package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[60000]);
		char[][] zfc = new char[300][20];
		int[] sz = new int[300];
		int i = 0;
		int h = 0;
		int k = 0;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 300;i++)
		{
			sz[i] = 0;
		}
		for (i = 0;i < str.length() + 1;i++)
		{
			if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ')
			{
				continue;
			}
			else if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' ')
			{
				zfc[h][k] = '\0';
				h++;
				k = 0;
			}
			else if (str.charAt(i) == '\0')
			{
				zfc[h][k] = '\0';
			}
			else
			{
				zfc[h][k] = str.charAt(i);
				k++;
			}
		}
		 for (i = 0;i < h + 1;i++)
		 {
			sz[i] = String.valueOf(zfc[i]).length();
		 }
		 for (i = 0;i < h;i++)
		 {
			 System.out.printf("%d,",sz[i]);
		 }
		 System.out.printf("%d",sz[h]);
		return 0;
	}



}
