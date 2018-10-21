String a = new String(new char[50]);
String b = new String(new char[50]);
int f = new int(int,int);
void main()
{
	int len1;
	int len2;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	len1 = a.length();
	len2 = b.length();
	for (i = 0;i <= len2 - len1;i++)
	{
		if (f(len1,i) == 0)
		{
		break;
		}
	}
	System.out.printf("%d\n",i);
}
int f(int len1,int i)
{
	int j;
	int c = 0;
	for (j = 0;j <= len1 - 1;j++)
	{
		c = c + (b.charAt(i + j) - a.charAt(j)) * (b.charAt(i + j) - a.charAt(j));
	}
	return (c);
}


