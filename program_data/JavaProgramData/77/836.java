// ???:??????
// ??:????
// ????:2011.11.20
void boy(int);
String a = new String(new char[100]);
char ch;
int j = 0;
int flag = 0;

void boy(int i)
{
	do
	{
	if (flag == 1)
	{
		return;
	}
	a = tangible.StringFunctions.changeCharacter(a, j, System.in.read());
	if (j == 0)
	{
		ch = a.charAt(j);
	}
	if (a.charAt(j) == ch)
	{
		j++;
		boy(j - 1);
	}
	else
	{
		System.out.print(i);
		System.out.print(" ");
		System.out.print(j);
		System.out.print("\n");
		j++;
		if (i == 0)
		{
			flag = 1;
		}
		return;
	}
	}while (1 != 0);
}

int main()
{
	int i = 0;
	boy(i);
	return 0;
}

