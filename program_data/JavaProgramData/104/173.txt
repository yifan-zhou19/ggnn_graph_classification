package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int[] x = new int[15];
		int[] y = new int[15];
		int a;
		int j = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 x[0] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 y[0] = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;x[i] > 1;i++)
	 {
		 x[i + 1] = x[i] / 2;
	 }
	 a = i;
	 for (i = 0;;i++)
	 {
		 y[i + 1] = y[i] / 2;
	   for (j = 0;j <= a;j++)
	   {
		 if (x[j] == y[i])
		 {
			 break;
		 }
	   }
	   if (x[j] == y[i])
	   {
		   break;
	   }
	 }
	 System.out.printf("%d\n",x[j]);
	}
}

