package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String A = new String(new char[200]);
	String B = new String(new char[200]);
	int a;
	int b;
	int i = 0;
	int m = 0;
	int n = 0;
	int k = 0;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		A = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b = Integer.parseInt(tempVar3);
	}

	while (A.charAt(i) != '\0')
	{
		n = n * a;
		if (A.charAt(i) <= 60)
		{
			n = n + A.charAt(i) - 48;
		}
		else if (A.charAt(i) <= 90)
		{
			n = n + A.charAt(i) - 55;
		}
		else
		{
			n = n + A.charAt(i) - 87;
		}
		i++;
	}

	k = n;
	i = 0;
	if (k == 0)
	{
		System.out.printf("%ld",k);
	}


	while (n > 0)
	{
		m = n % b;
		if (m <= 9)
		{
			B = tangible.StringFunctions.changeCharacter(B, i, m + 48);
		}
		else if (m >= 10)
		{
			B = tangible.StringFunctions.changeCharacter(B, i, m + 55);
		}
		n = n / b;
		i++;
	}

	B = tangible.StringFunctions.changeCharacter(B, i, '\0');
	m = B.length();
	n = k;
	i = m - 1;

	while (i >= 0)
	{
		m = n % b;
		if (m <= 9)
		{
			B = tangible.StringFunctions.changeCharacter(B, i, m + 48);
		}
		else if (m >= 10)
		{
			B = tangible.StringFunctions.changeCharacter(B, i, m + 55);
		}
		n = n / b;
		i--;
	}

	System.out.printf("%s\n",B);


	}
}

