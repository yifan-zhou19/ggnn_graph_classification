package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int min = 31999;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = a;
		int daodan = new int(int i,int min,int * p,int n);
	tangible.RefObject<Integer> tempRef_p = new tangible.RefObject<Integer>(p);
		System.out.print(daodan(0, min, tempRef_p, n));
		p = tempRef_p.argValue;
		return 0;
	}
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int daodan(int i, int min, tangible.RefObject<Integer> p, int n)
	{
		if (i == n)
		{
			return 0;
		}
		if (*(p.argValue + i) <= min)
		{
			return max(daodan(i + 1, *(p.argValue + i), p, n) + 1, daodan(i + 1, min, p, n));
		}
		else
		{
			return daodan(i + 1, min, p, n);
		}
	}

}

