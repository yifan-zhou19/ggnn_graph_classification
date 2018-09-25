import java.util.*;

String pos = new String(new char[100]);
int[] po = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
int len;
char a;
char b;
void ty(int);
int main()
{
	int i;
	pos = new Scanner(System.in).nextLine();
	a = pos.charAt(0);
	len = pos.length();
	b = pos.charAt(pos.length() - 1);
	for (i = 0; i < len; i++)
	{
		if (pos.charAt(i) == a)
		{
			po[i] = 1;
		}
		else
		{
			po[i] = 2;
		}
	}
	ty(0);

	return 0;
}
void ty(int i)
{
	int j = 0;
	if (i == len - 1)
	{
		System.out.print(0);
		System.out.print(" ");
		System.out.print(i);
		System.out.print("\n");
		return;
	}
	else
	{
		if (po[i] == 2)
		{
		for (j = i - 1; j > 0; j--)
		{
			if (po[j] == 1)
			{
				break;
			}
		}

			System.out.print(j);
			System.out.print(" ");
			System.out.print(i);
			System.out.print("\n");
			po[j] = 0;
			po[i] = 0;
		}

	ty(i + 1);
	}
}
