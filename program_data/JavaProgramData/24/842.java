package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int max = 0;
	int x = 0;
	int min = 20;
	int y = 0;
	String string = new String(new char[4000]);
	char[][] str = new char[40][20];
	final String temp = "";
	int k = 0;
	int j = 0;
	int i;
	int n;
	int m;

	String = new Scanner(System.in).nextLine();

	n = String.length();
	for (i = 0;i < n;i++)
	{
	if (String[i] != ' ')
	{
	temp = tangible.StringFunctions.changeCharacter(temp, k, string.charAt(i));
	str[j][k] = string.charAt(i);
	k++;
	}
	else
	{
	str[j] = temp;
	k = 0;
	j++;
	for (m = 0;m < 20;m++)
	{
		temp = temp.substring(0, m);
	}

	}
	if (i == n - 1)
	{
	str[j] = temp;
	for (m = 0;m < 20;m++)
	{
		temp = temp.substring(0, m);
	}
	}


	}
	for (i = 0;i <= j;i++)
	{

	if (String.valueOf(str[i]).length() > max)
	{
	max = String.valueOf(str[i]).length();
	x = i;
	}
	if (String.valueOf(str[i]).length() < min)
	{
	min = String.valueOf(str[i]).length();
	y = i;
	}
	}

	System.out.printf("%s\n",str[x]);
	System.out.printf("%s",str[y]);
	return 0;
	}
}

