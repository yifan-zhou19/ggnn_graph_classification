package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] no = new int[201];
		int n;
		int m;
		int t;
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				no[i] = Integer.parseInt(tempVar3);
			}
		}
		p = no + n;
		for (i = 1;i <= n;i++,p--)
		{
			*(p + m) = *p;
		}
		p++;
		for (i = 1;i <= m;i++,p++)
		{
			*p = (p + n);
		}
		for (i = 1;i <= n;i++)
		{
			printf((i == n)?"%d\n":"%d ",no[i]);
		}
	}
}

