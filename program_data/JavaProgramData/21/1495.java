package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int temp;
	float aver;
	float c;
	float b;
	float sum = 0F;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n - 1;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[i] = Integer.parseInt(tempVar2);
	 }
	}
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[n - 1] = Integer.parseInt(tempVar3);
	 }
	for (i = 0;i < n;i++)
	{
	 sum = sum + a[i];
	}
	aver = sum / n;
	for (i = 1;i < n;i++)
	{
	 if (a[i] > a[0])
	 {
		 temp = a[i];
		 a[i] = a[0];
		 a[0] = temp;
	 }
	}
	for (i = 0;i < n - 1;i++)
	{
	 if (a[i] < a[n - 1])
	 {
		 temp = a[i];
		 a[i] = a[n - 1];
		 a[n - 1] = temp;
	 }
	}

	 c = a[0] - aver;
	 b = aver - a[n - 1];
	 if (c > b)
	 {
		 System.out.printf("%d\n",a[0]);
	 }
	 else if (c < b)
	 {
		 System.out.printf("%d\n",a[n - 1]);
	 }
	 else
	 {
		 System.out.printf("%d,%d\n",a[n - 1],a[0]);
	 }
	}
}

