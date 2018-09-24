package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[100];
	 int n;
	 int k;
	 int i;
	 int j;
	 int m;
	 int t;
	 int q;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (i = 1;;i++)
	 {
		a[0] = i;
		a[0] = n * a[0] + k;
		t = 0;
		for (j = 1;j < n;j++)
		{
			if (a[j - 1] % (n - 1) != 0)
			{
				t++;
								 break;
			}
			a[j] = a[j - 1] * n / (n - 1) + k;

		}
		if (t == 1)
		{
			continue;
		}
		if (t == 0)
		{
			break;
		}
	 }
	 System.out.printf("%d",a[n - 1]);

	 return 0;
	}
}

