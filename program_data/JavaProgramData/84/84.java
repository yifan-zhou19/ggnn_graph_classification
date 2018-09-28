package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	int fir = a[1];
	int sec = 0;
	for (i = 0; i < n; i++)
	{
		if (fir < a[i])
		{
		  fir = a[i];
		}
	}
	for (i = 0; i < n; i++)
	{
		if (sec < a[i] && a[i] != fir)
		{
		sec = a[i];
		}
	}
	System.out.printf("%d\n%d", fir, sec);
	}
}

