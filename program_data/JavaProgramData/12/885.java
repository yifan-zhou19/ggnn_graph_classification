package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int m;
		int n;
	 for (m = 0;;m++)
	 {
		 for (i = 0;i < 16;i++)
		 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a[i] = Integer.parseInt(tempVar);
		 }
		   if (a[i] == -1)
		   {
			   return;
		   }
		   if (a[i] == 0)
		   {
			   break;
		   }
		 }
		 n = 0;
		 for (j = 0;j < i;j++)
		 {

			 for (k = 0;k < i;k++)
			 {
				 if (a[j] == 2 * a[k])
				 {
					 n++;
				 }
			 }
		 }

		 System.out.printf("%d\n",n);

	 }
	}
}

