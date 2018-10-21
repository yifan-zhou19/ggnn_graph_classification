package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int j;
	int n;
	int[] a = new int[100000];
	int m = 0;
	int[] p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	int * px;
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
			p++ = Integer.parseInt(tempVar2);
		}
	}
	String tempVar3 = ConsoleInput.scanfRead("\n");
	if (tempVar3 != null)
	{
		k = Integer.parseInt(tempVar3);
	}
	for (p = a;p < a + n;p++)
	{
		if (p[0] == k && p < a + n - 1)
		{
			m++;
			for (px = p;px < a + n;px++)
			{
				*px = (px + 1);
			}
			p--;
		}
		else if (p[0] == k && p == a + n - 1)
		{
			p[0] = 0;
		m++;
		}
	}
	for (p = a;p < a + n - m - 1;p++)
	{
		System.out.printf("%ld ",p[0]);
	}

	System.out.printf("%ld\n",a[n - m - 1]);
	}
}

