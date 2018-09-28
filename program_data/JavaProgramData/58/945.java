int check = char [];
int main()
{
	int n;
	int i;
	String s = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		s = new Scanner(System.in).nextLine();
		System.out.printf("%d\n",check(s));
	}
	return 0;
}
int check(char s[])
{
	int i;
	int count = 0;
	if (s[0] == '_' || (s[0] <= 'z' && s[0] >= 'a') || (s[0] <= 'Z' && s[0] >= 'A'))
	{
		count++;
	}
	else
	{
		return 0;
	}
	for (i = 1;s[i] != '\0';i++)
	{
		if ((s[i] <= '9' && s[i] >= '0') || (s[i] <= 'z' && s[i] >= 'a') || (s[i] <= 'Z' && s[i] >= 'A') || (s[i] == '_'))
		{
			count++;
		}
		else
		{
			count = 0;
			break;
		}
	}
	if (count != 0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

