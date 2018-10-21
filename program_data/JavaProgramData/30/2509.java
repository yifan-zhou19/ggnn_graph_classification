package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int i;
		int j = 1;
		int k;
		int sum = 0;
		a[0] = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
		  if (((n - i) % 7 != 0) && ((n - i) % 10 != 7) && (((n - i) < 70) || ((n - i)>79)))
		  {
				a[j] = n - i;
			  j++;
		  }
		}
		for (k = 1;k < j;k++)
		{
			sum += a[k] * a[k];
		}
		System.out.print(sum);
		return 0;
	}





}

