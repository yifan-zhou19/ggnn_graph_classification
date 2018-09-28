package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String str2 = new String(new char[100]);
	str = new Scanner(System.in).nextLine();
	int len = str.length();
	int temp = 0;
	int i;
	int j = 0;
	for (i = 0;i < len;i++)
	{
		if (i == 0)
		{
			temp = str.charAt(i) - '0';
		}
		else if (i == 1 && (temp * 10 + str.charAt(i) - '0') < 13)
		{
			temp = (temp * 10 + str.charAt(i) - '0') % 13;
		}
		else
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, j, (temp * 10 + str.charAt(i) - '0') / 13 + '0');
		temp = (temp * 10 + str.charAt(i) - '0') % 13;
		j++;
		}
	}
	if (j == 0)
	{
		System.out.printf("0\n%d",temp);
	}
	else
	{
		str2 = str2.substring(0, j);
	System.out.printf("%s\n%d",str2,temp);
	}
	return (0);
	}


}

