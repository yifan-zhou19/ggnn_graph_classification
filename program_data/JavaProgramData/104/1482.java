package <missing>;

public class GlobalMembers
{
	public static int jie(int a,int b)
	{
		if ((a == 1) || (b == 1)) //??????1????1
		{
			return 1;
		}
		b = b / 2; //????????????2???????
		if (a > b)
		{
			return jie(b, a);
		}
		else if (a < b)
		{
			   return jie(a, b); //????????????
		}
			 else if (a == b)
			 {
				 return a; //???????????
			 }
	}
	public static int Main()
	{
		int m;
		int n;
		int c;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m > n)
		{
			c = jie(n, m);
		}
		else if (m < n)
		{
			   c = jie(m, n);
		}
			else if (m == n)
			{
				c = m;
			}
		System.out.print(c);
		System.out.print("\n");
	return 0;
	}
}

