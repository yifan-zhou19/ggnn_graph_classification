package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int t;
		int n;
		int m;
		int i;
		int[] mon = new int[300];
		int[] pri = new int[300];
		int h = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
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
		  while (m != 0 && n != 0)
		  {
			t = 0;
			k = 0;
			p = mon;
			for (i = 0;i < n;i++)
			{
				*(p + i) = i + 1;
			}
			i = 0;
			while (t < n - 1)
			{
				if (*(p + i) != 0)
				{
					k++;
				}
				if (k == m)
				{
					*(p + i) = 0;
					k = 0;
					t++;
				}
				i++;
				if (i == n)
				{
					i = 0;
				}
			}
			while (*p == 0)
			{
				p++;
			}
			pri[h] = p;
			h++;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		  }
		for (i = 0;i < h;i++)
		{
			System.out.printf("%d\n",pri[i]);
		}
	}
}

