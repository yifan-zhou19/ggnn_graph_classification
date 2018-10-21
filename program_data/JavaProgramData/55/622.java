void fun(char[][10],int*,int*,int);
void main()
{
	int i;
	int l;
	int a;
	int b;
	int t = 0;
	int r;
	String n = new String(new char[20]);
	final String m = "";
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}
	l = n.length();
	for (i = 0;i < l;i++)
	{
		if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
		{
			t += (n.charAt(i) - '0') * Math.pow(a,l - i - 1);
		}
		else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
		{
			t += (n.charAt(i) - 'a' + 10) * Math.pow(a,l - i - 1);
		}
		else
		{
			t += (n.charAt(i) - 'A' + 10) * Math.pow(a,l - i - 1);
		}
	}
	if (t == 0)
	{
		System.out.print("0");
	}
	else
	{
		for (i = 0;t > 0;i++)
		{
			r = t % b;
			if (r < 10)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, '0' + r);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, 'A' + (r - 10));
			}
			t /= b;
		}
		for (i = i - 1;i >= 0;i--)
		{
			System.out.printf("%c",*(m.Substring(i)));
		}
	}
}


