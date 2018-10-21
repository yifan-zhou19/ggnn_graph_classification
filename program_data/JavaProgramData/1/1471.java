package <missing>;

public class GlobalMembers
{
	//*************************************
	//   ????** 
	//   ?? 1200012872** 
	//   2012.11.27** 
	//*************************************


	public static int factorization(int a, int k)
	{
		int sum = 1; //???????
		if (a == 1) //??a?1?????
		{
			return 0;
		}
		if (a == 2) //??a?2???????
		{
			return 1;
		}
		int b = (int) Math.sqrt((double)a); //?b?a??????
		for (int i = k; i <= b ; i++) //??a???i??????????????????
		{
			if (a % i == 0)
			{
				sum += factorization(a / i, i);
			}
		}
		return sum; //??sum?
	}

	public static int Main()
	{
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++) //??????????????
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(factorization(a, 2));
			System.out.print("\n");
		}
		return 0;
	}


}

