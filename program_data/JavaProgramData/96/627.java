package <missing>;

public class GlobalMembers
{
	/**********************************************
	/* ?  ?: ??13
	/* ?  ?: ??????0????N??????100??
	/*         ???????13????????????
	/* ?  ?: ???  1200012861
	/* ?  ?: 2012?11?10?
	**********************************************/

	public static int Main()
	{
		int i = 0;
		int j;
		int k;
		int count = 0;
		int[] product = new int[100];
		int remainder = 0;
		int dividend;
		char[] num = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		do
		{
			cin.get(num[i]);
			i++;
		} while (num[i - 1] != '\n');

		if (i == 2) //???????,????0???,?????
		{
			System.out.print("0");
			System.out.print('\n');
			System.out.print(num[0]);
			System.out.print("\n");
		}
		else
		{
			dividend = (num[0] - 48) * 10 + (num[1] - 48); //?????,??????????????
			for (k = 0; k < i - 2; k++)
			{
				product[k] = Math.floor(dividend / 13); //??????????
				remainder = dividend - 13 * product[k]; //????????,????????????13???
				dividend = remainder * 10 + (num[k + 2] - 48); //?????,???????
			}
			if ((product[0] == 0) && (product[1] == 0)) //??????????0,?????0,??0
			{
				System.out.print("0");
				System.out.print("\n");
			}
			if (product[0] != 0) //????????0,??????
			{
			for (k = 0; k < i - 2; k++)
			{
				System.out.print(product[k]);
			}
			System.out.print("\n");
			}
			if ((product[0] == 0) && (product[1] != 0)) //????????0,???0,???????????
			{
				for (k = 1; k < i - 2; k++)
				{
					System.out.print(product[k]);
				}
				System.out.print("\n");
			}
			System.out.print(remainder);
			System.out.print("\n");
		}
		return 0;
	}

}
