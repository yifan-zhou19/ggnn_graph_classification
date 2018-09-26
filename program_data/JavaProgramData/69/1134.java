package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String cNum1 = new String(new char[300]);
		String cNum2 = new String(new char[300]);
		cNum1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		cNum2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] nNum1 = new int[300];
		int[] nNum2 = new int[300];
		int[] nResult = new int[300];
		int i;
		int j;
		for (i = cNum1.length() - 1, j = 0; i >= 0; i--, j++)
		{
			nNum1[j] = cNum1.charAt(i) - '0';
		}
		for (i = cNum2.length() - 1, j = 0; i >= 0; i--, j++)
		{
			nNum2[j] = cNum2.charAt(i) - '0';
		}
		for (i = 0; i < 299; i++)
		{
			nResult[i] = nResult[i] + nNum1[i] + nNum2[i];
			if (nResult[i] >= 10)
			{
				nResult[i + 1]++;
				nResult[i] %= 10;
			}
		}
		while (nResult[i] == 0 && i != 0)
		{
			i--;
		}
		for (; i >= 0; i--)
		{
			System.out.print(nResult[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

