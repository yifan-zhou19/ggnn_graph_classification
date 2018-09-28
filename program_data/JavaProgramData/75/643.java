package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012934 **
	//*???2013.10.31  **
	//********************************


	public static int Main()
	{
		int[] x = new int[1000]; //t????????
		int[] y = new int[1000];
		int[] t = new int[1000];
		int n;
		int number;
		int tmax;
		char douhao;

		n = 1; //n??????????????????
		x[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((douhao = System.in.read()) != '\n')
		{
			x[n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n++;
		}
		y[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n - 1; i++) //??y?y?x???????
		{
			douhao = ConsoleInput.readToWhiteSpace(true).charAt(0);
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i <= n - 1; i++)
		{
			for (int j = x[i]; j < y[i]; j++) //?????????????
			{
				t[j]++;
			}
		}
		number = 0; //number????????????
		tmax = 0; //tmax?????????????????????????
		for (int i = 0; i <= n - 1; i++)
		{
			if (tmax < y[i])
			{
				tmax = y[i]; //?????????????????
			}
		}
		for (int i = 0; i <= tmax - 1; i++)
		{
			if (number < t[i])
			{
				number = t[i];
			}
		}
		System.out.print(n);
		System.out.print(" ");
		System.out.print(number);


		return 0;

	}

}

