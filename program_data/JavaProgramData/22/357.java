package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int max;
		int min;
		int n;
	char c;
	for (i = 0;;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
	if (c == '\n')
	{
	break;
	}
	}
	for (n = 0,max = 0;n <= i;n++)
	{
	if (a[n] >= max)
	{
	max = a[n];
	}
	}
	for (n = 0,min = 0;n <= i;n++)
	{
	if (a[n] >= min != 0 && a[n] < max)
	{
	min = a[n];
	}
	}
	if (min == 0)
	{
	System.out.print("No");
	}
	else
	{
	System.out.printf("%d",min);
	}
	   return 0;
	}

}

