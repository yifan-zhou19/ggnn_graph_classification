package <missing>;

public class GlobalMembers
{
	public static void move(tangible.RefObject<Integer> pstart, int n, int m)
	{
		int lastnum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pmove;
		pinfunctionDelegate pinfunction;
		pinfunction = () -> move();
		if (m > 0)
		{
			lastnum = (pstart + n - 1);
			for (pmove = pstart + n - 2;pmove >= pstart;pmove--)
			{
				*(pmove+1) = *pmove;
			}
			pstart = lastnum;
			pinfunction.invoke(pstart,n,m - 1);
		}
	}
    
	@FunctionalInterface
	interface pinfunctionDelegate
	{
		void invoke(tangible.RefObject<Integer> UnnamedParameter, int UnnamedParameter2, int UnnamedParameter3);
	}
	public static void Main()
	{
		int flag;
		int i;
		int n;
		int m;
		int[] num = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pnum;
		pinfunctionDelegate pinfunction;
		pnum = num;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pnum++ = Integer.parseInt(tempVar3);
			}
		}
		pnum = num;
		pinfunction = () -> move();
		pinfunction.invoke(pnum,n,m);
		flag = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (flag != 0)
			{
				System.out.print(" ");
			}
			else
			{
				flag = 1;
			}
			System.out.printf("%d",*pnum++);
		}
	}
    
	@FunctionalInterface
	interface pinfunctionDelegate
	{
		void invoke(tangible.RefObject<Integer> UnnamedParameter, int UnnamedParameter2, int UnnamedParameter3);
	}

}

