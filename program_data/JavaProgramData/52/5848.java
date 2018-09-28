package <missing>;

public class GlobalMembers
{
	//****************************
	//*???:1.cpp               *
	//*??:??                  *
	//*????:2013?12?11?     *
	//*????:????          *
	//****************************
	public static int Main()
	{
		//??????????...
		int n; //??n???????????m,??????shu[]???
		int m;
		int[] shu = new int[200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = shu; //???p????shu?0??
		for (int i = 0; i < n; i++)
		{
			shu[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = n - 1; i >= 0; i--) //?????????m?
		{
			p[i + m] =  (p + i);
		}
		for (int i = 0; i < m; i++) //??n????????
		{
			p[i] =  (p + n + i);
		}
		for (int i = 0; i < n; i++) //??
		{
			if (i == n - 1)
			{
				System.out.print(shu[i]);
			}
			else
			{
				System.out.print(shu[i]);
				System.out.print(" ");
			}
		}
		return 0;
	}
}

