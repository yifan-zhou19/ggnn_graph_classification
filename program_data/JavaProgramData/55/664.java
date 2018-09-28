package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int i;
	int k = -1;
	int dec = 0;
	int[] temp = new int[33];
	String num = new String(new char[33]);
	String result = new String(new char[33]);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = num.length();
	for (i = 0;i < n;i++)
	{
	if (num.charAt(i) >= 'A' && num.charAt(i) <= 'Z')
	{
	num = tangible.StringFunctions.changeCharacter(num, i, num.charAt(i) + 'a'-'A');
	}
	}
	for (i = 0;i < n;i++)
	{
		if (num.charAt(i) >= 'a' && num.charAt(i) <= 'z')
		{
	dec = dec * a + (num.charAt(i) - 'a' + 10);
		}
	else
	{
	dec = dec * a + (num.charAt(i) - '0');
	}
	}
	if (dec == 0)
	{
	System.out.print('0');
	System.out.print("\n");
	}
	else
	{
	while (dec > 0)
	{
	k = k + 1;
	temp[k] = dec % b;
	dec = (dec - dec % b) / b;
	}
	}
	for (i = k;i >= 0;i--)
	{
	if (temp[i] < 10)
	{
	result = tangible.StringFunctions.changeCharacter(result, i, temp[i] + '0');
	}
	else
	{
	result = tangible.StringFunctions.changeCharacter(result, i, temp[i] + 'A' - 10);
	}
	System.out.print(result.charAt(i));
	}
	System.out.print("\n");
	return 0;
	}

}

