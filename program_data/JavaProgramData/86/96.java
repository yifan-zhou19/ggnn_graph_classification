package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		int i;
		int j;
		int[] a = new int[100];
		int q = 0;
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
		   t = Integer.parseInt(tempVar2);
	   }
	   for (j = 0;j < t;j++)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   a[j] = Integer.parseInt(tempVar3);
	   }
	   }
	   for (j = 0;j < t;j++)
	   {
	   if ((a[j] + j * 3 <= 60) && ((a[j + 1] + (j + 1) * 3>60) || (a[j + 1] == 0)))
	   {
	   if (a[j] + 3 * j + 6 <= 60)
	   {
		   System.out.printf("%d\n",60 - j * 3 - 3);
	   }
	   else
	   {
		   System.out.printf("%d\n",a[j]);
	   }
	   if (j == t - 1)
	   {
		   q = 1;
	   }
	   break;
	   }
	   }
		   if ((q == 0) && (j == t))
		   {
			   System.out.printf("%d\n",60 - t * 3);
		   }
		else if (t == 0)
		{
			System.out.print("60\n");
		}
		for (j = 0;j < t;j++)
		{
			a[j] = 0;
		}
		}

	  return 0;
	}
}

