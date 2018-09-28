package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int[][] an = new int[8][8];
			int i;
			int j;
			int m;
			int n;
			int s;
			int[] bb = new int[8];
			int[] cc = new int[8];
			int b;
			int c;
			int[] B = new int[8];
			char q;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				m = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				q = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
		  for (i = 0;i < m;i++)
		  {
			  for (j = 0;j < n;j++)
			  {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  an[i][j] = Integer.parseInt(tempVar4);
				  }
			  }
		  }
			for (i = 0,b = 0;i < m;i++,b++)
			{
				s = an[i][0];
				B[b] = 0;
				for (j = 1;j < n;j++)
				{
					if (s < an[i][j])
					{
						s = an[i][j];
						B[b] = j;
					}
				}

			   bb[b] = s;

			}

		for (i = 0,c = 0;i < n;i++,c++)
		{
				s = an[0][i];
				for (j = 1;j < m;j++)
				{
					if (s > an[j][i])
					{
						s = an[j][i];
					}
				}
				cc[c] = s;
		}
				for (i = 0;i < m - 1;i++)
				{
					if (bb[i] == cc[B[i]])
					{
						System.out.printf("%d+%d",i,B[i]);
						break;
					}
				}
				if (i == m - 1)
				{

		if (bb[m - 1] == cc[B[m - 1]])
		{

		System.out.printf("%d+%d",m - 1,B[m - 1]);
		}
				else
				{
					System.out.print("No");

				}
				}
				return 0;
	}




}

