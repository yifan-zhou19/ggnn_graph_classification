package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int[] a = new int[MAX];
		int n;
		int k;
		int i;
		int j;
		int d;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 1;(i + j) < n;j++)
		   {
			  if ((a[i] + a[i + j]) == k)
			  {
				 System.out.print("yes");
				 d = 1;
				 break;
			  }
		   }
			if ((a[i] + a[i + j]) == k)
			{
				 d = 1;
				 break;
			}
		}
		if (d == 0)
		{
		System.out.print("no");
		}
		return 0;
	 }

}

