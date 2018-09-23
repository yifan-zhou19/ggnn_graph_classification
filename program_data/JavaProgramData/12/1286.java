package <missing>;

public class GlobalMembers
{
	//***********************************************************
	//* ? ??1.cpp                                            *
	//* ? ??? ? 1200012916                                 * 
	//* ? ??2012?10?31?                                   *
	//* ? ????                                             *
	//***********************************************************

	public static int Main()
	{

		//??????i, j, k,????a[15], ?????
		//?????????????sum
		int i;
		int j;
		int k;
		int[] a = new int[16];
		int sum;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0) //?????????
		{
			if (a[0] == -1)
			{
				break;
			}
			i = 0; //????????
			sum = 0;
			do //?do? while???????????
			{ //????????
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			} while (a[i] != 0);
			for (j = 0; j < i; j++) //???for??????????
			{ //???????????sum??
				for (k = 0; k < i; k++)
				{
					if (k != j && a[k] == 2 * a[j])
					{
						sum += 1;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

