package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int[] a = new int[300];
		   int i = 0;
		   int n;
		   int max;
		   int max2;
		   char c = ',';
		   while (c == ',')
		   {
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   a[i] = Integer.parseInt(tempVar);
			   }
			   String tempVar2 = ConsoleInput.scanfRead(null, 1);
			   if (tempVar2 != null)
			   {
				   c = tempVar2.charAt(0);
			   }
			   i++;
		   }
		   n = i;

				   max = a[0];
			   for (i = 0;i < n;i++)
			   {
				 if (a[i] > max)
				 {
					 max = a[i];
				 }
				else
				{
					continue;
				}
			   }
					max2 = 0;
				for (i = 0;i < n;i++)
				{
				if (a[i] < max && a[i]> max2)
				{
					max2 = a[i];
				}
				else
				{
					continue;
				}
				}
				if (max2 > 0)
				{
				System.out.printf("%d",max2);
				}
				else
				{
					System.out.print("No");
				}


	return 0;
	}


}

