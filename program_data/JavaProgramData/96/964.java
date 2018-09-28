package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String ori = new String(new char[101]);
	String temp = new String(new char[4]);
	String res = new String(new char[100]);
	int i = 1;
	int t;
	int s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ori = tempVar.charAt(0);
	}
	temp = tangible.StringFunctions.changeCharacter(temp, 0, ori.charAt(0));
	temp = tangible.StringFunctions.changeCharacter(temp, 1, ori.charAt(1));
	temp = tangible.StringFunctions.changeCharacter(temp, 2, '\0');
	if (Integer.parseInt(temp) < 13)
	{
	if (Integer.parseInt(temp) < 10)
	{
	System.out.printf("0\n%d\n",Integer.parseInt(temp));
	return 0;
	}
	temp = tangible.StringFunctions.changeCharacter(temp, 2, ori.charAt(2));
	temp = tangible.StringFunctions.changeCharacter(temp, 3, '\0');
	i = 2;
	}
	t = Integer.parseInt(temp);
	for (s = i;ori.charAt(i) != '\0';i++)
	{
	res = tangible.StringFunctions.changeCharacter(res, i - s, t / 13 + '0');
	temp = tangible.StringFunctions.changeCharacter(temp, 0, ori.charAt(i + 1));
	temp = tangible.StringFunctions.changeCharacter(temp, 1, '\0');
	if (ori.charAt(i + 1) == '\0')
	{
	t = t % 13;
	}
	else
	{
	t = (t % 13) * 10 + Integer.parseInt(temp);
	}
	}
	if (i == s)
	{
	res = tangible.StringFunctions.changeCharacter(res, 0, '0');
	i++;
	}
	res = tangible.StringFunctions.changeCharacter(res, i - s, '\0');
	System.out.printf("%s\n%d\n",res,t);
	return 0;
	}
}

