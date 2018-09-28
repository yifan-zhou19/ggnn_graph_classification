package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int j;
		int c = 0;
		int d = 0;
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
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			c = 0;
			d = 0;

			for (j = 0;j < m;j++)
			{
				if ((60 - a[j] - 3 * j) < 3 && (60 - a[j] - 3 * j)>0)
				{
				   System.out.printf("%d\n",a[j]);
				   c = 1;
				   break;
				}
			}
			if (c == 0)
			{
			   for (j = 0;j < m;j++)
			   {


				  if (a[j] >= (60 - 3 * j))
				  {
					System.out.printf("%d\n",60 - 3 * j);
					d = 1;
					break;
				  }
			   }


			  if (d == 0)
			  {
				System.out.printf("%d\n",60 - 3 * m);
			  }
			}


		}
		return 0;
	}

}

