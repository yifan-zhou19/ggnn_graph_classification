package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,i,j,a[300],b[300];
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int[] b = new int[300];
		float av = 0F;
		float m;
		float mm = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			av = av + a[i];
		}
		av = av / n;
		for (i = 0;i < n;i++)
		{
			if (av > a[i])
			{
				m = av - a[i];
			}
			else
			{
				m = a[i] - av;
			}
			if (m >= mm)
			{
				mm = m;
			}
		}
		for (j = 0;j < 300;j++)
		{
			b[j] = 0;
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (av > a[i])
			{
				m = av - a[i];
			}
			else
			{
				m = a[i] - av;
			}
			if (m == mm)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (j = 0;b[j] != 0;j++)
		{
			System.out.printf("%d",b[j]);
		if (b[j + 1] != 0)
		{
			System.out.print(',');
		}
		}
	}
}

