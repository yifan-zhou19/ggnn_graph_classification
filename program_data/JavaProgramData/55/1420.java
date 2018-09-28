//*********************************************
//*???????                            **
//*?????? 1100012914                   **
//*???2011.11.14                          **
//*********************************************


String num1 = new String(new char[1000000]);
String num2 = new String(new char[100000]);
int a;
int b;
int c;
int x = 0;
int i;
int len1;
int len2;
void change(int);
int main()
{
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	num1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	len1 = num1.length();
	int t;
	int j;

	for (j = 0; j < len1; j++)
	{
		if (num1.charAt(j) >= 'a' && num1.charAt(i) <= 'z')
		{
			t = num1.charAt(j) - 'a' + 10;
			x = x * a + t;
		}
		else
		{
			if (num1.charAt(j) >= 'A' && num1.charAt(j) <= 'Z')
			{
				t = num1.charAt(j) - 'A' + 10;
				x = x * a + t;
			}
			else
			{
				t = num1.charAt(j) - '0';
				x = x * a + t;
			}
		}
	}

	change(x);

	len2 = num2.length();
	for (i = len2 - 1; i >= 0; i--)
	{
		System.out.print(num2.charAt(i));
	}
	i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	return 0;
}
void change(int x)
{
	int z;
	int h = 0;
	char ch;
	if (x == 0)
	{
		System.out.print(0);
		System.out.print("\n");
	}
	else
	{
		while (x != 0)
		{
		z = x % b;
		x = x / b;
		if (z >= 0 && z <= 9)
		{
			ch = z + '0';
			num2 = tangible.StringFunctions.changeCharacter(num2, h, ch);
			h++;
		}
		else
		{
			z = z - 10;
			ch = z + 'A';
			num2 = tangible.StringFunctions.changeCharacter(num2, h, ch);
			h++;
		}
		}
	}
}

