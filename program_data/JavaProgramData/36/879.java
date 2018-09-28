package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		String b = new String(new char[1001]);
		int la;
		int lb;
		int[] x = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		int k;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		la = a.length();
		lb = b.length();
		//cout<<la<<' '<<lb<<endl;
		for (i = 0; i < la; i++)
		{
			x[a.charAt(i) - 'A']++;
		}
		for (j = 0; j < lb; j++)
		{
			y[b.charAt(j) - 'A']++;
		}
		//cout<<y[49]<<endl;
		//cout<<x[49]<<endl;
		for (k = 0; k < 57; k++)
		{
			if (x[k] != y[k])
			{
				break;
			}
		}
		if (k == 57)
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		return 0;
	}

}

