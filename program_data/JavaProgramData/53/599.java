package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int k = 0;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	for (i = 0;i < n;i++,p++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		p = Integer.parseInt(tempVar2);
	}
	}
	p = a;
	for (i = 0;i < n;i++,p++)
	{
		for (j = 0;j < i;j++)
		{
			if (a[j] == *p)
			{
				b[i]++;
			}
		}
	}
	for (i = n - 1;i >= 0;i--)
	{
	if (b[i] == 0)
	{
		k = i;
		break;
	}
	}
	p = a;

	for (i = 0;i < k;i++,p++)
	{
		if (b[i] == 0)
		{
			System.out.printf("%d,",a[i]);
		}
	}
	System.out.printf("%d",a[k]);
	}




}

