package <missing>;

public class GlobalMembers
{
	//*************************
	//??:???? **
	//??:??? 1300012991 **
	//??:2013.11.11 **
	//*************************

	public static int Main()
	{
		int n; //sum??????, m????, n^2?????
		int m;
		int i;
		int j;
		int sum = 0;
		char[][] sickman = new char[101][101]; //sickman???????

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sickman, '#', (Character.SIZE / Byte.SIZE)); //???????'#',?????
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				sickman[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			  //  if( '\n' == sickman[i][j] )
				//    --j;
			}
		}

		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (--m > 0) //???????????????????????????
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (sickman[i][j] == '@') //??????
					{
						if (i - 1 >= 0 && sickman[i - 1][j] == '.') //???????????= =,?????*
						{
							sickman[i - 1][j] = '*';
						}
						if (i + 1 < n && sickman[i + 1][j] == '.')
						{
							sickman[i + 1][j] = '*';
						}
						if (j - 1 >= 0 && sickman[i][j - 1] == '.')
						{
							sickman[i][j - 1] = '*';
						}
						if (j + 1 < n && sickman[i][j + 1] == '.')
						{
							sickman[i][j + 1] = '*';
						}
					}
				}
			}

			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					if (sickman[i][j] == '*') //*???@
					{
						sickman[i][j] = '@';
					}
				}
			}
		}

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
					if (sickman[i][j] == '@') //@??????
					{
						++sum;
					}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

