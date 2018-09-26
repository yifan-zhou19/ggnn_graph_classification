package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int[] a = new int[100];
	 int j;
	 int k;
	 int b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i <= (n - 1);i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	 }
	 for (j = 0;j <= (n - 1);j++)
	 {
		 for (k = 0;k < (n - 1 - j);k++)
		 {
			if (a[k] < a[k + 1])
			{
				b = a[k];
		   a[k] = a[k + 1];
		   a[k + 1] = b;
			}
		 }
	 }

	System.out.printf("%d\n%d\n",a[0],a[1]);
	}
}

