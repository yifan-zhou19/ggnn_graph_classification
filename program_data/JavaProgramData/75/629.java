package <missing>;

public class GlobalMembers
{
	//********************************
	//*??? ?????     **
	//*?????? 1300012887 **
	//*???2013.10.31 **
	//********************************
	public static int Main()
	{
		char ch;
		char dh;
		int i;
		int j;
		int l;
		int k;
		int m;
		int t = 0;
		int[] x = new int[1002];
		int[] y = new int[1002];
		int[] z = new int[1002];
		for (k = 0; k <= 1001; k++) //????z?????????????????????
		{
			z[k] = 0;
		}
		for (i = 0; i < 1001; i++) //??????????
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch = System.in.read();
			if (ch != ',')
			{
				break;
			}
		}
		for (j = 0; j <= 1001; j++) //??????????
		{
			y[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dh = System.in.read();
			if (dh != ',')
			{
				break;
			}
		}
		for (l = 0; l <= i; l++) //??????????????????????????
		{
		  for (k = x[l]; k < y[l]; k++) //???????????
		  {
			  z[k] = z[k] + 1;
		  }
		}
		for (m = 0; m <= 1001; m++) //???????????
		{
			if (t <= z[m])
			{
				t = z[m];
			}
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}

