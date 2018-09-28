package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????                   **
	//*????? 1300012848        **
	//*???2013.11.16             **
	//********************************
	public static int Main()
	{
		final int MAX_LEN = 200;
		int n;
		int i;
		int j;
		int k;
		int nlen1;
		int nlen2;
		int[] jinwei = new int[MAX_LEN + 1];
		int[] num1 = new int[MAX_LEN + 1];
		int[] num2 = new int[MAX_LEN];
		String str1 = new String(new char[MAX_LEN + 1]);
		String str2 = new String(new char[MAX_LEN + 1]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
			nlen1 = str1.length();
			nlen2 = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(num2,0,(Integer.SIZE / Byte.SIZE));
			j = 0;
			for (i = nlen1 - 1; i >= 0; i--)
			{
				num1[j] = str1.charAt(i) - '0';
				j++;
			}
			j = 0;
			for (i = nlen2 - 1; i >= 0; i--)
			{
				num2[j] = str2.charAt(i) - '0';
				j++;
			}
			for (i = 0; i < MAX_LEN; i++)
			{
				num1[i] -= num2[i];
				if (num1[i] < 0)
				{
					num1[i] += 10;
					num1[i + 1]--;
				}
			}
			i = MAX_LEN;
			while (num1[i] == 0)
			{
				i--;
			}
			for (; i >= 0; i--)
			{
				System.out.print(num1[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

