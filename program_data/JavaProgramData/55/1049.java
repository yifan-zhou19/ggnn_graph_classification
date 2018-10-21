package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int k;
		int s;
		int[] c = new int[32];
		int a;
		int b;
		String n = new String(new char[32]);
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
		m = 0;
		s = 1;
		k = 0;
		i = 31;
		while (i >= 0)
		{
			if (n.charAt(i) >= 48)
			{
				if (n.charAt(i) >= 97)
				{
					n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 87);
				}
				else if (n.charAt(i) >= 65)
				{
					n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 55);
				}
				else
				{
					n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) - 48);
				}
				m = n.charAt(i) * s;
				s = s * a;
				k = k + m;
			}
			i--;
		}
		i = 0;
		do
		{
			c[i] = k % b;
			k = k / b;
			i++;
		}while (k != 0);
		for (--i;i >= 0;i--)
		{
			if (c[i] > 9)
			{
				System.out.printf("%c",c[i] + 55);
			}
			else
			{
				System.out.printf("%d",c[i]);
			}
		}
		System.out.print("\n");
	}

}

