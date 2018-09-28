void qu(char *);
int main()
{
String a = new String(new char[110]);
String b = new String(new char[110]);
a = new Scanner(System.in).nextLine();
int a1;
int i;
int yu = 0;
a1 = a.length();
for (i = 0;i < a1;i++)
{
yu = a.charAt(i) - '0' + yu * 10;
b = tangible.StringFunctions.changeCharacter(b, i, yu / 13 + '0');
yu = yu % 13;
}
b = tangible.StringFunctions.changeCharacter(b, a1, '\0');
qu(b);
System.out.println(b);
System.out.printf("%d",yu);
return 0;
}
void qu(char * b)
{
int i;
while (b[0] == '0')
{
	int b1 = b.length();
	for (i = 0;i < b1;i++)
	{
		b[i] = b[i + 1];
	}
}
if (b[0] == '\0')
{
	b[0] = '0';
b[1] = '\0';
}

}

