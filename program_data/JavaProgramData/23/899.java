package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		char[] str1 = {'a', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int len;
		int i;
		int j;
		int a;
		int k;
		int b = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (j = 0;j < len;j++)
		{
			if (str.charAt(j) == ' ')
			{
				break;
			}
		}
		if (j == len)
		{
			System.out.printf("%s",str);
		}
		else

		{
			for (j = len - 1;j >= 0;j--)
			{
			if (str.charAt(j) == ' ')
			{
				j--;
			continue;
			}
		else
		{
			break;
		}
			}
		for (i = j;i >= 0;i--)
		{
			if (str.charAt(i) == ' ')
			{
				a = i;
				for (j = i + 1, k = b;(str.charAt(j) != ' ') && (j < len);j++, k++)
				{
					str1[k] = str.charAt(j);
				}
				str1[k] = ' ';
				b = k + 1;
			}
		}

		for (i = 0;i < a;i++,k++)
		{
		   str1[k + 1] = str.charAt(i);
		}
		System.out.printf("%s",str1);

		}
		return 1;
	}

}
