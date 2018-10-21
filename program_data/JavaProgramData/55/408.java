package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int temp;
	int[] b = new int[500];
	int n;
	int m;
	int i;
	int j;
	int lala = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	String tempVar = ConsoleInput.scanfRead(" ", 1);
	if (tempVar != null)
	{
		i = Integer.parseInt(tempVar);
	}
	while ((i >= 48 && i <= 57) || (i >= 65 && i <= 90) || (i >= 97 && i <= 122))
	{
		if (i >= 48 && i <= 57)
		{
			temp = i - 48;
		}
		if (i >= 65 && i <= 90)
		{
			temp = i - 55;
		}
		if (i >= 97 && i <= 122)
		{
			temp = i - 87;
		}
		lala = lala * n + temp;
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
	}

	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int c = 0;
	while (lala >= m)
	{
				 b[c] = lala % m;
				 lala = lala / m;
				 c++;
	}
	b[c] = lala;
	for (i = c;i >= 0;i--)
	{
		if (b[i] < 10)
		{
			System.out.print(b[i]);
		}
		else
		{
			System.out.printf("%c",b[i] + 55);
		}
	}

	}

}

