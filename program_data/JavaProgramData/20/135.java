package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int len;
		int max = 0;
	String str = new String(new char[13]);
	String substr = new String(new char[3]);
	final String t = "";
	char c;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		str = tempVar.charAt(0);
	}
	len = str.length();
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		substr = tempVar2.charAt(0);
	}
	c = System.in.read();
	//scanf("%s\n",substr);


	while (c == '\n')
	{
		/*for(i=len;i>0;i--)
		str[i]=str[i-1];
		str[0]=c;
		len++;*/
	for (i = 0;i < len;i++)
	{
		if (str.charAt(i) > max)
		{
			max = str.charAt(i);
		}
	}
	for (i = 0;str.charAt(i) != max;i++)
	{
		;
	}
		for (j = i + 1;j < len;j++)
		{
			t = tangible.StringFunctions.changeCharacter(t, j - i - 1, str.charAt(j));
		}
		str = tangible.StringFunctions.changeCharacter(str, i + 1, '\0');
		str += substr;
		str += t;
		System.out.println(str);
	for (i = 0;i < len;i++)
	{
		t = tangible.StringFunctions.changeCharacter(t, i, '\0'); //puts("t=");puts(t);
	}
		max = 0;

	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		str = tempVar3.charAt(0);
	}
	len = str.length();
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		substr = tempVar4.charAt(0);
	}
	c = System.in.read();



	}
	}
}

