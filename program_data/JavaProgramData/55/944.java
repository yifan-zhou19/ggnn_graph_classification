package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		int[] d = new int[100];
		int x;
		int y;
		int i;
		int j;
		int n;
		int m = 0;
		int p;
		int q;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		k = str.length();
		for (i = 0;i < k;i++)
		{
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 48);
			}
			else if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 55);
			}
			else if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 87);
			}
			n = k - 1 - i;
			q = (int)Math.pow(x,n);
			m = m + str.charAt(i) * q;
		}
		for (i = 0;p != 0;i++)
		{
			d[i] = m % y;
			p = m / y;
			m = p;
		}
		for (j = i - 1;j >= 0;j--)
		{
			if (d[j] >= 0 && d[j] < 10)
			{
				System.out.printf("%ld",d[j]);
			}
			else
			{
				d[j] = d[j] + 55;
				System.out.printf("%c",d[j]);
			}
		}
	}
}

