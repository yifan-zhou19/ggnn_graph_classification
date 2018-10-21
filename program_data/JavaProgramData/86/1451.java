package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int l;
		int x;
		int[] a = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 0;l < n;l++)
		{
						 x = 0;
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
											  a[i] = Integer.parseInt(tempVar3);
										  }
						 }
						 for (i = 0;i < m;i++)
						 {
										  if ((60 - a[i] - x) >= 3)
										  {
															x += 3;
										  }
										  if (((60 - a[i] - x) < 3) && ((60 - a[i] - x)>0))
										  {
																			   x = 60 - a[i];
										  }
						 }
						 System.out.printf("%d\n",60 - x);
		}
		return 0;
	}

}

