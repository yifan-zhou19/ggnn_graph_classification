package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int y;
		int[] a = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  y = 0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 t = Integer.parseInt(tempVar2);
		 }
		 if (t == 0)
		 {
			 y = 60;
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
			 if (3 * j + a[j] > 60)
			 {
				 y = 60 - 3 * j;
				 break;
			 }
		 else if (3 * j + a[j] >= 57)
		 {
			 y = a[j];
			 break;
		 }
		 }
		  if (a[t - 1] + 3 * t < 60)
		  {
			  y = 60 - 3 * t;
		  }
		 System.out.printf("%d\n",y);
		}
		 return 0;
	}
}

