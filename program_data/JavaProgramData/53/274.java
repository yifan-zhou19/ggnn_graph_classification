package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[300];
	 int n;
	 int i;
	 int c;
	 int d;
	 int j;
	 int k;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 d = n;
	 for (i = 0;i < n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	 }
	 for (k = 0;k < d;k++)
	 {
		 for (j = k + 1;j < d;)
		 {
		 if (a[k] == a[j])
		 {
			 for (c = j;c < d - 1;c++)
			 {
				a[c] = a[c + 1];
			 }
			d = d - 1;
		 }
		 else
		 {
			 j++;
		 }
		 }
	if (k < d - 1)
	{
	System.out.printf("%d,",a[k]);
	}
	else
	{
		System.out.printf("%d",a[k]);
	}
	 }
	}
}

