package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,n,a[M],flag=1;
		int i;
		int n;
		int[] a = new int[M];
		int flag = 1;
		double ave = 0;
		double max = 0;

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
			ave += a[i];
		}
		ave = ave / n;

		for (i = 0;i < n;i++)
		{
			double c;

			if ((c = Math.abs(ave - a[i]) - max) > 0 && Math.abs(c) > E)
			{
				max += c;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (Math.abs(Math.abs(a[i] - ave) - max) < E)
			{
				if (flag == 0)
				{
					System.out.print(",");
				}
				System.out.printf("%u",a[i]);
				if (flag != 0)
				{
					flag = 0;
				}
			}
		}

		return 0;
	}
}

