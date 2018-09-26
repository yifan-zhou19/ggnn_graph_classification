package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int from;
		int to;
		String num = new String(new char[33]);
		char[] result = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int dec = 0;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			from = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			to = Integer.parseInt(tempVar3);
		}
		if (num.charAt(0) == '0')
		{
			System.out.print("0");
		}
		else
		{
			//??10??
			for (i = 0;i < num.length();i++)
			{
				dec *= from;
				if (num.charAt(i) >= '0' && num.charAt(i) <= '9')
				{
					dec = dec + num.charAt(i) - '0';
				}
				else if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
				{
					dec = dec + num.charAt(i) - 'A' + 10;
				}
				else if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
				{
					dec = dec + num.charAt(i) - 'a' + 10;
				}
			}
			//??????
			if (to == 10)
			{
				System.out.printf("%d",dec);
			}
			else
			{
				int digit;
				i = 0;
				while (dec != 0)
				{
					digit = dec % to;
					if (digit >= 0 && digit <= 9)
					{
						result[i] = digit + '0';
					}
					else
					{
						result[i] = digit - 10 + 'A';
					}
					i++;
					dec = (dec - digit) / to;
				}
				//????
				for (j = result.length() - 1;j >= 0;j--)
				{
					System.out.print(result[j]);
				}

			}
		}
	}

}

