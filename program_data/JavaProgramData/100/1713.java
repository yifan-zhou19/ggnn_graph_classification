package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n = 0;
	int m = 0;
	int p = 0;
	int q = 0;
	String s = new String(new char[300]);
	char a = 'Z';
	char k;
	char j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	for (i = 0;s.charAt(i) != '\0';i++)
	{
		if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
		{
		q++;
		}

	}
	if (q == 0)
	{
	System.out.print("No");
	}
	for (k = 'A';k < 'Z';k++)
	{
		n = 0;

		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == k)
			{
			n++;
			}

		}
		if (n != 0)
		{
		System.out.printf("%c=%d\n",k,n);
		}
	}
	for (i = 0;s.charAt(i) != '\0';i++)
	{
		if (s.charAt(i) == a)
		{
		m++;
		}
	}
	if (m != 0)
	{
	System.out.printf("%c=%d\n",a,m);
	}
	for (j = 'a';j <= 'z';j++)
	{
		p = 0;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == j)
			{
			p++;
			}
		}
		if (p != 0)
		{
		System.out.printf("%c=%d\n",j,p);
		}
	}

	return 0;
	}
}

