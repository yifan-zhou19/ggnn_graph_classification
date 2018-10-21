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
	char[][] s = new char[20][50];
	int i;
	int k;
	String m;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
	}
	for (i = 0;i < n;i++)
	{

		for (m = s[i]; m != '\0';m++)
		{
		}
		m--;

		if (m == 'r' || m == 'y')
		{
			*(m - 1) = '\0';
		}
		else
		{
			*(m - 2) = '\0';
		}
		System.out.printf("%s\n",s[i]);
	}
	return 0;
	}



}

