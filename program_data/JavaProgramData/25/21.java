package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*??????2?N??                         *
	//*??????2?N?? .cpp                    *
	//*?????  1000012839                       *
	//*???2010.12.15                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 



	public static int Main()
	{
		int N; //    ??2?N???
		int i; //    ?????
		int j;
		int k;
		int[] num = new int[100]; //    ???????
		int[] result = new int[100]; //    ???????

		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num, 0, (Integer.SIZE / Byte.SIZE)); //    ???
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result, 0, (Integer.SIZE / Byte.SIZE)); //    ???
		result[0] = 1; //    2?0???1?
		for (i = 0; i < N; i++) //    ???????2?
		{
			j = 0;
			for (k = 0; k < 100; k++)
			{
				num[j++] = result[k]; //    ????????????num?
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(result, 0, (Integer.SIZE / Byte.SIZE)); //    result????????????
			for (j = 0; j < 100; j++)
			{
				result[j] = 2 * num[j];
			}
			for (j = 0; j < 100; j++)
			{
				if (result[j] >= 10)
				{
					result[j + 1] += result[j] / 10;
					result[j] %= 10; //    ??10????
				}
			}
		}
		j = 99;
		while (result[j] == 0)
		{
			j--; //    ???????????
		}
		for (; j >= 0; j--)
		{
			System.out.print(result[j]);
		}
		System.out.print("\n");
		return 0;
	}







}

