package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int m;
		int n;
		int i;
		int ceng1;
		int ceng2;
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
		for (i = 0;i <= 9;i++)
		{
			a[i] = -1;
		}
		for (i = 0;i <= 9;i++)
		{
			b[i] = -2;
		}
		a[0] = m;
		b[0] = n;
		if (m == 1 || n == 1)
		{
			System.out.print("1");
		}
		else
		{
			for (i = 1;i <= 9;i++)
			{
				a[i] = a[i - 1] / 2;
				if (a[i] == 1)
				{
					ceng1 = i;
					break;
				}
			}
			for (i = 1;i <= 9;i++)
			{
				b[i] = b[i - 1] / 2;
				if (b[i] == 1)
				{
					ceng2 = i;
					break;
				}
			}
			for (i = 1;i <= 10;i++)
			{
				if (a[ceng1 + 1 - i] == b[ceng2 + 1 - i] && a[ceng1 - i] != b[ceng2 - i])
				{
					System.out.printf("%d",a[ceng1 + 1 - i]);
					break;
				}
			}
		}
		return 0;
	}

}

