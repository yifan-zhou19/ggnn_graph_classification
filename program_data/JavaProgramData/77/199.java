int len;
char boy;
char girl;
void paidui(char[]);
int main()
{
	String kids = new String(new char[100]);
	kids = ConsoleInput.readToWhiteSpace(true).charAt(0);
	len = kids.length();
	boy = kids.charAt(0);
	girl = kids.charAt(len - 1);
	paidui(kids);
	return 0;
}
void paidui(char kids[])
{
	int i = 0;
	int j;
	while (kids[i] != girl)
	{
		i++;
	}
	j = i;
	while (kids[j] != boy)
	{
		j--;
	}
	System.out.print(j);
	System.out.print(" ");
	System.out.print(i);
	System.out.print("\n");
	kids[i] = kids[j] = 1;
	if (kids[len - 1] == girl)
	{
		paidui(kids);
	}
}

