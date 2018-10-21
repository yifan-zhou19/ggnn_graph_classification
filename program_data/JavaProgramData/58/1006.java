int judgeletter = char;
int judgeline = char;
int judgenum = char;
void emp(char *);

int main()
{
	int n;
	int i;
	int j;
	int length;
	String s = new String(new char[81]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	s = new Scanner(System.in).nextLine();
	for (i = 0 ; i < n ; i++)
	{
		emp(s);
		s = new Scanner(System.in).nextLine();
		length = s.length();
		if (length == 1)
		{
			System.out.printf("%d\n",(judgeletter(*s) || judgeline(*s)));
			continue;
		}
		else
		{
			if ((judgeletter(*s) || judgeline(*s)) == 0)
			{
				System.out.print("0\n");
				continue;
			}
			else
			{
				for (j = 1 ; * (s.Substring(j)) ; j++)
				{
					if ((judgeletter(*(s.Substring(j))) || judgeline(*(s.Substring(j))) || judgenum(*(s.Substring(j)))) == 0)
					{
						System.out.print("0\n");
						break;
					}
				}
				if (j == length)
				{
					System.out.print("1\n");
				}
			}
		}
	}

	return 0;
}

int judgeletter(char c)
{
	if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

int judgeline(char c)
{
	if (c == '_')
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

int judgenum(char c)
{
	if (c >= '0' && c <= '9')
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

void emp(char * s)
{
	int i;
	for (i = 0 ; * (s + i) ; i++)
	{
		*(s + i) = '\0';
	}
}

