import java.util.*;

int change = int;

final int N = 100 + 1;
String s = new String(new char[N]);
String a = new String(new char[N]);
String b = new String(new char[N]);
String c = new String(new char[N]);
int la = 0;
int ls = 0;

int main()
{
	int p = 0;
	s = new Scanner(System.in).nextLine();
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = ConsoleInput.readToWhiteSpace(true).charAt(0);
	la = a.length();
	ls = s.length();
	if (s.charAt(p) == a.charAt(0))
	{
		p = p + change(p);
	}
	while (p < ls)
	{
		if ((s.charAt(p) == a.charAt(0)) && (s.charAt(p - 1) == ' '))
		{
			p = p + change(p);
		}
		else
		{
			System.out.print(s.charAt(p));
			p++;
		}
	}
	System.out.print("\n");
	return 0;
}


int change(int p)
{
	int i;
	int j;
	for (i = 0;i < la;i++)
	{
		if (s.charAt(p + i) != a.charAt(i))
		{
			break;
		}
	}
	if ((i == la) && (s.charAt(p + la) == ' ' || s.charAt(p + la) == '\0'))
	{
		System.out.print(b);
		return i;
	}
	for (j = 0;j < i;j++)
	{
		System.out.print(s.charAt(p + j));
	}
	return i;
}

