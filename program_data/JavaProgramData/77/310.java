import java.util.*;

String chi = new String(new char[200]);
char boy;
char gir;
int pep;

void zhaoren(int);

int main()
{
	chi = new Scanner(System.in).nextLine();
	pep = chi.length();
	boy = chi.charAt(0);
	gir = chi.charAt(pep - 1);

	zhaoren(pep);

return 0;
}
void zhaoren(int n)
{
	if (n == 0)
	{
		return;
	}

	for (int i = 0; i < pep; i++)
	{
		if (chi.charAt(i) == gir)
		{
			for (int j = i; j >= 0; j--)
			{
				if (chi.charAt(j) == boy)
				{
					System.out.print(j);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					chi = tangible.StringFunctions.changeCharacter(chi, j, '#');
					chi = tangible.StringFunctions.changeCharacter(chi, i, '#');
					zhaoren(n - 2);
					return;
				}
			}

		}
	}
return;
}


