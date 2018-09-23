package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[5];
	 int[] b = new int[5];
	 int[] c = new int[5];
	 int[] d = new int[5];
	 int[] x = new int[5];
	 int i;
	 for (i = 1;i <= 5;i++)
	 {
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[i] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b[i] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 c[i] = Integer.parseInt(tempVar3);
	 }
	 }
	 for (i = 1;i <= 5;i++)
	 {
		if ((a[i] % 4 == 0 && a[i] % 100 != 0 || a[i] % 400 == 0))
		{
			x[i] = 1;
		}
		else
		{
			x[i] = 0; // x[i]????1,???0
		}
	 if (b[i] == 1)
	 {
		 d[i] = c[i];
	 }
	 else if (b[i] == 2)
	 {
		 d[i] = c[i] + 31;
	 }
	 else if (b[i] == 3)
	 {
		 d[i] = c[i] + 31 + 28 + x[i];
	 }
	 else if (b[i] == 4)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + x[i];
	 }
	 else if (b[i] == 5)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + x[i];
	 }
	 else if (b[i] == 6)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + 31 + x[i];
	 }
	 else if (b[i] == 7)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + x[i];
	 }
	 else if (b[i] == 8)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + x[i];
	 }
	 else if (b[i] == 9)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + x[i];
	 }
	 else if (b[i] == 10)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + x[i];
	 }
	 else if (b[i] == 11)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + x[i];
	 }
	 else if (b[i] == 12)
	 {
		 d[i] = c[i] + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + x[i]; // d??????????
	 }
	System.out.printf("%d\n",d[i]);
	 }

	}


}

