package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int y;
	int m1;
	int m2;
	int d = 0;
	int r;
	int c;
	int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //a,b???????????
	int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1; i <= n; i++)
	{
	y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	r = 0;
	if (y % 4 == 0)
	{
		r = 1;
	}
	if (y % 100 == 0)
	{
		r = 0;
	}
	if (y % 400 == 0)
	{
		r = 1; //????r=1????
	}
	//m1,m2??????????
	if (m1 > m2)
	{
	c = m1;
	m1 = m2;
	m2 = c;
	}
	if (r == 0) //???
	{
	for (int i = m1; i < m2; i++)
	{
	d = d + a[i - 1];
	} //??????
	if (d % 7 == 0)
	{
		System.out.print("YES");
		System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	}
	if (r == 1) //????
	{
	for (int i = m1; i < m2; i++)
	{
	d = d + b[i - 1];
	}
	if (d % 7 == 0)
	{
		System.out.print("YES");
		System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	}
	d = 0; //????
	}
	return 0;
	}


}

