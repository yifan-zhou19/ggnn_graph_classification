package <missing>;

public class GlobalMembers
{
	//****************************************
	//*???????                              **
	//*????? 1100012925**
	//*???2011.11.13                        **
	//****************************************
	public static void oushu(int n) //??n????????
	{
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(n / 2);
		System.out.print("\n");

	}

	public static void jishu(int n) //??n????????
	{
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(n * 3 + 1);
		System.out.print("\n");
	}

	public static void jiaogu(int n)
	{
		if (n % 2 == 0) //??n???
		{
			oushu(n); //??oushu??
			n = n / 2;
		}
		else //??n???
		{
			jishu(n); //??jishu??
			n = n * 3 + 1;
		}
		if (n > 1) //n???????1
		{
			jiaogu(n); //????jiaogu??
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n > 1) //?n??1
		{
			jiaogu(n); //??jiaogu??
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}




}

