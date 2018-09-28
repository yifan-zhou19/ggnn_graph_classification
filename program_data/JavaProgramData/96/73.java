package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String c = new String(new char[100]);
		int l;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (int i = 0;i < l;i++)
		{
		b[i] = a.charAt(i) - '0';
		}
		if (l != 1)
		{
		for (int j = 0;j < l - 1;j++)
		{
				a = tangible.StringFunctions.changeCharacter(a, j, (b[j] * 10 + b[j + 1]) / 13 + '0');
				b[j + 1] = (b[j] * 10 + b[j + 1]) % 13;
		}
		a = tangible.StringFunctions.changeCharacter(a, l - 1, '\0');
		if (a.charAt(0) == '0' && l != 2)
		{
					 for (int k = 1;k < l;k++)
					 {
					 a = tangible.StringFunctions.changeCharacter(a, k - 1, a.charAt(k));
					 }
		}
		System.out.printf("%s\n%d",a,b[l - 1]);
		}
		else
		{
		System.out.printf("0\n%d",b[0]);
		}
		System.in.read();
		System.in.read();
	}
}

