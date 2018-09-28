package <missing>;

public class GlobalMembers
{
	public static int i = 0;
	public static int n = 0;
	public static int m = 0;
	public static int p = 0;
	public static int q = 0;
	public static int r = 0;
	public static int t = 0;
	public static int e = 0;
	public static int k = 0;
	public static int[][] a = new int[1000][1000];
	public static int[][] b = new int[1000][1000];
	public static int Main()
	{
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
		a[i][0] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i][1] = Integer.parseInt(tempVar3);
	}

	}
	for (i = 0;i < n;i++)
	{
		 if (a[i][0] == 0 && a[i][1] == 1)
		 {
			 t++;
		 }
		 if (a[i][0] == 1 && a[i][1] == 2)
		 {
			 t++;
		 }
		 if (a[i][0] == 2 && a[i][1] == 0)
		 {
			 t++;
		 }
		 if (a[i][0] == 1 && a[i][1] == 0)
		 {
			 e++;
		 }
		 if (a[i][0] == 2 && a[i][1] == 1)
		 {
			 e++;
		 }
		 if (a[i][0] == 0 && a[i][1] == 2)
		 {
			 e++;
		 }
	}
	if (e > t)
	{
		System.out.print("B");
	}
	else if (e < t)
	{
		System.out.print("A");
	}
	else if (e = t)
	{
		System.out.print("Tie");
	}
	return 0;
	}




}

