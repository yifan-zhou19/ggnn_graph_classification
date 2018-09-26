package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[200];
		int[] b = new int[200];
		int i;
		int k;
		int j;
	int n;
	int temp;
	int[] c = new int[200];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 2 * n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	 for (i = 0;i < n;i++)
	 {
	 if (a[2 * i] >= 90 && a[2 * i] <= 140 && a[2 * i + 1] >= 60 && a[2 * i + 1] <= 90)
	 {
	 b[i] = 1;
	 }
	 else
	 {
	 b[i] = 0;
	 }
	 }
	 for (k = 0;k < n;k++)
	 {
	 for (j = k;j < n;j++)
	 {
		 if (b[j] == 1)
		 {
	 c[k] = c[k] + 1;
		 }
	 else
	 {
	 break;
	 }
	 }
	 }

	 for (j = 0;j < n;j++)
	 {
		 if (c[j] > c[j + 1])
		 {
			temp = c[j];
		c[j] = c[j + 1];
		c[j + 1] = temp;
		 }
	 }
		System.out.printf("%d\n",c[n]);




	}
}

