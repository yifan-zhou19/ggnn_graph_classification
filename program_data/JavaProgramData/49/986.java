void sssss(char *);
int main()
{
	int d;
	int t;
	int n;
	int i;
	int j;
	int k;
	String s = new String(new char[500]);
	String sub = new String(new char[500]);
	String rsub = new String(new char[500]);
	int plen;
	s = new Scanner(System.in).nextLine();
	d = s.length();
	for (plen = 2;plen <= d;plen++)
	{
			for (j = 0;j <= d - plen;j++)
			{

				sub = s.substring(j, j + plen);
				sub = tangible.StringFunctions.changeCharacter(sub, plen, '\0');
				rsub = sub;
				sssss(rsub);
				rsub = tangible.StringFunctions.changeCharacter(rsub, plen, '\0');
				if (strcmp(sub,rsub) == 0)
				{
					System.out.printf("%s\n",sub);
				}
			}

	}



return 0;
}
void sssss(char * s)
{
	int d;
	int i;
	char tmp;
	d = s.length();
	for (i = 0;i < (d + 1) / 2;i++)
	{
		tmp = s[i];
		s[i] = s[d - 1 - i];
		s[d - 1 - i] = tmp;
	}
}

