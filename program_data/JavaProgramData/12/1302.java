package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int key; // key?????????
		int number; // number???????total????
		int total;
		while ((key) != 0 && (key != -1 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0) // ??????????-1??????
		{
			int[] num = new int[15]; // num[15]??????
			num[0] = key;
			int i = 1; // ?????????key,i????1
			int flag1 = 0; // flag1, flag2????????2???
			int flag2 = 0;
			total = 0; // ??????total????0
			while ((number) != 0 && (number != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0) // ??????
			{
				num[i] = number;
				i++;
			}
			for (int k = 0; k <= i - 2; k++)
			{
				for (int r = k + 1; r <= i - 1 ; r++)
				{
					flag1 = (num[r] == 2 * num[k]);
					flag2 = (num[k] == 2 * num[r]);
					if ((flag1 == 1) || (flag2 == 1))
					{
						total = total + 1;
					} // end if
				} // end for
			} // end for
			System.out.print(total);
			System.out.print("\n");
		}
		return 0;
	}


}

