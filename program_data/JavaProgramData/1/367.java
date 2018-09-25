package <missing>;

public class GlobalMembers
{
	public static int fact(int n, int m)
	{
		int sum = 1;
		int i;
		int temp = 0;
		if (n < m)
		{
			return 0; //?n<m,?????0
		}
		else if (n == 2)
		{
			return 1; //?n???2??????1
		}
		else
		{
				for (i = m;i < n;i++) //??????m?n
				{
			if (n % i == 0)
			{
				sum = sum + fact(n / i, i);
			}
				} //?n??i????sum??fact(n/i,i)??,????
		return sum;
		}
	} //fact??
	public static int Main() //?????
	{
		int n;
		int[] a = new int[35000];
		int i;
		int[] b = new int[35000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = fact(a[i], 2); //?????????????????fact(a[i],2)
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
		return 0;
	} //?????
}

