package <missing>;

public class GlobalMembers
{
	public static void Main()

	{
		int n;
		int i;
		int j;
		int k;
	String[] p = new String[100];
	char[][] s = new char[100][82];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (i = 0;i < n;i++)
	{
	s[i] = new Scanner(System.in).nextLine();

	k = 0;
	p[i] = s[i];
	{
		if (((int) p[i] > 64 && (int) p[i] < 91) || ((int) p[i]>96 && (int) p[i] < 123) || p[i] == '_')
		{
	k = k + 0;
		}
	else
	{
	k = k + 1;
	}
	}
	p[i]++;

	for (; p[i] != '\0';p[i]++)
	{

	if (((int) p[i] > 64 && (int) p[i] < 91) || ((int) p[i]>96 && (int) p[i] < 123) || p[i] == '_' || ((int) p[i]>47 && (int) p[i] < 58))
	{
	k = k + 0;
	}
	else
	{
	k = k + 1;
	}
	}

	if (k == 0)
	{
	System.out.print("1\n");
	}
	else if (k > 0)
	{
	System.out.print("0\n");
	}

	}
	}


}

