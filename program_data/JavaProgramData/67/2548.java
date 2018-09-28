package <missing>;

public class GlobalMembers
{
	//********************************
	//*??  ?????          *****
	//*????? 1300012753     ***** 
	//*???2013.09.25          *****   
	//********************************
	public static int Main()
	{
		int i; // ??????i???????n??????sum?????d
		int n;
		int sum;
		int d;
		int a; // ??a?b???????????????
		int b;
		float x; // ??????????x????y,???????????c
		float y;
		float c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = 1.0 * b / a;
		for (i = 1; i <= n - 1; i++)
		{
			sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = 1.0 * d / sum;
			c = y - x;
			if (c >= 0.05F)
			{
				  System.out.print("better\n");
			}
			else if (c <= -0.05F)
			{
				  System.out.print("worse\n");
			}
			else
			{
				  System.out.print("same\n");
			}
		}
		return 0;
	}

}

