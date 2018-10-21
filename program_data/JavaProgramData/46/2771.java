package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int[][] t = new int[100][100];
		int q = 0;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		s = a * b;
		for (i = 0;i < a;i++)
		{
		  for (j = 0;j < b;j++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  t[i][j] = Integer.parseInt(tempVar3);
		  }
		  }
		}
		  i = q;
		while (s != 0)
		{
		  for (j = q;j < b;j++)
		  {
		   if (s == 0)
		   {
			   break;
		   }
			System.out.printf("%d\n",t[i][j]);
			s--;
		  }
			j--;
			for (i = i + 1;i < a;i++)
			{
			  if (s == 0)
			  {
				  break;
			  }
			  System.out.printf("%d\n",t[i][j]);
			  s--;
			}
			  i--;
		   for (j = b - 2;j >= q;j--)
		   {
				  if (s == 0)
				  {
					  break;
				  }
					 System.out.printf("%d\n",t[i][j]);
					 s--;
		   }
				  j++;
		   for (i = a - 2;i >= q + 1;i--)
		   {
					if (s == 0)
					{
						break;
					}
					 System.out.printf("%d\n",t[i][j]);
					 s--;
		   }
					 i++;
		   q++;
		   a--;
		   b--;
		}
		   System.in.read();
		   System.in.read();
	}
}

