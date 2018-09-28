package <missing>;

public class GlobalMembers
{
	/* ????????
	 * ?????2012-10-20
	 * ???winneshaw
	 * ??????????????????
	 * ?????90 - 140????????60 - 90???????????????
	 * ????????????????????????????????
	 */


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		int[] b = new int[100];
		int istep = 0;
		int m = 0;
		int i = 0;
		do
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}while (i < n);
		int[] c = new int[100];
		do
		{
			if (a[istep] <= 140 && a[istep] >= 90 && b[istep] <= 90 && b[istep] >= 60)
			{
			c[istep] = m + 1;
			m++;
			}
		 else
		 {
			 m = 0;
		 }
		istep++;
		}while (istep < n);
		int e = 0;
		int d = 0;
		do
		{
			if (d < c[e])
			{
				d = c[e];
			}
			e++;
		}while (e < n);
		System.out.print(d);
		System.out.print("\n");
		return 0;
	}
}

