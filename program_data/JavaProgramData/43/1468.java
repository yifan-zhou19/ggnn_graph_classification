package <missing>;

public class GlobalMembers
{
	//**********************************************
	//????????? 
	//?????? 1300012917
	//???2013.10.24
	//**********************************************
	public static int Main()
	{
		int[] a = new int[10001]; //??a?????????a[??]=0?a[??]=1
		int p;
		int m;
		int i;
		int j;
		int sm;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Math.sqrt(m);
		//?2?m????????????? 
		for (i = 2; i <= sm; i++)
		{
		  if (a[i] == 0)
		  {
			for (j = 2; i * j < m; j++)
			{
			  a[i * j] = 1;
			}
		  }
		}

		//?3?m/2??m???????????????????? 
		for (i = 3; i <= m / 2; i++)
		{
		  if ((a[i] == 0) && (a[m - i] == 0))
		  {
			System.out.print(i);
			System.out.print(' ');
			System.out.print(m - i);
			System.out.print("\n");
		  }
		}

		return (0);
	}
}

