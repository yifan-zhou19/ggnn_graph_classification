package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int d = 0;
		int s = 0;
		int i;
		int j;
		int k;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= n;k++)
		{

		  int[] p;
		  p = new int[m];
		   s = 0;
			x = 0;
		  d = 0;
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		   for (i = 0;i < m;i++)
		   {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
		   }

			for (j = 0;j < m;)
			{
			  p[j] += 3 * (j + 1);
			  if ((p[j] > 60) && (p[j] < 63))
			  {
				s = p[j] - 3 * (j + 1);
				d = 1;
			break;
			  }
			 if ((p[j] > 63) || (p[j] == 63))
			 {
				s = 60 - 3 * j;
				d = 1;
				break;
			 }
			 if ((p[j] < 60) || (p[j] == 60))
			 {
				 j++;
			 }
			}
			if (d == 0)
			{
			   x = 60 - (3 * m);
			  System.out.printf("%d\n",x);

			}
		   if (d == 1)
		   {
			x = s;
			System.out.printf("%d\n",x);

		   }
		}
		return 0;
	}


}

