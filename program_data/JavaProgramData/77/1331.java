import java.util.*;

String str = new String(new char[101]);

void match(int, char, char);

int main()
{
	str = new Scanner(System.in).nextLine();
	char b = str.charAt(0); //??????
	int len = str.length();
	char g = str.charAt(len - 1); //??????
	match(0, b, g);
	return 0;
}

void match(int i, char b, char g)
{
	int j;
	if (str.charAt(i) == '\0')
	{
		return;
	}
	if (str.charAt(i) == g)
	{
		str = tangible.StringFunctions.changeCharacter(str, i, '*');
		for (j = i - 1; j >= 0; j--)
		{
			if (str.charAt(j) == b)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, '*');
				break;
			}
		}
		System.out.print(j);
		System.out.print(" ");
		System.out.print(i);
		System.out.print("\n");
	}
	match(i + 1, b, g);
	return;
}

