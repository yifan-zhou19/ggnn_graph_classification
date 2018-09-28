int stri = char * ;
int main()
{
	char[][] str = new char[1000][1000];
	String[] p = new String[1000];
	String p0;
	int n;
	int i;
	int flag;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= n;i++)
	{
		str[i] = new Scanner(System.in).nextLine();
		p[i] = str[i];
	}

	for (i = 1;i <= n;i++)
	{
		p0 = p[i];
		if (p0 < 'A' || p0>'z' || (p0 > 'Z' && p0 < 'a' && p0 != '_'))
		{
		   System.out.print("0\n");
		   continue;
		}
		else
		{
			if (stri(p0) == 1)
			{
				System.out.print("1\n");
			}
			else
			{
				System.out.print("0\n");
			}
		}
	}
}

int stri(char * str)
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * pi;
	for (pi = str; * pi != '\0';pi++)
	{
		if (*pi < 48 || *pi>'z' || (57 < *pi && *pi < 65) || (*pi>'Z' && *pi < 'a' && *pi != '_'))
		{
		   return 0;
		   break;
		}
	}
	if (*pi == '\0')
	{
		return 1;
	}
}


