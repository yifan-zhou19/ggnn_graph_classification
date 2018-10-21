package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] ts = new int[12];
		ts[0] = 13;
		int i;
		int j;
		for (i = 1;i < 12;i++)
		{
			ts[i] = ts[i - 1] + month[i];
		}
		int dygzw;
		if (w == 5)
		{
			dygzw = 1;
		}
		else if (w < 5)
		{
			dygzw = 1 + (5 - w);
		}
		else if (w == 6)
		{
			dygzw = 7;
		}
		else
		{
			dygzw = 6;
		}
		int[] syzw = new int[53];
		int m = 1;
		syzw[0] = dygzw;
		for (i = 1;i < 53;i++)
		{
			syzw[i] = syzw[i - 1] + 7;
			if (syzw[i] <= 365)
			{
				m++;
			}
			else
			{
				break;
			}
		}
		int k;
		k = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 12;j++)
			{
				if (syzw[i] == ts[j])
				{
					System.out.printf("%d\n",j + 1);
					k++;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}



}

