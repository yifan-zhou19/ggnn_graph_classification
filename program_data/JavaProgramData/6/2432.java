package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[10001];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int i;
		int j;
		int k;
		int b;
		int c;
		int s = 0;
		p = a[0];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}

			for (k = 1;k <= b;k++)
			{
				for (i = 1;i <= c;i++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						p = Integer.parseInt(tempVar4);
					}
					if ((k == 1 && i != 1 && i != c) || (k == b && i != 1 && i != c) || i == 1 || i == c)
					{
						s = s + *p;
					}
					p++;
				}

			}
			System.out.printf("%d\n",s);
			s = 0;
			p = a[0];

		}


		return 0;
	}
}

