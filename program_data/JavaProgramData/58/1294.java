String s = new String(new char[100]);
int pd = int;
int main()
{
	int n;
	int i;
	int j;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n != 0)
	{
		q = 0;
		s = new Scanner(System.in).nextLine();
		for (i = 'a';i <= 'z';i++)
		{
			if (s.charAt(0) == i)
			{
				q = 1;
			}
		}
		for (i = 'A';i <= 'Z';i++)
		{
			if (s.charAt(0) == i)
			{
				q = 1;
			}
		}
		if (s.charAt(0) == '_')
		{
			q = 1;
		}
		for (i = 1;s.charAt(i) != '\0';i++)
		{
			 if (pd(i) == 0)
			 {
				 q = 0;
			 }
		}
		if (q == 1)
		{
			System.out.print("1\n");
		}
		else
		{
			System.out.print("0\n");
		}
		n--;
	}
	return 0;
}
int pd(int t)
{
	int i;
	int q;
	q = 0;
	for (i = 1;s.charAt(i) != '\0';i++)
	{
	for (i = 'a';i <= 'z';i++)
	{
		if (s.charAt(t) == i)
		{
			q = 1;
		}
	}
	}
	for (i = 'A';i <= 'Z';i++)
	{
		if (s.charAt(t) == i)
		{
			q = 1;
		}
	}
	if (s.charAt(t) == '_')
	{
		q = 1;
	}
	for (i = '0';i <= '9';i++)
	{
		if (s.charAt(t) == i)
		{
			q = 1;
		}
	}
	return q;
}




