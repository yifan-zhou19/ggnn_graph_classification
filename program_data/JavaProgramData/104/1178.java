package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int j;
		int kn;
		int ki;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		if (n < i)
		{
		e = n;
		n = i;
		i = e;
		}
		l = 1;
		for (k = 1;k < 33;k++)
		{
		l = l * 2;
		if (l > n)
		{
			kn = k;
			break;
		}
		}
		l = 1;
		for (k = 1;k < 33;k++)
		{
		l = l * 2;
		if (l > i)
		{
			ki = k;
			break;
		}
		}
		for (k = 0;k < kn - ki;k++)
		{
			n /= 2;
		}
		do
		{
			if (n == i)
			{
				System.out.printf("%d",n);
				return 0;
			}
			n /= 2;
			i /= 2;
		} while (1 != 0);

	}

}

