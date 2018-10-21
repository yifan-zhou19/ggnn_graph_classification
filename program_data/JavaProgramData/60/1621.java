package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int f;
	  int[] a = new int[10000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	if (n >= 5)
	{
		for (i = 1;i <= n;i++)
		{
			a[i] = i;
		}
	 for (i = 5;i <= n;i++)
	 {
		 k = 1;
		for (j = 2;j <= i - 1;j++)
		{
			if (a[i] % j == 0)
			{
				m = 0;
			}
			else
			{
				m = 1;
			}
			k = k * m;
		}

	 if (k != 0)
	 {
		 f = 1;
	 for (j = 2;j <= i - 3;j++)
	 {
		 if (a[i - 2] % j == 0)
		 {
	 m = 0;
		 }
	 else
	 {
		 m = 1;
	 }
	 f = f * m;
	 }
	 if (f != 0)
	 {
		 System.out.printf("%d %d\n",a[i - 2],a[i]);
	 }
	 }
	 }
	}
	else
	{
		System.out.print("empty");
	}
		return 0;
	}
}

