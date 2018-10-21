package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int a = 0;
		int b = 0;
		int[][] sz = new int[200][200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
		   if (m == 0 && j == 1)
		   {
			   a++;
		   }
				else if (m == 1 && j == 2)
				{
					a++;
				}
				else if (m == 2 && j == 0)
				{
					a++;
				}
				 else if (m == 1 && j == 0)
				 {
					 b++;
				 }
				else if (m == 2 && j == 1)
				{
					b++;
				}
				else if (m == 0 && j == 2)
				{
					b++;
				}
				else
				{
				};
		}

				if (a > b)
				{
					System.out.print("A");
				}
			   else if (a < b)
			   {
				   System.out.print("B");
			   }
			   else
			   {
				   System.out.print("Tie");
			   }
		return 0;
	}


}

