package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int x = 0;
		int[] sz = new int[100];
		int[] sc = new int[100];
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
			  sz[i] = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  sc[i] = Integer.parseInt(tempVar3);
		  }
		}


			for (i = 0;i < n;i++)
			{
				 if (sz[i] >= 90 && sz[i] <= 140 && sc[i] >= 60 && sc[i] <= 90)
				 {
				 x = x + 1;

				 }
				 else
				 {
					if (x > max)
					{
					 max = x;
					 x = 0;
					}
					else
					{
						x = 0;
					}

				 }

			}

			if (x > max)
			{
				max = x;
			}

			System.out.printf("%d",max);

		return 0;
	}


}

