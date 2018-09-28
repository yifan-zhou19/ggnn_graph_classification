import java.util.*;

/*
  *@ title:?????
  *@ date:2010-11-28
  *@ author:1000012899 ???
  *@ description: ???????
 */
String c = new String(new char[501]);
void huiwen(int, int);
int main()
{
	int l;
	int i;
	int j;
	c = new Scanner(System.in).nextLine();
	l = c.length();
	for (i = 2; i <= l ; i++)
	{
		for (j = 0; j <= l - i ; j++)
		{
			huiwen(j, i);
		}
	}
	return 0;
}
void huiwen(int a, int b)
{
	int i;
	int j;
	int n;
	for (i = 1; i <= (b + 1) / 2; i++)
	{
		if (c.charAt(a - 1 + i) != c.charAt(a + b - i))
		{
			break;
		}
	}
	if (i == (b + 1) / 2 + 1)
	{
		for (i = 1 ; i <= b; i++)
		{
			System.out.print(c.charAt(a - 1 + i));
		}
		System.out.print("\n");
	}
}
