import java.util.*;

void Find(char *);
int main()
{
	int i;
	String str = new String(new char[101]);
	String mark = new String(new char[101]);


	while (str = new Scanner(System.in).nextLine())
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(mark, 0, (Character.SIZE / Byte.SIZE));
		for (i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == '(')
			{
				mark = tangible.StringFunctions.changeCharacter(mark, i, '$');
			}
			if (str.charAt(i) == ')')
			{
				mark = tangible.StringFunctions.changeCharacter(mark, i, '?');
			}
			if (str.charAt(i) != '(' && str.charAt(i) != ')')
			{
				mark = tangible.StringFunctions.changeCharacter(mark, i, ' ');
			}
		}
		Find(mark);
		for (i = mark.length() - 1; i >= 0; i--)
		{
			if (mark.charAt(i) != ' ')
			{
				mark = mark.substring(0, i + 1);
				break;
			}
		}
		for (i = 0; i < mark.length(); i++)
		{
			if (mark.charAt(i) != ' ')
			{
				mark = mark.Substring(i);
				break;
			}
		}
		System.out.print(str);
		System.out.print("\n");
		System.out.print(mark);
		System.out.print("\n");
	}
}

void Find(char mark[])
{
	int i;
	int j = 0;
	for (i = 0; i < mark.length(); i++)
	{
		if (mark[i] == '$')
		{
			for (j = i + 1; j < mark.length(); j++)
			{
				if (mark[j] == '$')
				{
					break;
				}
				else
				{
					if (mark[j] == '?')
					{
						mark[j] = ' ';
						mark[i] = ' ';
						Find(mark);
						return;
					}
				}
			}
		}
	}
}



