package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int m = 0;
		int i;
		int[] c = new int[100];
		int k = 1;
		int e = 0;
		int d = 0;
		int sum = 0;
		String n = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		m = n.length();
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			if (n.charAt(i) >= 'a')
			{
				c[i] = (int)(n.charAt(i)) - 87;
			}
			else if (n.charAt(i) >= 'A')
			{
				c[i] = (int)(n.charAt(i)) - 55;
			}
			else
			{
				c[i] = (int)(n.charAt(i)) - 48;
			}
		}
		for (i = m - 1;i >= 0;i--)
		{
			sum += c[i] * k;
			k *= a;
		}
		for (i = 0,k = 1;sum > 0;i++)
		{
			c[i] = sum % b;
			sum = (sum - c[i]) / b;
			k *= b;
			e++;
		}
		for (i = e-1;i >= 0;i--)
		{
			if (c[i] < 10)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, (char)(c[i] + 48));
			}
			else
			{
				n = tangible.StringFunctions.changeCharacter(n, i, (char)(c[i] + 55));
			}
			System.out.printf("%c",n.charAt(i));
			d = 1;
		}
		if (d == 0)
		{
			System.out.print("0");
		}
	}



}

