package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int temp = 0;
		int mod = 0;
		int lth = 0;
		final String num = "";
		char[] result = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = tempVar.charAt(0);
		}
		lth = num.length();
		if (lth == 1)
		{
			System.out.printf("0\n%s",num);
		}
		else
		{



		for (i = 0;i < lth - 1;i++) // range!!!
		{
			if (i == 0)
			{
				result[i] = (((num.charAt(i) - '0') * 10 + (num.charAt(i + 1) - '0')) / 13) + '0';
				mod = ((num.charAt(i) - '0') * 10 + (num.charAt(i + 1) - '0')) % 13;
			}
			else
			{
				temp = mod * 10 + (num.charAt(i + 1) - '0');
				result[i] = (temp / 13) + '0';
				mod = temp % 13;
			}
		}
		result[i] = '\0';
	/*	if (strlen(result)==1)
		{
			printf("0");
		}
	*/

		for (i = 0;;i++)
		{
			if (i == 0)
			{
				if (result[i] == '0' && result[i + 1] != '\0')
				{
					continue;
				}
				else
				{
					System.out.printf("%c",result[i]);
				}
			}
			else
			{
				if (result[i] == '\0')
				{
					break;
				}
				System.out.printf("%c",result[i]);
			}
		}
		System.out.printf("\n%d",mod);




		}
		return 0;
	}

}

