import java.util.*;

void e(int,int);
String a = new String(new char[100]);
int main()
{
	int i = 0;
	a = new Scanner(System.in).nextLine();
	while (a.charAt(i) != '\0')
	{
		i++;
	}
	e(0,i - 1);
	return 0;
}
void e(int b,int c)
{
	int t = 0;
	int j = 0;
	if (b == c - 1)
	{
		System.out.print(b);
		System.out.print(" ");
		System.out.print(c);
		System.out.print('\n');
	}
	else
	{
		j = b;
		while (true)
		{
			if (a.charAt(j) == a.charAt(0))
			{
				t++;
			}
			if (a.charAt(j) == a.charAt(c))
			{
				t--;
			}
			if (t == 0)
			{
				break;
			}
			j++;
		}
		if (j == c)
		{
			e(b + 1,c - 1);
			System.out.print(b);
			System.out.print(" ");
			System.out.print(c);
			System.out.print('\n');
		}
		else
		{
			e(b,j);
			e(j + 1,c);
		}
	}
}
