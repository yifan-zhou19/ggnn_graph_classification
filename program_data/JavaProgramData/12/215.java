package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int p;
		int[] s = new int[15];
		for (i = 0;;i++)
		{
			k = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[0] = Integer.parseInt(tempVar);
			}
			if (s[0] == -1)
			{
				break;
			}
			for (j = 1;;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[j] = Integer.parseInt(tempVar2);
				}
				if (s[j] == 0)
				{
					break;
				}
				for (p = 0;p < j;p++)
				{
					if (s[j] == 2 * s[p] || s[p] == 2 * s[j])
					{
						k++;
					}
				}
			}
			System.out.printf("%d\n",k);
		}
		return 0;
	}
}

