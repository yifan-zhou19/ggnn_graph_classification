package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????   **
	//*?????? 1300012861 **
	//*???2013.11.17  **
	//********************************
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int max;
		int[] str1 = new int[110];
		int[] str2 = new int[110];
		String num1 = new String(new char[110]);
		String num2 = new String(new char[110]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int nlen1 = num1.length();
			num2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int nlen2 = num2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str2, 0, (Integer.SIZE / Byte.SIZE));
			j = 0;
			for (k = nlen1 - 1; k >= 0; k--)
			{
				str1[j++] = num1.charAt(k) - '0';
			}
			j = 0;
			for (k = nlen2 - 1; k >= 0; k--)
			{
				str2[j++] = num2.charAt(k) - '0';
			}
			for (j = 0; j < nlen2; j++)
			{
				str1[j] = str1[j] - str2[j];
				if (str1[j] < 0)
				{
					str1[j + 1]--;
					str1[j] = 10 + str1[j];
				}
			}
			j = nlen1;
			while (str1[j] == 0)
			{
				j--;
			}
			for (; j >= 0; j--)
			{
				System.out.print(str1[j]);
			}
			System.out.print("\n");
		}


		return 0;
	}


}

