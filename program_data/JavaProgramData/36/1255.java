package <missing>;

public class GlobalMembers
{
	public static int judge(tangible.RefObject<String> str1, tangible.RefObject<String> str2, int len1, int len2)
	{
		int[] flag = new int[100];
	if (len1 != len2)
	{
		return 0;
	}
	for (int i = 0;i < len1;i++)
	{
		for (int j = 0;j < len2;j++)
		{
			if (flag[j] == 1)
			{
				continue;
			}
			if (*(str1.argValue.Substring(i)) == *(str2.argValue.Substring(j)))
			{
				flag[j] = 1;
				break;
			}
		}
	}
	int p;
	for (p = 0;p < len2,flag[p] == 1;p++)
	{
	;
	}
	if (p == len2)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	}

	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len1 = str1.length();
		int len2 = str2.length();
	tangible.RefObject<String> tempRef_str1 = new tangible.RefObject<String>(str1);
	tangible.RefObject<String> tempRef_str2 = new tangible.RefObject<String>(str2);
		if (judge(tempRef_str1, tempRef_str2, len1, len2) != 0)
		{
			str2 = tempRef_str2.argValue;
			str1 = tempRef_str1.argValue;
			System.out.print("YES");
		}
		else
		{
			str2 = tempRef_str2.argValue;
			str1 = tempRef_str1.argValue;
			System.out.print("NO");
		}
		return 0;
	}


}

