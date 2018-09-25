package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String str = new String(new char[10]);
	String substr = new String(new char[3]);
	String res = new String(new char[15]);
	char max;
	int i;
	int j;
	int l;
	int k;
	while (scanf("%s %s",str,substr) != EOF)
	{
		l = str.length();
		max = str.charAt(0);
		for (i = 0;i < l;i++)
		{
		if (max < str.charAt(i))
		{
			max = str.charAt(i);
		}
		}
		for (i = 0;i < l;i++)
		{
			if (str.charAt(i) != max)
			{
				res = tangible.StringFunctions.changeCharacter(res, i, str.charAt(i));
			}
		else
		{
			res = tangible.StringFunctions.changeCharacter(res, i, str.charAt(i));
			i++;
			break;
		}
		}
		for (j = 0;j < 3;j++)
		{
			res = tangible.StringFunctions.changeCharacter(res, i + j, substr.charAt(j));
		}
		for (;i < l;i++)
		{
			res = tangible.StringFunctions.changeCharacter(res, i + j, str.charAt(i));
		}
		for (k = 0;k < i + j;k++)
		{
		System.out.printf("%c",res.charAt(k));
		}
		System.out.print("\n");
	}
	}
}

