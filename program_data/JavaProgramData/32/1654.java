package <missing>;

public class GlobalMembers
{
	public static void xj(String x, String a)
	{
		int i;
		int j;
		char[] z = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String y = new String(new char[100]);
		for (i = 0;i < 100;i++)
		{
			y = tangible.StringFunctions.changeCharacter(y, i, '0');
		}
		for (i = 0;i < a.length();i++)
		{
			y = tangible.StringFunctions.changeCharacter(y, i + x.length() - a.length(), a[i]);
		}
		for (i = x.length() - 1;i >= 0;i--)
		{
			z[i] = x[i].Substring(10) - y.charAt(i);
		 if (i - 1 >= 0)
		 {
		 x[i - 1] += z[i] / 10 - 1;
		 }
		 z[i] = z[i] % 10 + 48;
		}
		for (i = 0;i < x.length();i++)
		{
			if (z[i] != '0')
			{
				break;
			}
		}
		for (j = i;j < x.length();j++)
		{
			System.out.print(z[j]);
		}
		System.out.print('\n');
	}
	public static void Main()
	{
		int n;
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b = tempVar3.charAt(0);
		 }
		 xj(a, b);
		}
	}
}

