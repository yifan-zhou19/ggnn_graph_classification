package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int i;
		int j;
		int[] temp = new int[10];
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
				p = Integer.parseInt(tempVar2);
			}
			if (p == 0)
			{
				System.out.print("60\n");
			}
			  else
			  {
				 for (j = 1;j <= p;j++)
				 {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					temp[j] = Integer.parseInt(tempVar3);
				}
				 }
				 for (j = p;j > 0;j--)
				 {
				   if (temp[j] + 3 * j > 63)
				   {
				   continue;
				   }

					else if (temp[j] + 3 * j <= 60)
					{
					System.out.printf("%d\n",60 - 3 * j);
				   break;
					}
					else
					{
					   System.out.printf("%d\n",temp[j]);
				   break;
					}
				 }

			  }
		}
		return 0;
	}


}

