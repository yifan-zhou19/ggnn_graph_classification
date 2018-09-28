package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int k;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[1000];
	s = 0;
	for (k = 0;k < n;k++)
	{
	for (i = 0;i < 1000;i++)
	{
	 a[i] = 1;
	}
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Integer.parseInt(tempVar2);
	 }
	 for (i = 0;i < m;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 j = Integer.parseInt(tempVar3);
	 }
	 a[j + 3 * i] = 0;
	 a[j + 1 + 3 * i] = 0;
	 a[j + 2 + 3 * i] = 0;
	 }

	for (i = 0;i < 60;i++)
	{
	s += a[i];
	}
	System.out.printf("%d\n",s);
	s = 0;
	}
	return 0;
	}

}

