package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int l;
		int s;
		int[] c = new int[1000];
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		l = str1.length();
		s = 0;
		for (i = 0;i < l;i++)
		{
		if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 'A' + 10);
		}
		else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 'a' + 10);
		}
		else
		{
		str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - '0');
		}
		s = str1.charAt(i) + (s * a);
		}
		if (s == 0)
		{
		System.out.print("0");
		}
		for (i = 0;s != 0;i++)
		{
		c[i] = s % b;
		s = s / b;
		}
		for (j = 0;j < i;j++)
		{
		if (c[j] <= 9)
		{
		str2 = tangible.StringFunctions.changeCharacter(str2, i - j - 1, c[j] + '0');
		}
		else
		{
		str2 = tangible.StringFunctions.changeCharacter(str2, i - j - 1, c[j] + 'A' - 10);
		}
		}
		System.out.printf("%s\n",str2);
		System.in.read();
		System.in.read();
	}

}

