package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[1000][1000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p1;
		int p1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p2;
		int p2;
		int n;
		int i;
		int j;
		int hang1;
		int lie1;
		int hang2;
		int lie2;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0, p = a[i][0];i < n;i++)
		{
			for (j = 0;j < n;j++,p++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p = Integer.parseInt(tempVar2);
				}
				if (*p == 0 && m == 0)
				{
					p1 = p;
					hang1 = i;
					lie1 = j;
					m = 1;
				}
				if (*p == 0)
				{
					p2 = p;
					hang2 = i;
					lie2 = j;
				}
			}
		}
		System.out.printf("%d",(hang2 - hang1 - 1) * (lie2 - lie1 - 1));

	}
}

