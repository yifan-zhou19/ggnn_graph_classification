package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[1001];
	 int n;
	 int k;
	 int i;
	 int j;
	 int q = 0;
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
	 for (i = 0;i < n - 1;i++)
	 {
	 for (j = n - 1;j > i;j--)
	 {
	if (a[i] + a[j] == k)
	{
	 q = 1;
	}

	 }



	 }
	 if (q == 1)
	 {
	 System.out.print("yes");
	 }
	 else if (q == 0)
	 {
		 System.out.print("no");
	 }
	 return 0;
	}
}

