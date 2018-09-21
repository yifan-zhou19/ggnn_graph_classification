package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int[] a = new int[300];
		int max;
		int max2;
		int w;
		int www;
		char c;
		k = 0;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			k++;
			c = System.in.read();
			if (c != ',')
			{
				break;
			}
		}
		w = 0;
		if (k == 1)
		{
			w = 1;
		}
		if (k > 1)
		{
		   www = 0;
		   for (i = 0;i < k;i++)
		   {
			   if (a[i] != a[0])
			   {
				   www = 1;
				   break;
			   }
		   }
		   if (www == 0)
		   {
			   w = 1;
		   }
		}
		if (w == 1)
		{
			System.out.print("No");
		}
		if (w == 0)
		{
		   max = 0;
		   for (i = 0;i < k;i++)
		   {
			   if (a[i] > max)
			   {
				   max = a[i];
			   }
		   }
		   max2 = 0;
		   for (i = 0;i < k;i++)
		   {
			   if (a[i] > max2 && a[i] != max)
			   {
				   max2 = a[i];
			   }
		   }
		   System.out.printf("%d",max2);
		}
	}
}

