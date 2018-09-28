package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] t = new int[6];
		int i;
		int j;
		int s;
		for (i = 0;i <= 1000;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					t[j] = Integer.parseInt(tempVar);
				}
			}
					  if (t[3] == 0)
					  {
						 break;
					  }
			s = 3600 * (t[3] - t[0] + 11) + 60 * (60 - t[1] + t[4]) - t[2] + t[5];
			System.out.printf("%d\n",s);
		}
		return 0;
	}

}

