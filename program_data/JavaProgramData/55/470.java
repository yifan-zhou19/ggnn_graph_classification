package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int len;
		int i;
		int[] nn = new int[100];
		int c;
		int k = 0;
		int m = 0;
		String n = new String(new char[100]);
		String nnn = new String(new char[100]);
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
		len = n.length();
		for (i = 0;i < len;i++)
		{
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				nn[i] = n.charAt(i) - 'A' + 10;
			}
			else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				nn[i] = n.charAt(i) - 'a' + 10;
			}
			else if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				nn[i] = n.charAt(i) - '0';
			}
			m = m * a + nn[i];
		}
		i = 0;
		while (m != 0)
		{
			nnn = tangible.StringFunctions.changeCharacter(nnn, i, m % b);
			m = m / b;
			i++;
		}
		c = i - 1;
		for (i = c;i >= 0;i--)
		{
			if (nnn.charAt(i) == 0)
			{
				k++;
			}
		}
		if (k == c + 1)
		{
				System.out.print("0");
		}
		else
		{
		for (i = c;i >= 0;i--)
		{
			if (nnn.charAt(i) >= 0 && nnn.charAt(i) <= 9)
			{
				System.out.printf("%d",nnn.charAt(i));
			}
			else if (nnn.charAt(i) >= 10)
			{
				nnn = tangible.StringFunctions.changeCharacter(nnn, i, nnn.charAt(i) - 10 + 'A');
				System.out.printf("%c",nnn.charAt(i));
			}
		}
		}
		System.out.print("\n");
	}


}

