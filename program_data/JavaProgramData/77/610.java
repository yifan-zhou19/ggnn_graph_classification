import java.util.*;

/**
* @file homework.cpp
* @author ???
* @date 2011-11-16
* @description
* ??????: ????
*/
void Paidui(char[], int);

int main()
{
	int i;
	String a = new String(new char[1000]);
	a = new Scanner(System.in).nextLine();
	for (i = 1; a.charAt(i) != '\0'; i++) // ???1????2
	{
		if (a.charAt(i) == a.charAt(0))
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 1);
		}
		else
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 2);
		}
	}
	a = tangible.StringFunctions.changeCharacter(a, 0, 1);
	Paidui(a, 0);
	return 0;
}

// ?????b????j????????????
void Paidui(char b[], int j)
{
	if (b[j] == 2) // ???????
	{
		int k;
		for (k = j - 1; k >= 0; k--) // ?????????
		{
			if (b[k] == 1)
			{
				System.out.print(k);
				System.out.print(" ");
				System.out.print(j);
				System.out.print("\n");
				b[k] = 0; // ??????
				b[j] = 0; // ??????
				break;
			}
		}
	}
	if (b[0] == 0)
	{
		return; // ?????????????
	}
	Paidui(b, j + 1); // ??????
}

