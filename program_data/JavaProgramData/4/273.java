package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][100];
		int l;
		int h;
		int i;
		int j;
		int hang;
		int lie;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			lie = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			hang = Integer.parseInt(tempVar2);
		}
		for (l = 0;l < lie;l++)
		{
			for (h = 0;h < hang;h++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[h][l] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < hang + lie-1;i++)
		{
			for (j = i;j >= 0;j--)
			{
				if (j > hang - 1)
				{
					j = hang - 1;
				}
				h = j;
				l = i - h;
				if (l > lie-1)
				{
					break;
				}
				System.out.printf("%d\n",s[h][l]);
			}
		}
		return 0;
	}

}

