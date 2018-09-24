String a = new String(new char[1000]);
int judge = new int(int,int);
int main()
{
	for ((a; = ConsoleInput.readToWhiteSpace(true)).length() > 0)
	{
	System.out.print(a);
	System.out.print("\n");
	judge(0,0);
	System.out.print(a);
	System.out.print("\n");
	}
return 0;
}
int judge(int i,int l)
{
	int t;
if (a.charAt(i) == '\0')
{
	return -1;
}
if (a.charAt(i) == '(')
{
	t = judge(i + 1,l + 1);
a = tangible.StringFunctions.changeCharacter(a, i, (t == -1)?'$':' ');
return (t == -1)?-1:judge(i + 1,l);
}

else if (a.charAt(i) == ')')
{
	a = tangible.StringFunctions.changeCharacter(a, i, l == 0?'?':' ');
return (l == 0)?judge(i + 1,l):i;
}
else
{
	a = tangible.StringFunctions.changeCharacter(a, i, ' ');
	return judge(i + 1,l);
}


}


