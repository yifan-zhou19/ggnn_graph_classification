package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int i;
		int j;
		int d = 0;
		int[] z = new int[100];
		int sum = 0;
		int k;
		String a = new String(new char[100]);
		String s = new String(new char[36]);
		for (i = 0;i < 36;i++)
		{
			if (i >= 0 && i <= 9)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, i + 48);
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, i + 55);
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		d = a.length();
			for (i = 0;i < d;i++)
			{
			if (a.charAt(i) < 123 && a.charAt(i)>96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
			}
		for (i = 0;i < d;i++)
		{
			for (j = 0;j < 36;j++)
			{
				if (a.charAt(i) == s.charAt(j))
				{
					sum = sum + j * Math.pow(b,d - 1 - i);
				}
			}
		}
		for (i = 0;i >= 0;i++)
		{
			if (sum == 0)
			{
				k = i;
				break;
			}
			else
			{
				z[i] = sum % c;
				sum = sum / c;
			}
		}
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf("%c",s.charAt(z[i]));
		}
		if (a.charAt(0) == '0')
		{
			System.out.printf("%c",a.charAt(0));
		}
		return 0;
	}
}

