package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String zfc = new String(new char[30000]);
		 int[] sz = new int[301];
		 int i;
		 int num = 0;
		 int l;
		 int x = 0;
		 zfc = new Scanner(System.in).nextLine();
		 l = zfc.length();
		 for (i = 0;i < l;i++)
		 {
			if (i == 0 && zfc.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				if (zfc.charAt(i) != ' ')
				{
					num++;
				}
				else
				{
					if (zfc.charAt(i - 1) != ' ')
					{
						sz[x] = num;
						x++;
						num = 0;
					}
				}
			}
		 }
		if (zfc.charAt(l - 1) != ' ')
		{
			sz[x] = num;
			x++;
		}
		for (i = 0;i < x;i++)
		{
			if (i < x - 1)
			{
				System.out.printf("%d,",sz[i]);
			}
			else
			{
				System.out.printf("%d",sz[i]);
			}
		}

		return 0;
	}
}
