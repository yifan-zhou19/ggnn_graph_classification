package <missing>;

public class GlobalMembers
{
	public static int cal; //??cal
	public static int fac(int a,int x)
	{ //a???????
	if (x == 1)
	{
		cal++;
		return 1;
	} //??x?i?? ????????????1
	for (int i = 2;i <= x;i++)
	{
	if (x % i == 0 && i >= a) //??? ??????????
	{
	fac(i, x / i);
	}
	}
	}
	public static int Main()
	{
	int n;
	int b;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n > 0)
	{
	cal = 0;
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	fac(1, b);
	System.out.print(cal);
	System.out.print("\n");
	n--;
	}
	}
}

