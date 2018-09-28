package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[8];
		int i;
		int j;
		int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 j = 0;
	 if (n % 3 == 0)
	 {
		 a[3] = 1;
		 j++;
	 }
	 if (n % 5 == 0)
	 {
		 a[5] = 1;
		 j++;
	 }
	 if (n % 7 == 0)
	 {
		 a[7] = 1;
		 j++;
	 }
	 k = j;
	 for (i = 1;i <= 7;i++)
	 {
		 if (j == 1)
		 {
			 break;
		 }
		 if (a[i] == 1)
		 {
			 System.out.printf("%d ",i);
			 j--;
		 }
	 }
	 if (k != 0)
	 {
	  for (j = i;j <= 7;j++)
	  {
		if (a[j] == 1)
		{
			System.out.printf("%d\n",j);
		}
	  }
	 }
	 else
	 {
		 System.out.print("n\n");
	 }
	 return 0;
	}
}

