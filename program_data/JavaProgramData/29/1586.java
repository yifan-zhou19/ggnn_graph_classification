package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //m????i
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double x; //x?????
		double a; //x=b/a;
		double b;
		double c;
		double result; //????
		//????????? 
		for (i = 1;i <= m;i++)
		{
			int n; //n?
			int j;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = 1,b = 2; //a?b???????
			result = 2 / 1; //????????????
			for (j = 1;j <= n;j++)
			{
				c = b + a;
				a = b;
				b = c; //?????

				x = b / a; //j=1??x=3/2
				result = result + x; //????
			}
			result = result - x; //???????
			System.out.printf("%.3f",result);
			System.out.print('\n');
		}
		return 0; //?> w <?
	}
}

