package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[100];
		int i;
		int j;
		int t = 0;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * pt;
		pt = A;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pt = Integer.parseInt(tempVar2);
			}
			pt++;
		}
		for (pt = A + n - 1;pt >= A;pt--)
		{
			if (t == 0)
			{
				System.out.printf("%d",*pt);
				t++;
			}
			else
			{
			   System.out.printf(" %d",*pt);
			}
		}
		return 0;
	}
}

