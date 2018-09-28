package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[200];
		int n;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = n;i <= n + n - m;i++)
		{
			a[i] = (a + i - n);
		}
		p = a + n - m;
		System.out.printf("%d", p);
		for (i = 0,p++;i < n - 1;i++,p++)
		{
			System.out.printf(" %d", p);
		}
	}


}

