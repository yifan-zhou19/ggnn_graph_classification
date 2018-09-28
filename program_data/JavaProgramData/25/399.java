package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (n == 0)
		{
			System.out.print(1);
		}
		else

		{
				int[] an = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(an,0,(Integer.SIZE / Byte.SIZE));
				an[0] = 2;
				for (int i = 1;i < n;i++)
				{
					for (int jjj = 0;jjj < 90;jjj++)
					{
						an[jjj] = 2 * an[jjj];
					}
					for (int j = 0;j < 90;j++)
					{
						if (an[j] >= 10)
						{
							an[j] = an[j] - 10;
							an[j + 1] += 1;
						}
					}
				}
				int jj = 90;
				while (an[jj] == 0)
				{
					jj--;
				}
				for (int mm = jj;mm >= 0;mm--)
				{
					System.out.print(an[mm]);
				}
		}
		return 0;
	}








}

