package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int[] a = new int[300];
	 int[] hash = new int[300];
	 int j = 0;
	 int k;
	 int flag;
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
		 a[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 System.out.printf("%d",a[0]);
	 hash[0] = a[0];
	 for (i = 1;i < n;i++)
	 {
	  flag = 1;
	  for (k = 0;k <= j;k++)
	  {
	   if (a[i] == hash[k])
	   {
		flag = 0;
	   }
	  }
	  if (flag != 0)
	  {
		System.out.printf(",%d",a[i]);
		hash[++j] = a[i];
	  }
	 }
	 System.out.print("\n");

	}
}

