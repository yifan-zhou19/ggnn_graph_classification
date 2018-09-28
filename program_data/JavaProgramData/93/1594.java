package <missing>;

public class GlobalMembers
{
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
	public static int min(int a,int b)
	{
		if (a > b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int Main()
	{
		int n;
		int count = 0;
		int i = 0;
		int[] a = {0, 0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 3 == 0)
		{
			count++;
			a[count - 1] = 3;
			i = 3;
		}
		if (n % 5 == 0)
		{
			count++;
			a[count - 1] = 5;
			i = 5;
		}
		if (n % 7 == 0)
		{
			count++;
			a[count - 1] = 7;
			i = 7;
		}
		if (count == 0)
		{
			System.out.print("n");
		}
		if (count == 1)
		{
			System.out.printf("%d",i);
		}
		if (count == 2)
		{
			System.out.printf("%d %d",min(a[0], a[1]),max(a[0], a[1]));
		}
		if (count == 3)
		{
			System.out.print("3 5 7");
		}
		return 0;
	}

}

