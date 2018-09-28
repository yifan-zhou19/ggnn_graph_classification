package <missing>;

public class GlobalMembers
{
	//***********************************************************************************
	//???????2?n??
	//??  ????
	//???  11-13
	//***********************************************************************************


	public static int Main()
	{
		int n; //??
		int[] a = new int[41]; //??????????0
		int i;
		int j;
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[40] = 1; //???????????

		for (k = 0; k < n; k++)
		{
			int[] tem = new int[41]; //????????????

			for (i = 40; i >= 0; i--)
			{
				tem[i] = a[i] * 2;
			}

			for (i = 40; i >= 0; i--) //???????????a[]???
			{
				tem[i - 1] += tem[i] / 10;
				a[i] = tem[i] % 10;
			}
		}

		int count = 0; //??????0???

		for (i = 0; i <= 40; i++)
		{
			if (a[i] == 0 && count == 0)
			{
				continue;
			}
			else
			{
				System.out.print(a[i]);
				count = 1;
			}
		}



		return 0;
	}

}

