package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ss = new int[100];
		int[] sz = new int[100];
		int n;
		int h = 0;
		int i;
		int[] sc = new int[100];
		int e;
		int k;
		int c;
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
			   ss[i] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar3);
		   }
		   if (ss[i] <= 140 && ss[i] >= 90 && sz[i] >= 60 && sz[i] <= 90)
		   {
			   h++;
		   }
		   else
		   {
			   sc[i] = h;
			   h = 0;
		   }

	   }
	   c = h;

	   for (k = 1 ; k <= 100; k++)
	   {
			for (i = 0; i < 100 - k; i++)
			{
				if (sc[i] < sc[i + 1])
				{
						e = sc[i + 1];
						sc[i + 1] = sc[i];
						sc[i] = e;
				}
			}
	   }
	   if (c < sc[0])
	   {
		   System.out.printf("%d",sc[0]);
	   }
	   else
	   {
		   System.out.printf("%d",c);
	   }
		return 0;
	}

}

