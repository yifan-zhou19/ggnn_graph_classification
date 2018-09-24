package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[20000];
	 for (i = 0;i < n;i++)
	 {
		 a[i] = 0;
	 for (j = 2;j < (i + 1);j++)
	 {
		 if ((i + 1) % j == 0)
		 {
		 a[i]++;
		 }
	 }
	 }
	for (i = 2;i < n - 2;i++)
	{
		if (a[i] == 0 && a[i + 2] == 0)
		{
		System.out.printf("%d %d\n",i + 1,i + 3);
		}
	}
	int b = 0;
	for (i = 2;i < n - 2;i++)
	{
		if (a[i] == 0)
		{
		b++;
		}
	}
	if (b == 0)
	{
		System.out.print("empty");
	}

	   return 0;
	}

}

