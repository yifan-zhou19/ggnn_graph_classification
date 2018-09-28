package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int n;
	int k = 0;
	int p = 1;
	int m = 0;
	String a = new String(new char[1000]);
	char[][] b = new char[300][50];
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (i = 0;i < n;i++)
	{
		if (a.charAt(i) != ' ')
		{
		b[m][k] = a.charAt(i);
		k++;

		}
		else if ((a.charAt(i) == ' ') && (a.charAt(i - 1) != ' '))
		{
		b[m][k] = '\0';
		m++;
		k = 0;
		p++;
		}
		else
		{
		m = m;
		k = 0;
		p = p;
		}

	}
	b[m][k] = '\0';
	if (p == 1)
	{
	System.out.printf("%d",String.valueOf(b[0]).length());
	}
	else
	{
	for (i = 0;i < p - 1;i++)
	{
	System.out.printf("%d,",String.valueOf(b[i]).length());
	}
	System.out.printf("%d",String.valueOf(b[p - 1]).length());
	}

	return 0;
	}


}
