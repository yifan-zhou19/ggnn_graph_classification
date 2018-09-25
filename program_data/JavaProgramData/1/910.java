package <missing>;

public class GlobalMembers
{
	public static int multiply(int a,int b)
	{
		int i = 0;
		int n = 0;
		int sum = 1;
		if (a < b)
		{
			return 0;
		}
		else
		{
			for (i = b;i <= a;i++) //????
			{
				if (a % i == 0)
				{
					sum = sum + multiply(a / i, i); //????
				}
			}
			return sum;
		}
	}
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int i = 0;
		int sum = 0;
		int num;
		int[] result = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do //?????
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			result[i] = multiply(num, 2); //????
			i = i + 1;
			m = m + 1;
		}while (m < n);
		for (i = 0;i < n;i++) //????
		{
			System.out.print(result[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

