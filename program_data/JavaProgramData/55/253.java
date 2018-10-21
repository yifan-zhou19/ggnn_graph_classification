package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int t;
		int p;
		String a = new String(new char[50]);
		String c = new String(new char[50]);
		int[] b = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		t = 0;
		for (j = 0;a.charAt(j) != '\0';j++)
		{
			if ('a' <= a.charAt(j) && a.charAt(j) <= 'z')
			{
				b[j] = a.charAt(j) - 87;
			}
			else if ('A' <= a.charAt(j) && a.charAt(j) <= 'Z')
			{
				b[j] = a.charAt(j) - 55;
			}
			else if ('0' <= a.charAt(j) && a.charAt(j) <= '9')
			{
				b[j] = a.charAt(j) - 48;
			}
		}
		for (i = 0;i <= j - 1;i++)
		{
			t = Math.pow(n,j - i - 1) * b[i] + t;
		}
		p = t;
		if (t == 0)
		{
			System.out.print("0");
		}
		else
		{
		for (k = 0;t != 0;k++)
		{
			t = t / m;
		}
		for (i = k - 1;i >= 0;i--)
		{
			if ((p % m) >= 10)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, p % m + 55);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, p % m + 48);
			}
			p = (p - p % m) / m;
		}
		c = tangible.StringFunctions.changeCharacter(c, k, '\0');
		System.out.println(c);
		}
	}

}

