package <missing>;

public class GlobalMembers
{
	/*
	 * ???
	 * ?????
	 */

	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int k = 0;
		int q = 0;
		int t = 0;
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double s = 0;
		for (int i = 0;i < n;i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s += a[i];
		}
		s /= n;
		double max = Math.abs(s - a[0]);
		for (int i = 1;i < n;i++)
		{
			if (Math.abs(s - a[i]) > max)
			{
					k = i;
				max = Math.abs(s - a[i]);
			}
		}
		max = Math.abs(s - a[0]);
		for (int i = 1;i < n;i++)
		{
				if (Math.abs(s - a[i]) >= max)
				{
						q = i;
					max = Math.abs(s - a[i]);
				}
		}
	 for (int i = 0;i < n;i++)
	 {
		   if (Math.abs(s - a[k]) == Math.abs(s - a[i]))
		   {
			  b[t++] = a[i];
		   }
	 }
	 for (int i = 0;i < t - 1;i++)
	 {
		 for (int j = 0;j < t - i - 1;j++)
		 {
			 if (b[j] > b[j + 1])
			 {
				 int temp = b[j];
				 b[j] = b[j + 1];
				 b[j + 1] = temp;
			 }
		 }
	 }
	 if (t == 1)
	 {
		 System.out.print(a[k]);
	 }
	 else
	 {
		 for (int i = 0;i < t - 1;i++)
		 {
		 System.out.print(b[i]);
		 System.out.print(',');
		 }
	 System.out.print(b[t - 1]);
	 }
		return 0;
	}
}

