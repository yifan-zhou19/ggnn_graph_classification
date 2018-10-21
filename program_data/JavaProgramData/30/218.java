package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = {7, 14, 17, 21, 27, 28, 35, 37, 42, 47, 49, 56, 57, 63, 67, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 84, 87, 91, 97, 98};
	 int n;
	 int s1 = 0;
	 int s2 = 0;
	 int i;
	 int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
		 s1 += i * i;
	 }
	 for (j = 0;j < 30;j++)
	 {
		 if (a[j] <= n)
		 {
	 s2 += a[j] * a[j];
		 }
	 }
	 System.out.printf("%d\n",s1 - s2);
	}
}

