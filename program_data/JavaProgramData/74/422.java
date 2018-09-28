/* Note:Your choice is C IDE */
int huiwen = int;
int sushu = int;
void main()
{
	int m;
	int n;
	int i;
	int sign = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = m;i <= n;i++)
	{
		if (huiwen(i) && sushu(i))
		{
			if (sign == 0)
			{
				sign = 1;
				System.out.printf("%d",i);
			}
			else
			{
				System.out.printf(",%d",i);
			}
		}
	}
	if (sign == 0)
	{
		System.out.print("no");
	}
}

int huiwen(int a)
{
	int i;
	int lb;
	final String b = "";
	final String c = "";
	for (i = 0;;i++)
	{
		if (a == 0)
		{
			break;
		}
		b = tangible.StringFunctions.changeCharacter(b, i, a % 10 + '0');
		a = a / 10;
	}
	lb = b.length();
	for (i = 0;i <= lb - 1;i++)
	{
	  c = tangible.StringFunctions.changeCharacter(c, i, b.charAt(lb - 1 - i));
	}
	if (strcmp(c,b) == 0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

int sushu(int a)
{
	int i;
	for (i = 2;i < a;i++)
	{
	  if (a % i == 0)
	  {
		  break;
	  }
	}
	if (i == a)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

