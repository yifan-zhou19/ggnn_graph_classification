package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String sz = new String(new char[400]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * ps;
	for (int i = 0;i <= n;i++)
	{
	sz = new Scanner(System.in).nextLine();
	for (ps = sz; * ps != '\0';ps++)
	{
	if (*ps == 'A')
	{
	*ps = 'T';
	}
	else if (*ps == 'C')
	{
	*ps = 'G';
	}
	else if (*ps == 'T')
	{
	*ps = 'A';
	}
	else if (*ps == 'G')
	{
	*ps = 'C';
	}
	}
	System.out.printf("%s\n",sz);
	}
	}
}

