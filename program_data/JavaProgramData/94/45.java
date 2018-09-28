package <missing>;

public class GlobalMembers
{
	/**?????????
	  *???2010/11/6
	  *??????
	  *???1000010449
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int tem;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			tem = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (tem % 2 != 0)
			{
				a[k++] = tem;
			}
		}
		for (i = 0; i < k - 1; i++)
		{
			for (j = 0; j < k - 1 - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					tem = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tem;
				}
			}
		}
		System.out.print(a[0]);
		for (i = 1; i < k; i++)
		{
			System.out.print(",");
			System.out.print(a[i]);
		}
		return 0;
	}



}

