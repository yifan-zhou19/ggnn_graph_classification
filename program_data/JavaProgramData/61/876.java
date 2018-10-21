package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;

	   int[] a = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	   int[] b = new int[20];

		a[1] = a[0];
	   for (i = 2;i < 30;i++)
	   {
		a[i] = a[i - 2] + a[i - 1];
	   }
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (j = 0;j < n;j++)
	   {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b[j] = Integer.parseInt(tempVar2);
		  }
	   }
		 for (j = 0;j < n;j++)
		 {
		System.out.printf("%d\n",a[b[j] - 1]);
		 }
	   System.in.read();
	   System.in.read();
	   System.in.read();
	}

}

