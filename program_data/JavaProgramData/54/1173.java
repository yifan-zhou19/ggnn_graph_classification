package <missing>;

public class GlobalMembers
{
	/*
	 *????HW7_01.cpp
	 *??????1100019007?
	 *???2012-11-12
	 *???????? 
	 */ 
	public static int houzi(int n,int r,int m,int k)
	{
		if (r == n)
		{
			return m;
		}
		else
		{
			if (m % (n - 1) != 0)
			{
				return -1000000; //????????
			}
			else
			{
				return houzi(n, r + 1, m * n / (n - 1) + k, k);
			}
		}
	}
	public static void Main(String[] args)
	{
		int n; //??n,k,m,res
		int k;
		int m;
		int res;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 1;;m++) //??m?????
		{
			if (houzi(n, 0, m, k) > 0)
			{
				res = houzi(n, 0, m, k);
				break;
			}

		}
		System.out.print(res);
		System.out.print("\n");
	}

}

