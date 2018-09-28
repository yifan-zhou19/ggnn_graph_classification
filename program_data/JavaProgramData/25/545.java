package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int d = 0;
		int i = 0;
		int j;
		int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int p = 1;
		a[1] = 1;
		for (i = 1;i <= n;i++)
		{
			d = 0;
			for (j = 1;j <= p;j++)
			{
				a[j] = d + a[j] * 2;
				d = d - d;
				if (a[j] >= 10)
				{
					a[j] = a[j] - 10;
					d = 1;
				}
			}
		   a[p + 1] = d + a[p + 1];
		if (a[p + 1] != 0)
		{
			p = p + 1;
		}
		}
		i = 999;
		for (;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				p = i;
				break;
			}
		}
		for (i = p;i >= 1;i--)
		{
			System.out.print(a[i]);
		}
		return 0;
	}


}

