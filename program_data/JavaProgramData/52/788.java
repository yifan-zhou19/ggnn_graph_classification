package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[] shu = new int[100];
		for (int i = 0;i < n;i++)
		{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					shu[i] = Integer.parseInt(tempVar3);
				}
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		p = shu[n - 1];
		int a;
		a = n - m;
		for (int i = 0;i < m + n;i++)
		{
			p++;
			*p = shu[i];
		}
		for (int i = a;i < 2 * n - m - 1;i++)
		{
			System.out.printf("%d ",shu[i]);
		}
		System.out.printf("%d",shu[2 * n - m - 1]);
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}


}

