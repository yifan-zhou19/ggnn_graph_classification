void Palindrome(char []);
int main()
{
	String str1 = new String(new char[500]);
	str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	Palindrome(str1);
	return 0;
}
void Palindrome(char str1[])
{
	int i;
	int k;
	int m;
	int n;
	int a;
	int b;
	m = str1.length();
	for (i = 1; i < m; i++)
	{
		for (k = 0; k < m; k++)
		{
			for (a = k,b = k + i; a < b; a++,b--)
			{
				if (str1[a] != str1[b])
				{
					break;
				}
			}
			if (a == b + 1 || a == b)
			{
				for (n = k; n <= k + i; n++)
				{
					System.out.print(str1[n]);
				}
				System.out.print("\n");
			}
		}
	}
}

