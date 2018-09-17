package <missing>;

public class GlobalMembers
{
	public static int f(int a,int min) //???a???????min?????????
	{
		int i;
		if (a < min) //??????
		{
		  return 0;
		}
		int result = 1;
		for (int i = min;i < a;i++) //??????
		{
		if (a % i == 0)
		{
		  result += f(a / i, i);
		}
		}
		return result;
	}
	public static int Main()
	{
		int n; //????
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) //????
		{
			System.out.print(f(a, 2));
			System.out.print("\n");
		}
		return 0;
	}


}

