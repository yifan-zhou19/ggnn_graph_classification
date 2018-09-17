package <missing>;

public class GlobalMembers
{
	public static int num = 0;
	public static void fenjie(int n,int x)
	{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//	extern int num;
		if (n == 1)
		{
			num++;
		}
		else
		{

		for (int i = x; i <= n;i++)
		{
			if (n % i == 0)
			{
				fenjie(n / i, i);
			}
		}
		}
	}
	public static int Main()
	{
	int n;
	int k;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int j = 0;j != k;j++)
	{
//C++ TO JAVA CONVERTER NOTE: 'extern' variable declarations are not required in Java:
	//	extern int num;
	num = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	fenjie(n, 2);
	System.out.print(num);
	System.out.print("\n");
	}
	return 0;
	}
}

