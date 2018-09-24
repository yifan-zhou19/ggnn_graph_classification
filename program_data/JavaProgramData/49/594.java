import java.util.*;

String a = new String(new char[1000]);
void huiwen(int);

int main()
{
	a = new Scanner(System.in).nextLine();
	huiwen(2);
	return 0;
}

void huiwen(int x)
{
	if (x < a.length())
	{
		int i;
		int j;
		int k;
		for (i = 0 ; i < a.length() - x + 1 ; i++)
		{
			for (j = 0 ; j <= (x - 1) / 2 ; j++)
			{
				if (a.charAt(i + j) != a.charAt(i + x - 1 - j))
				{
					break;
				}
			}
			if (j == (x - 1) / 2 + 1)
			{
				for (k = i ; k <= i + x - 1 ; k++)
				{
					System.out.print(a.charAt(k));
				}
				System.out.print("\n");
			}
		}
		huiwen(x + 1);
	}
}
