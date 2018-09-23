package <missing>;

public class GlobalMembers
{
	/*
	 *????HW7_10.cpp
	 *??????1100019007?
	 *???2012-11-14 
	 *???1090 ???? 
	 */ 
	public static int factorize(int m,int k)
	{
		int c = 1; //a=a???
		if (m < 4)
		{
			return 1; //?m??4??1
		}
		for (int i = k;i <= Math.sqrt(m);i++)
		{
			if ((m % i) == 0)
			{
				c += factorize(m / i, k > i != 0?k:i); //????????????????an>an-1,???k???
			}
		}
		return c; //?????
	}
	public static void Main(String[] args)
	{
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(factorize(m, 2));
			System.out.print("\n");
		}
	}

}

