package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[260]);
		String str2 = new String(new char[260]);
		int[] num1 = new int[260];
		int[] num2 = new int[260];
		int len1;
		int len2;
		int i;
		int j;
		int len;
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = str1.length();
		len2 = str2.length();
		for (i = 0; i < len1; i++)
		{
			num1[i] = str1.charAt(len1 - i - 1) - '0';
	//		cout << num1[i];
		}
	//	cout << endl;
		for (i = 0; i < len2; i++)
		{
			num2[i] = str2.charAt(len2 - i - 1) - '0';
	//		cout << num2[i];
		}
	//	cout << endl;
		len = (len1 > len2 != 0 ? len1 : len2);
		for (i = 0; i < len; i++)
		{
			num1[i] += num2[i];
			if (num1[i] >= 10)
			{
				num1[i] -= 10;
				num1[i + 1]++;
			}
	//		cout << num1[i] << " ";
		}
	//	cout << endl;
		for (i = 259; i > 0; i--)
		{
			if (num1[i] != 0)
			{
				break;
			}
		}
		for (; i >= 0; i--)
		{
			System.out.print(num1[i]);
		}
		return 0;
	}

}

