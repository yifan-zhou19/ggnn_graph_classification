package <missing>;

public class GlobalMembers
{
	//************************************************************
	//* ???????                                           *
	//* ???????2?15???????????????????*
	//*        ?????????????????????????*
	//* ?    ?????                                         *
	//* ?    ??2013.10.30                                     *
	//************************************************************
	public static int Main()
	{
		int[] num = new int[16];
		int i;
		int k;
		int j;
		int count;
		for (;;) //????
		{
			i = -1; //?????i?count
			count = 0;
			do
			{
				i++;
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (num[0] == -1) //?????????-1???
				{
					return 0;
				}
			} while (num[i] != 0); //????0??
			for (j = 0 ; j <= i - 1 ; j++)
			{
				for (k = j ; k <= i - 1 ; k++)
				{
					if ((num[j] == 2 * num[k]) || (num[j] * 2 == num[k])) //????
					{
						count++; //??
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
	}
}

