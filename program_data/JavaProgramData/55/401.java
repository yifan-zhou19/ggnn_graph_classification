package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int zhuan = char;
		int a;
		int b;
		int l;
		int i;
		int wei;
		String n = new String(new char[100]);
		int shi;
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
		l = n.length();
		for (i = 0,shi = 0;i <= l - 1;i++)
		{
						   if (i < l - 1)
						   {
						  shi = (shi + zhuan(n.charAt(i))) * a;
						   }
						   else
						   {
						   shi = shi + zhuan(n.charAt(i));
						   }
		}

		for (i = 0;;shi = shi / b,i++)
		{
						   wei = shi % b;
						   if (wei >= 10)
						   {
						   n = tangible.StringFunctions.changeCharacter(n, i, wei - 10 + 'A');
						   }
						   else
						   {
						   n = tangible.StringFunctions.changeCharacter(n, i, wei + '0');
						   }

						   if (shi < b)
						   {
						   break;
						   }
		}
		for (i = i;i >= 0;i--)
		{
		System.out.printf("%c",n.charAt(i));
		}


		return 0;
	}
	public static int zhuan(char b)
	{
		int a;
		if (b >= '0' && b <= '9')
		{
		a = b - 48;
		}
		if (b >= 'a' && b <= 'z')
		{
		a = 10 + b - 'a';
		}
		if (b >= 'A' && b <= 'Z')
		{
		a = 10 + b - 'A';
		}
		return a;
	}

}

