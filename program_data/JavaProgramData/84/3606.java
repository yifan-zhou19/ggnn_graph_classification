package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int t;
	int[] a = new int[30];
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
		  a[i] = Integer.parseInt(tempVar2);
	  }
	}
	for (j = 0;j < n - 1;j++)
	{
		for (i = 0;i < n - 1 - j;i++)
		{
			if (a[i] < a[i + 1])
			{
			 t = a[i];
			 a[i] = a[i + 1];
			 a[i + 1] = t;
			}
		}
	}
	for (i = 0;i < 2;i++)
	{
	System.out.printf("%d\n",a[i]);
	}
	return 0;
	}
}

