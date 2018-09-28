package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int t;
	 int max;
	 int[] a = new int[100];
	 int[] b = new int[100];
	 int[] c = new int[100];
	 t = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 (a[i]) = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 (b[i]) = Integer.parseInt(tempVar3);
	 }
	 if (a[i] <= 140 && a[i] >= 90 && b[i] >= 60 && b[i] <= 90)
	 {
	 t = t + 1;
	 c[i] = t;
	 }
	 else
	 {
	 c[i] = t = 0;

	 }
	 }
	 max = c[0];
	for (i = 0;i <= n - 1;i++)
	{
		if (max < c[i])
		{
			max = c[i];
		}
	}

	 System.out.printf("%d",max);
	 return 0;
	}

}

