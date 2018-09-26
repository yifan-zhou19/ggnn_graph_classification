package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int ii = 0;
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = 1;

		for (i = 0;i < n;i++) //??n?
		{
			for (ii = 0;ii < 100;ii++)
			{
				b[ii] = 0;
			}
			for (ii = 0;ii < 100;ii++) //????2
			{
				a[ii] = a[ii] * 2;
				if (a[ii] >= 10) //??????
				{
					b[ii + 1] = 1;
					a[ii] -= 10;
				}
			}
			for (ii = 0;ii < 100;ii++) //????
			{
				a[ii] += b[ii];
			}
		}
		for (i = 99;a[i] == 0;i--)
		{
			; //??????????
		}
		while (i >= 0) //????
		{
			System.out.print(a[i]);
			i--;
		}
		return 0;
	}
}

