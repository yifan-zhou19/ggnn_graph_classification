package <missing>;

public class GlobalMembers
{
	public static void zhengli(String a)
	{
		void panduan(char a[]);
		int i;
		int k;
		int j;
		k = a.length();
		for (j = 0;j < 50;j++)
		{
			for (i = 0;i < k;i++)
			{
				if (a[i].equals('$'))
				{
					a[i] = '(';
				}
				else if (a[i].equals('?'))
				{
					a[i] = ')';
				}
			}
			panduan(a);
		}
	}
	public static void panduan(String a)
	{
		int i;
		int k;
		int flag = 0;
		int j;
		String b = new String(new char[110]);
		k = a.length();
		b = tangible.StringFunctions.changeCharacter(b, k, '\0');
		for (i = 0;i < k;i++)
		{
			if (!a[i].equals('(') && !a[i].equals(')'))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			else if (a[i].equals('('))
			{
				if (flag == 1)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
					j = i;
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
				}
				else
				{
					flag = 1;
					j = i;
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
				}
			}
			else
			{
				if (flag == 1)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
					flag = 0;
					b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
				}
			}
		}
		a = b;
	}
	public static void Main()
	{
		int i;
		int k;
		String a = new String(new char[110]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",a);
			panduan(a);
			zhengli(a);
			System.out.printf("%s\n",a);
		}
	}

}

