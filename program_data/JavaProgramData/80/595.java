package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[2];
		int[] b = new int[2];
		int[] c = new int[2];
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int r = 29;
	 int i;
	 int k = 0;
	 int total = 0;
	 int num;
	 int[] sum = new int[2];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[0] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b[0] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 c[0] = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 a[1] = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ");
	 if (tempVar5 != null)
	 {
		 b[1] = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ");
	 if (tempVar6 != null)
	 {
		 c[1] = Integer.parseInt(tempVar6);
	 }
	 for (i = a[0];i < a[1] + 1;i++)
	 {
		 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		 {
			 k++;
		 }
	 }
	 total = 366 * k + 365 * (a[1] + 1 - a[0] - k);
	 if ((a[0] % 4 == 0 && a[0] % 100 != 0) || (a[0] % 400 == 0))
	 {
		m[1] = r;
	 }
	 sum[0] = 0;
	 for (i = 0;i < b[0] - 1;i++)
	 {
		sum[0] += m[i];
	 }
	 sum[0] = sum[0] + c[0];
	 if ((a[1] % 4 == 0 && a[1] % 100 != 0) || (a[1] % 400 == 0))
	 {
		m[1] = r;
	 }
	 else
	 {
		 m[1] = 28;
	 }
	 sum[1] = 0;
	 for (i = 11;i > b[1] - 2;i--)
	 {
		sum[1] += m[i];
	 }
	 sum[1] = sum[1] - c[1];
	 num = total - sum[0] - sum[1];
	 System.out.printf("%d\n",num);
	}

}

