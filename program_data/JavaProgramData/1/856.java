package <missing>;

public class GlobalMembers
{
	public static int divide(int n,int min) //?n?????????????min
	{
		int i; //method??n????
		int method = 0;
		if (n >= min)
		{
			method++;
		}
		for (i = min;i < n;i++)
		{
			if ((n % i) == 0)
			{
				method += divide(n / i, i);
			}
		}
		return method;
	}
	public static int Main()
	{
		int number = 0; //??????,integer??????
		int integer;
		int i;
		number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < number;i++)
		{
			integer = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(divide(integer, 2));
			System.out.print("\n");
		}
		return 0;
	}
}

