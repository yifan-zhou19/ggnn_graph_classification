package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //??m
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] n = new int[100]; //????n
		int i; //??i,j
		int j;
		double a = 1; //??a,b,c,t,s
		double b = 2;
		double c;
		double t;
		double s = 0;
		for (i = 0;i < m;i++)
		{
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n[i];j++)
		{
			c = b / a;
			s = s + c;
			t = b;
			b = a + b;
			a = t; //??s
		}
			System.out.printf("%.3lf\n",s); //??s
			s = 0;
			a = 1;
			b = 2; //s??
		}
		return 0;
	}

}

