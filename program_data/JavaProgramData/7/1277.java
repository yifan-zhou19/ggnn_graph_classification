package <missing>;

public class GlobalMembers
{
	//****************************
	//?????? 1200012896*****
	//???2013/1/4         *****
	//???????         *****
	//****************************
	public static int Main()
	{
		int len;
		int len1;
		int flag = 0;
		int i;
		int j;
		int k;
		String str = new String(new char[256]);
		String str1 = new String(new char[256]);
		String str2 = new String(new char[256]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len = str.length();
		len1 = str1.length();
		for (i = 0; i <= len - len1; i++) //??????????len-len1???
		{
			for (j = 0; j <= len1 - 1; j++) //????????????
			{
				if (str.charAt(i + j) == str1.charAt(j))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			if (j == len1) //????????????????????????????
			{
				for (k = 0; k < i; k++)
				{
					System.out.print(str.charAt(k));
				}
				System.out.print(str2);
				for (k = i + j; k < len; k++)
				{
					System.out.print(str.charAt(k));
				}
				flag = 1;
				break;
			}
		}
		if (flag == 0) //?????????
		{
			System.out.print(str);
		}
		return 0;
	}
}

