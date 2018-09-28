package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int n;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = n;
		a[0] = s % 10;
		s = s - a[0];
		a[1] = (s % 100) / 10;
		s = s - 10 * a[1];
		a[2] = (s % 1000) / 100;
		s = s - 100 * a[2];
		a[3] = (s % 10000) / 1000;
		s = s - 1000 * a[3];
		a[4] = s / 10000;

		if (n < 10)
		{

			System.out.printf("%d",a[0]);
		}

		else if (n < 100)
		{

			System.out.printf("%1d%1d",a[0],a[1]);
		}

		else if (n < 1000)
		{
			System.out.printf("%1d%1d%1d",a[0],a[1],a[2]);
		}

		else if (n < 10000)
		{
			System.out.printf("%1d%1d%1d%1d",a[0],a[1],a[2],a[3]);
		}

		else
		{
			System.out.printf("%1d%1d%1d%1d%1d",a[0],a[1],a[2],a[3],a[4]);
		}
	}

}

