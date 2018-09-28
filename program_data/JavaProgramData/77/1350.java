void fun(char, int);
char a;
char b;
String s = new String(new char[100]);
int main()
{
	int n;
	int i;
	s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	n = s.length();
	a = s.charAt(0);
	b = s.charAt(n - 1);
	for (i = 0; i < n; i++)
	{
		fun(s.charAt(i),i);
	}
	return 0;
}
void fun(char c, int i)
{
	int k;
	int j = 0;
	if (c == a)
	{
		return;
	}
	else
	{
		for (k = 1;; k++)
		{
			if (s.charAt(i - k) == a)
			{
				if (j == 0)
				{
					System.out.print(i - k);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					break;
				}
				else
				{
					j--;
				}
			}
			else
			{
				j++;
			}
		}
	}
	return;
}


