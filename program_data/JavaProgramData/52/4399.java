package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int[] d = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				d[i] = Integer.parseInt(tempVar3);
			}
		}
		p2 = d[m + n - 1];
		p1 = d[m - 1];
		for (;p1 >= d[0];p1--, p2--)
		{
			*p2 = p1;
		}
		p2 = d[0];
		p1 = d[m];
		for (;p2 < d[n];p2++, p1++)
		{
			*p2 = p1;
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d%c",d[i],(i == m - 1)? '\n':' ');
		}
		return 0;
	}


}

