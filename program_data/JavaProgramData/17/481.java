package <missing>;

public class GlobalMembers
{
	//????????????????
	//????????????
	//???????????????? time limit ????
	public static String b = new String(new char[110]);
	public static String a = new String(new char[110]);
	public static int opr(int i) //bug1???????
	{
		int j;
		for (j = i - 1;j >= 0;j--)
		{
			if (b.charAt(j) == '$')
			{
				b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				break;
			}
		}
		return 0;
	}
	public static void tag(tangible.RefObject<String> a, tangible.RefObject<String> b) //????2??????
	{
		int l = a.argValue.length();
		int i;
		for (i = 0;i < l;i++)
		{
			if (a.argValue.charAt(i) == '(')
			{
				b.argValue.charAt(i) = '$';
			}
			else
			{
				if (a.argValue.charAt(i) == ')')
				{
					b.argValue.charAt(i) = '?';
				}
				else
				{
					b.argValue.charAt(i) = ' ';
				}
			}
		}
		b.argValue.charAt(l) = '\0';
	}
	public static int Main()
	{
		int i;
		int l;
		while (scanf("%s",a) != EOF) //??
		{
			l = a.length();
			System.out.printf("%s\n",a); //??
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			tag(tempRef_a, tempRef_b);
			b = tempRef_b.argValue;
			a = tempRef_a.argValue;
			for (i = 0;i < l;i++)
			{
				if (b.charAt(i) == '?') //????
				{
					opr(i);
				}
			}
			System.out.printf("%s\n",b);
		}
		return 0;
	}
}

