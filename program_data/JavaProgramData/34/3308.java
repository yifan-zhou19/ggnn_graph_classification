package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void jiaogu(int n);
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *a;
		int a;
		int k;
		int j;
		int i;
		int max;
		int t;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		jiaogu(n);
	}
	public static void jiaogu(int n)
	{
		int i;
		if (n == 1)
		{
			System.out.print("End");
		}
		else if (n % 2 == 0)
		{
			i = n / 2;
			System.out.printf("%d/2=%d\n",n,i);
			jiaogu(i);
		}
		else
		{
			i = n * 3 + 1;
			System.out.printf("%d*3+1=%d\n",n,i);
			jiaogu(i);
		}
	}
}

