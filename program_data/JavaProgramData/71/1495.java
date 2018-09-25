package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int n;
	   int k;
	   int t;
	   int j;
	   int m;
	   int[] a = new int[13];
	   int[] b = new int[13];
	   a[1] = b[1] = 0;
	   a[2] = b[2] = 31;
	   a[3] = b[3] = 59;
	   a[4] = b[4] = 90;
	   a[5] = b[5] = 120;
	   a[6] = b[6] = 151;
	   a[7] = b[7] = 181;
	   a[8] = b[8] = 212;
	   a[9] = b[9] = 243;
	   a[10] = b[10] = 273;
	   a[11] = b[11] = 304;
	   a[12] = b[12] = 334;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   k = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   t = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   j = Integer.parseInt(tempVar4);
		   }
		   if (t < j)
		   {
			   m = t;
			   t = j;
			   j = m;
		   }
		   if (k % 4 != 0 || k % 100 == 0 && k % 400 != 0)
		   {
			   if ((a[t] - b[j]) % 7 == 0)
			   {
				   System.out.print("YES\n");
			   }
			   else
			   {
				   System.out.print("NO\n");
			   }
		   }
		   else if ((k % 4 == 0 && k % 100 != 0) || (k % 400 == 0))
		   {
				if (t > 2 && j > 2)
				{
					if ((a[t] - b[j]) % 7 == 0)
					{
						System.out.print("YES\n");
					}
					else
					{
						System.out.print("NO\n");
					}
				}
				else if (t <= 2 && j>2 || j <= 2 && t>2)
				{
				//	printf("%d %d ", t ,j);
					if ((b[t] - a[j] + 1) % 7 == 0)
					{
						 System.out.print("YES\n");
					}
					 else
					 {
						 System.out.print("NO\n");
					 }
				}
			   else
			   {
				   System.out.print("NO\n");
			   }
		   }
	   }
		  return 0;
	}

}

