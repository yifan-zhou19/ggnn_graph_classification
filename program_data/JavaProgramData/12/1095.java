package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] s = new int[1000][100];
	  int i = 0;
	  int j = 0;
	  int h = 0;
	  int a;
	  int m = 0;
	  int sum = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  while (a != -1)
	  {
	if (a != 0)
	{
		s[i][j++] = a;
	}
		else
		{
			s[i][j] = a;
		 i++;
	j = 0;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
	  }

	for (h = 0;h < i;h++)
	{
		while (s[h][j] != 0)
		{
		   m = 0;
		  while (s[h][m] != 0)
		  {
			if (((float)s[h][j] / 2) == (float)s[h][m])
			{
			sum++;
			}
			m++;
		  }
		j++;
		}
	 System.out.printf("%d\n",sum);
	 sum = 0;
	 j = 0;
	}

	 return 0;
	}

}

