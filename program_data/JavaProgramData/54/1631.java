package <missing>;

public class GlobalMembers
{
	//***************************
	//**???1.cpp
	//**??????
	//**???2013.12.4
	//**??????????
	//***************************

	public static int n;
	public static int k;
	public static int n0; // n0???????
	public static int flag; // flag???
	public static void calc(int p)
	{
		if (n == 0)
		{
			return;
		}
		else
		{
			if ((p - k) % n0 == 0 && p - k >= n0) // ???????????
			{
				n--;
				calc((p - k) * (n0 - 1) / n0); // ?????????
			}
			else
			{
				flag = 1; // ??????????
			}
		}
	}

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n0 = n;
		for (int i = 2; i <= 100000000; i++) // ???????
		{
			flag = 0;
			n = n0;
			calc(i);
			if (flag == 0) // ???n???????
			{
				System.out.print(i);
				System.out.print("\n");
				break; // ???????
			}
		}
		return 0;
	}
}

