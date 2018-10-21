package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int s = 0;
		int m = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] i = new int[50000];
		int[] j = new int[50000];
		int[] k = new int[50000];
		for (a = 0;;a++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   i[a] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   j[a] = Integer.parseInt(tempVar3);
		   }
		   s++;
		   if (i[a] == 0 && j[a] == 0)
		   {
			 break;
		   }
		}
		for (a = 0;a < n;a++)
		{
			 k[a] = 0;
		}
		for (a = 0;a < s - 1;a++)
		{
			  b = j[a];
			  k[b]++;
		}
		for (a = 0;a < n;a++)
		{
			  if (k[a] == (n - 1))
			  {
				c = k[a];
				b = a;
				for (a = 0;a < s - 1;a++)
				{
				   if (i[a] == b)
				   {
				   m++;
				   }
				}
				if (m == 0)
				{
					System.out.printf("%d\n",b);
					  t++;
				}
			  }
		}
		if (t == 0)
		{
		  System.out.print("NOT FOUND\n");
		}
	}

}

