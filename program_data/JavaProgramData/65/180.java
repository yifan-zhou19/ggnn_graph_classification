package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int k;
	int[] a = new int[max];
	int[] b = new int[max];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0,m = 0,k = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[i] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 b[i] = Integer.parseInt(tempVar3);
	 }
	  if (a[i] - b[i] == 1 || a[i] - b[i] == -2)
	  {
		  k++;
	  }
	  if (b[i] - a[i] == 1 || b[i] - a[i] == -2)
	  {
		  m++;
	  }
	}
	if (m > k)
	{
		System.out.print("A");
	}
	if (m < k)
	{
		System.out.print("B");
	}
	if (m == k)
	{
		System.out.print("Tie");
	}
	}
}

