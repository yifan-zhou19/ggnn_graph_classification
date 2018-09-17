package <missing>;

public class GlobalMembers
{
	//**********************************************
	//**???1090 ????*************************
	//**?????? 1000012741*********************
	//**???2010?12?7?*************************
	//**********************************************
	//??change???a???????p???????
	public static int change(int a, int p)
	{
		int i; //count??????????
		int count = 0;
		for (i = p; i < a; i++)
		{
			if (a % i == 0 && a / i >= i) //??????????????
			{
				count++; //???1
				int k;
				int t;
				k = (int) Math.sqrt(a / i); //?k?a/i????
				for (t = 2; t <= k; t++)
				{
					if ((a / i) % t == 0) //??a???2?k??????
					{
						count += change(a / i, i); //?a/i??????
						break;
					}
				}

			}
		}
		return count; //??count?
	}
	public static int Main()
	{
		int n; //n?????????a?????
		int i;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			int total = 0; //total?????
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			total += change(a, 2); //??change??
			System.out.print(total + 1);
			System.out.print("\n");
		}
		return 0;
	}
	//**********************************************
}

