package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[21];
		int[] b = new int[100];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[0] = Integer.parseInt(tempVar2);
		   }
		   for (j = 1;j < a[0] + 1;j++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[j] = Integer.parseInt(tempVar3);
			   }
		   }
		   a[a[0] + 1] = MORE;
		int sum = 0;
		int time = 0;
		int k = 0;
		while (true)
		{
			   k++;
			   if (k > 1)
			   {
				  time += 3;
			   }
			   if (time >= MIN)
			   {
				  break;
			   }
			   time = 3 * (k - 1) + a[k];
			   if (time >= MIN)
			   {
				  sum = MIN - 3 * (k - 1);
				  break;
			   }
			   sum = a[k];
		}
			b[i] = sum;
		}
		for (int i = 0; i < n; i++)
		{
		   System.out.printf("%d\n", b[i]);
		}
	}

}

