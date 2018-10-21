package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int j;
	 int m;
	 int[] a = new int[100];
	 int[] num = new int[100];
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
			 m = Integer.parseInt(tempVar2);
		 }
		 for (j = 1;j <= m;j++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[j] = Integer.parseInt(tempVar3);
		   }
		 }
		 if (3 * m + a[m] <= 60)
		 {
		 num[i] = 60 - 3 * m;
		 }
		 else
		 {
			 for (j = m;j >= 0;j--)
			 {
				if (3 * j + a[j] <= 63 && 3 * j + a[j]>60)
				{
					num[i] = a[j];
					break;
				}

				else if (3 * j + a[j] <= 60)
				{
					num[i] = 60 - 3 * j;
					break;
				}
			 }
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
	  System.out.printf("%d\n",num[i]);
	 }
	}

}

