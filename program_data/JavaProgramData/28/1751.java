package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] wd = new char[300][20];
		char m;
		int[] len = new int[300];
		int i;
		int j;
		int k;
		int tag = 0;
		for (i = 0;;)
		{
			k = 0;
			while ((m == ' ') || (m == '?') || (m == ',') || (m == '!'))
			{
				String tempVar = ConsoleInput.scanfRead(null, 1);
				if (tempVar != null)
				{
					m = tempVar.charAt(0);
				}
			}
			wd[i][k] = m;
			for (k = 1;;)
			{
				String tempVar2 = ConsoleInput.scanfRead(null, 1);
				if (tempVar2 != null)
				{
					m = tempVar2.charAt(0);
				}
				if (m == ' ')
				{
					wd[i][k] = '\0';
					len[i] = k;
					break;
				}
				else if (m == '\n')
				{
					wd[i][k] = '\0';
					tag = 1;
					len[i] = k;
					break;
				}
				else
				{
					wd[i][k] = m;
					k++;
				}
			}
			if (tag == 1)
			{
				break;
			}
			i++;
		}
		System.out.printf("%d",len[0] - 1);
		for (j = 1;j <= i;j++)
		{
			System.out.printf(",%d",len[j]);
		}
		return 0;
	}



}

