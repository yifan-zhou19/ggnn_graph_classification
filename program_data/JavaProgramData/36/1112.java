package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n1;
		int n2;
		int count = 0;
		int k;
		int k2;
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n1 = str1.length();
		n2 = str2.length();
		int[] num1 = new int[26];
		int[] num2 = new int[26];
	for (i = 0;i < 26;i++)
	{
		for (k = 0;k < n1;k++)
		{
		if (str1.charAt(k) == 'a' + i)
		{
			num1[i]++;
		}
		}
		for (k2 = 0;k2 < n2;k2++)
		{
		if (str2.charAt(k2) == 'a' + i)
		{
			num2[i]++;
		}
		}
	}
	for (j = 0;j < 26;j++)
	{
		if (num1[j] == num2[j])
		{
			count++;
		}
	}
	if (count == 26)
	{
		System.out.print("YES");
		System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	return 0;
	}

}

