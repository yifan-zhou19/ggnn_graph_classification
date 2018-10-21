package <missing>;

public class GlobalMembers
{
	//?????2?N??
	//??????
	//???2010.12.15

	public static int g_a = 0; //?????? g_a ????????????????1????0

	public static int Main()
	{
		int n = 0;
		int[] a = new int[100]; //???a???????????
		int i = 0;
		int j = 0;
		int flag = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a[99] = 1; //a[99]?????
		for (i = 1; i <= n; i++)
		{
			for (j = 99; j >= 50; j--)
			{
				if ((a[j] * 2 > 8) && (g_a == 1)) //??????????
				{
					a[j] = a[j] * 2 - 9;
				}
				else if ((a[j] * 2 > 8) && (g_a == 0)) //???????
				{
					a[j] = a[j] * 2 - 10 + g_a++;
				}
				else if ((a[j] * 2 <= 8) && (g_a == 1)) //???????
				{
					a[j] = a[j] * 2 + g_a--;
				}
				else if ((a[j] * 2 <= 8) && (g_a == 0)) //???
				{
					a[j] = a[j] * 2;
				}
			}
		}


		for (i = 1; i <= 99; i++)
		{
			//?????????????? 0 ?????
			if ((a[i] == 0) && (flag == 0))
			{
				continue;
			}
			else
			{
				System.out.print(a[i]);
				flag = 1;
			}
		}

		return 0;
	}
}

