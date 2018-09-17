package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[300]);
	char temp = '\0';
	int i;
	int j;
	int l = 1;
	int k = 0;
	int sum = 0;
	int n;
	str = new Scanner(System.in).nextLine();
	n = str.length();
	for (i = 1;i < n;i++)
	{
		for (j = 0;j < n - i;j++)
		{
		if (str.charAt(j) > str.charAt(j + 1))
		{
			temp = str.charAt(j);
			str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
			str = tangible.StringFunctions.changeCharacter(str, j + 1, temp);
		}
		}
	}
	temp = '\0';
	for (i = 0;i < 300;i++)
	{
	if (str.charAt(i) == '\0')
	{
	break;
	}
	else if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122))
	{
	for (j = i + 1;j < 300;j++)
	{
	if (str.charAt(j) == '\0')
	{
	break;
	}
	else if (str.charAt(j) == str.charAt(i))
	{
	l = l + 1;
	temp = str.charAt(j);
	}
	}
	System.out.printf("%c=%d\n",str.charAt(i),l);
	i = i + l - 1;
	l = 1;
	}
	}
	if (temp == '\0')
	{
		System.out.print("No\n");
	}
	}
}

