package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void ercha(int * p)
	{
		while (*p != 1)
		{
			p++;
			*p = (*(p - 1)) / 2;
		}
	}
	public static void Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int m;
		int n;
		int i;
		int j;
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
		a[0] = m;
		b[0] = n;
		ercha(a);
		ercha(b);
		for (i = 0;i < 11;i++)
		{
			if (a[i] > b[0])
			{
				continue;
			}
			else
			{
				for (j = 0;j < 10;j++)
				{
					if (a[i] == b[j])
					{
						System.out.printf("%d",a[i]);
						break;
					}
				}
				if (a[i] == b[j])
				{
					break;
				}
			}
		}
	}
}

