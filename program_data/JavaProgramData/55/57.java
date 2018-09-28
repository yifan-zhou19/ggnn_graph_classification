package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] d = new int[1000];
		int i;
		int n;
		int m;
		int lc;
		int ld = 0;
		int n1;
		int sum = 0;
		String c = new String(new char[1000]);
		String e = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		lc = c.length();
		if (c.charAt(0) == '0')
		{
			System.out.print("0");
		}
		if (c.charAt(0) != '0')
		{
			for (i = 0;i < lc;i++)
			{
				if (c.charAt(i) <= 90 && c.charAt(i) >= 65)
				{
					a[i] = c.charAt(i) - 55;
				}
				if (c.charAt(i) <= 122 && c.charAt(i) >= 97)
				{
					a[i] = c.charAt(i) - 87;
				}
				if (c.charAt(i) <= 57 && c.charAt(i) >= 48)
				{
					a[i] = c.charAt(i) - 48;
				}
			}
			for (i = 0;i < lc;i++)
			{
				n1 = (int)Math.pow(n,i);
				b[i] = a[lc - i - 1] * n1;
				sum = sum + b[i];
			}
			for (i = 0;sum > 0;i++)
			{
				d[i] = sum % m;
				ld++;
				sum = sum / m;
			}

			for (i = ld - 1;i >= 0;i--)
			{
				if (d[i] <= 9 && d[i] >= 0)
				{
					e = tangible.StringFunctions.changeCharacter(e, i, d[i] + 48);
				}
				if (d[i] <= 36 && d[i] >= 10)
				{
					e = tangible.StringFunctions.changeCharacter(e, i, d[i] + 55);
				}
				System.out.printf("%c",e.charAt(i));
			}
		}
	}


}

