package <missing>;

public class GlobalMembers
{
	//????????
	//??????
	public static int f(int a,int m) //???a???????m?????????
	{
	if (a < m)
	{
	return 0;
	}
	int kind = 1;
	for (int i = m;i < a;i++)
	{
	if (a % i == 0) //??????????????
	{
	kind = kind + f(a / i, i);
	}
	}
	return kind;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //??n???
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			System.out.print(f(a[i], 2));
			System.out.print("\n");
		}
		return 0;
	}

}

