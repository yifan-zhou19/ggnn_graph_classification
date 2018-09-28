package <missing>;

public class GlobalMembers
{
	// ??13.cpp : ??????????????
	//


	public static int Main()
	{
		String num = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num,'0',100);
		int x = 0;
		int i;
		int j;
		int k;
		int r = 0;
		int[] result = new int[100];
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;num.charAt(i) != '\0';i++)
		{
			result[i] = (num.charAt(i) + r * 10 - '0' - (num.charAt(i) + r * 10 - '0') % 13) / 13;
			r = (num.charAt(i) - '0' + r * 10) % 13;
		}
		for (j = 0;j <= i - 1;j++)
		{
			if (result[j] != 0)
			{
				x = 1;
				for (k = j;k <= i - 1;k++)
				{
					System.out.print(result[k]);
				}
				break;
			}
		}
		if (x == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		System.out.print(r);
		return 0;
	}

}

