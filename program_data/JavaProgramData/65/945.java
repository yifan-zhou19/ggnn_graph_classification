package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		m = 0;
		int[][] sz = new int[2000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			for (int a = 0;a < 2;a++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][a] = Integer.parseInt(tempVar2);
				}
			}
	  if (sz[i][0] == 0 && sz[i][1] == 1)
	  {
		  m++;
	  }
		  if (sz[i][0] == sz[i][1])
		  {
			  m = m;
		  }
		  if (sz[i][0] == 0 && sz[i][1] == 2)
		  {
			  m--;
		  }
		   if (sz[i][0] == 1 && sz[i][1] == 0)
		   {
			   m--;
		   }
			if (sz[i][0] == 1 && sz[i][1] == 2)
			{
				m++;
			}
			if (sz[i][0] == 2 && sz[i][1] == 1)
			{
				m--;
			}
			 if (sz[i][0] == 2 && sz[i][1] == 0)
			 {
				 m++;
			 }
		}
	if (m == 0)
	{
		System.out.print("Tie");
	}
	else if (m > 0)
	{
		System.out.print("A");
	}
	else if (m < 0)
	{
		System.out.print("B");
	}
		return 0;
	}


}

