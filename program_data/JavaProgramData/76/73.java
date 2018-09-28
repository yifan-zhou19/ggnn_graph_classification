package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t = 0;
		double m;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int mina = 10001;
		int maxb = 0;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			mina = (mina<a[i])?mina:a[i],maxb = (maxb> b[i])?maxb:b[i];
		}
		for (m = mina;m <= maxb;m = m + 0.5)
		{
			for (i = 0;i < n;i++)
			{
				if ((m >= a[i]) && (m <= b[i]))
				{
					t++;
					break;
				}
			}
		}
		if (t == (2 * (maxb - mina + 1) - 1))
		{
			System.out.printf("%d %d",mina,maxb);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

