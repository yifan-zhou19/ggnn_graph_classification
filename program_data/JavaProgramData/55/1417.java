package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int l;
		int i;
		int m;
		int t;
		int j;
		int sum = 0;
		String n = new String(new char[40]);
		String y = new String(new char[40]);
		String z = new String(new char[40]);
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
		m = 1;
		for (i = 1;i <= l;i++)
		{
			t = n.charAt(l - i);
			if (t < 60)
			{
				sum = sum + (n.charAt(l - i) - 48) * m;
			}
			else if (t < 91)
			{
				sum += (n.charAt(l - i) - 55) * m;
			}
			else
			{
				sum += (n.charAt(l - i) - 87) * m;
			}
			m = m * a;
		}
		//printf("%d",sum);
		i = 0;
		if (sum != 0)
		{
			while (sum != 0)
			{
			i++;
			t = sum % b;
			if (t <= 9)
			{
				y = tangible.StringFunctions.changeCharacter(y, 29 - i, t + 48);
			}
			else
			{
				y = tangible.StringFunctions.changeCharacter(y, 29 - i, t + 55);
			}
			sum = sum / b;
			}
		for (j = 0;j <= i - 1;j++)
		{
			z = tangible.StringFunctions.changeCharacter(z, j, y.charAt(29 - i + j));
		}
		z = tangible.StringFunctions.changeCharacter(z, i, '\0');
		System.out.printf("%s",z);
		}
		else
		{
			System.out.print("0");
		}
	}
}

