//*******************
// 1.cpp 
// ??  1200018415
// 2012 11 27
//*******************

String str = new String(new char[101]);
char b;
char g;
int match = new int(int, char, char);

int main()
{

	int len;
	int i;
	str = ConsoleInput.readToWhiteSpace(true).charAt(0);
	len = str.length();
	b = str.charAt(0);
	g = str.charAt(len - 1);
	match(0, b, g); // ????
	return 0;
}

int match(int n, char b, char g)
{
	for (int i = n; str.charAt(i) != '\0'; i++)
	{
		while (str.charAt(n) == '*') // ???????
		{
			n++; // ????
		}
		if (str.charAt(i) == b) // ?????
		{
			str = tangible.StringFunctions.changeCharacter(str, i, '*'); // ????
			int k = match(n + 1, b, g); // ??????
			System.out.print(n);
			System.out.print(" ");
			System.out.print(k);
			System.out.print("\n");
		}
		else
		{
			if (str.charAt(i) == g) // ?????
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '*'); // ??
				return n; // ?????
			}
		}
	}
}






