package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String num = new String(new char[100]);
	String ans = new String(new char[100]);
	int i;
	int j;
	int k;
	int t;
	char s;
	for (i = 0;i < 100;i++)
	{
	ans = tangible.StringFunctions.changeCharacter(ans, i, '\0');
	}
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		num = tempVar.charAt(0);
	}
	for (i = 0;num.charAt(i) != '\0';i++)
	{
	}
	if (i <= 1)
	{
	System.out.printf("0\n%s",num);
	}
	else
	{
	j = (num.charAt(0) - '0') * 10 + num.charAt(1) - '0';
	if ((i == 2) && (j <= 13))
	{
	System.out.printf("0\n%s",num);
	}
	else
	{
	for (j = 0;j < i - 2;j++)
	{
	k = (num.charAt(j) - '0') * 10 + num.charAt(j + 1) - '0';
	num = tangible.StringFunctions.changeCharacter(num, j + 1, k % 13 + '0');
	k = k / 13;
	s = k + '0';
	ans = tangible.StringFunctions.changeCharacter(ans, j, s);
	}
	k = (num.charAt(i - 2) - '0') * 10 + num.charAt(i - 1) - '0';
	t = k % 13;
	k = k / 13;
	s = k + '0';
	ans = tangible.StringFunctions.changeCharacter(ans, j, s);
	if (ans.charAt(0) == '0')
	{
	for (j = 0;j < 100;j++)
	{
	ans = tangible.StringFunctions.changeCharacter(ans, j, ans.charAt(j + 1));
	}
	}
	System.out.printf("%s\n%d",ans,t);
	}
	}
	}
}

