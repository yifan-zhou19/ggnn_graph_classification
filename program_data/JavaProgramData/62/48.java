import java.util.*;

void s(char[], int);
int main()
{
	String a = new String(new char[10000]);
	a = new Scanner(System.in).nextLine();
	int pos = 0;
	int flag = 1;
	for (; a.charAt(pos) != '\0'; pos++)
	{
		if (a.charAt(pos) == ' ')
		{
			if (pos == 0)
			{
				for (int i = 0; a.charAt(i) != '\0'; i++)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
				}
				pos--;
			}
			else
			{
				if (flag == 0)
				{
					for (int i = pos; a.charAt(i) != '\0'; i++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
					}
					pos--;
				}
				else
				{
					flag = 0;
				}
			}
		}
		else
		{
			flag = 1;
		}
	}
	if (flag == 0)
	{
		a = tangible.StringFunctions.changeCharacter(a, pos - 1, '\0');
	}
	System.out.print(a);
	System.out.print("\n");
	return 0;
}









