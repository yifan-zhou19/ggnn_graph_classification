package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int s;
		int n;
		int l;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 10)
		{
		  int[][] cancel = new int[10][10];
		  for (l = 0;l < n;l++)
		  {
				for (r = 0;r < n;r++)
				{
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  cancel[l][r] = Integer.parseInt(tempVar2);
				  }
				}
		  }
		  int r1;
		  int r2;
		  int l1;
		  int l2;
		  for (i = 0,l = 0;l < n;l++)
		  {
			for (i = 0,r = 0;r < n;r++)
			{
			  if (cancel[l][r] == 0)
			  {
				 l1 = l;
				 r1 = r;
				 i = 1;
				 break;
			  }
			}
			if (i == 1)
			{
				break;
			}
		  }
		  for (l = 0;l < n;l++)
		  {
			for (r = 0;r < n;r++)
			{
			if (cancel[l][r] == 0)
			{
			   l2 = l;
			   r2 = r;
			}
			}
		  }
		  s = (l2 - l1 - 1) * (r2 - r1 - 1);
		  System.out.printf("%d",s);
		}
		return 0;
	}




}

