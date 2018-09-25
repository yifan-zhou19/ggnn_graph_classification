package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int s = 0;
	int[] a = new int[25];
	int[] b = new int[25];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[i] = Integer.parseInt(tempVar2);
		}
	}
	for (i = 0;i < n;i++)
	{
	  a[i] = 0;
	 for (j = 0;j <= i;j++)
	 {
	   if (b[i] <= b[j] != 0 && a[i] <= a[j])
	   {
		a[i] = a[j];
	   }
	 }
	a[i]++;
	 if (s < a[i])
	 {
	 s = a[i];
	 }
	}
	System.out.printf("%d",s);
	return 0;
	}


}

