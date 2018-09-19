package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] sz = new int[100];
		int[] erbei = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
		int sum = 0;
		p1 = sz;
		p2 = erbei;
		for (p1 = sz;;p1++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1 = Integer.parseInt(tempVar);
			}
			n++;
			if (*p1 == 0)
			{
				for (p1 = sz;p1 < sz + n - 1;p1++)
				{
					*p2 = p1 * 2;
					p2++;
				}
				for (p2 = erbei;p2 < erbei + n - 1;p2++)
				{
					for (p1 = sz;p1 < sz + n - 1;p1++)
					{
						if (*p2 == *p1)
						{
							sum++;
						}
					}
				}
				System.out.printf("%d\n",sum);
				p1 = sz - 1;
				p2 = erbei;
				sum = 0;
				n = 0;
			}
			if (*p1 == -1)
			{
				break;
			}
		}
		return 0;
	}
}

