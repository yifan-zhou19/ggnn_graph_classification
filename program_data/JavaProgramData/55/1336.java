//*****************************
//*??? :????           *
//*??   :???             *
//*??   :2011?11?         *
//*****************************
void zhuan(int, char [], int);
int main()
{
	int a;
	int b;
	String n = new String(new char[101]);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	zhuan(a, n, b);
	return 0;
}
void zhuan(int a, char n[], int b)
{
	int i;
	int[] m = new int[101];
	int s;
	int t;
	for (i = 0; ; i++)
	{
		if (n[i] == '\0')
		{
			break;
		}
		if (n[i] >= 'a' && n[i] <= 'z')
		{
			m[i] = n[i] - 'a' + 10;
			continue;
		}
		if (n[i] >= 'A' && n[i] <= 'Z')
		{
			m[i] = n[i] - 'A' + 10;
		}
		else
		{
			m[i] = n[i] - '0';
		}
	}
	t = i;
	s = m[0];
	if (s == 0)
	{
		System.out.print(0);
	}
	for (i = 0; i < t - 1; i++)
	{
		s = s * a + m[i + 1];
	}
	for (i = 0; ; i++)
	{
		if (s == 0)
		{
			break;
		}
		m[i] = s % b;
		s = s / b;
	}
	t = i - 1;
	for (i = t; i >= 0; i--)
	{
		if (m[i] < 10)
		{
			System.out.print(m[i]);
		}
		else
		{
			System.out.print((char)(m[i] - 10 + 'A'));
		}
	}



}


