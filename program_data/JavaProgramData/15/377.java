package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int n;
		int i;
		int j;
		int a1;
		int a2;
		int b1;
		int b2;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;)
		{
			for (p = a;p < a + n;)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p = Integer.parseInt(tempVar2);
				}
				if (*p != 0)
				{
					p++;
					continue;
				}
				flag = 1;
				break;
			}
			if (flag == 0)
			{
				i++;
				continue;
			}
			a1 = p - a;
			b1 = i;
			for (p = p + 1;p < a + n;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Integer.parseInt(tempVar3);
				}
				if (*p != 0)
				{
					break;
				}
			}
			a2 = p - a - 1;
			break;
		}
		for (p = p + 1;p < a + n;p++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p = Integer.parseInt(tempVar4);
			}
		}
		do
		{
			i++;
			for (p = a;p < a + n;p++)
			{
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					p = Integer.parseInt(tempVar5);
				}
			}
		} while (a[a1] == 0);
		b2 = i - 1;
		s = (a2 - a1 - 1) * (b2 - b1 - 1);
		for (j = 1;j <= n * (n - 1 - i);j++)
		{
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				a[0] = Integer.parseInt(tempVar6);
			}
		}
		System.out.printf("%d\n",s);
		return 0;
	}
}

