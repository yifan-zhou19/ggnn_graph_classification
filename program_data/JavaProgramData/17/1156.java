package <missing>;

public class GlobalMembers
{
	public static void fun(String a)
	{

		int len;
		int i;
		int j;
		int n;
		int bi = 0;
		int zuo;
		int you;
		int hao = 0;
		String b = new String(new char[200]);
		int[] c = new int[200];
		len = a.length();
		for (j = 0;j < len;j++)
		{
			if (a[j].equals('(') || a[j].equals(')'))
			{
				b = tangible.StringFunctions.changeCharacter(b, bi, a[j]);
				c[bi] = j;
				bi += 1;
			}
		}
		for (j = 0;j < bi - 1;j++)
		{
			if (b.charAt(j) == '(' && b.charAt(j + 1) == ')')
			{
				zuo = j;
				you = j + 1;
				hao = 1;
				break;
			}
		}
		if (hao == 0)
		{
			return;
		}
		while (b.charAt(zuo) == '(' && b.charAt(you) == ')')
		{
			b = tangible.StringFunctions.changeCharacter(b, zuo, 1);
			b = tangible.StringFunctions.changeCharacter(b, you, 1);
			zuo -= 1;
			you += 1;
		}
		for (j = 0;j < bi;j++)
		{
			if (b.charAt(j) == 1)
			{
				a[c[j]] = 1;
			}
		}
		fun(a);
	}

	public static int Main()
	{
		int i;
		int n;
		int len;
		int j;
		String a = new String(new char[200]);
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
			len = a.length();
			System.out.println(a);
			fun(a);
			for (j = 0;j < len;j++)
			{
				if (a.charAt(j) != '(' && a.charAt(j) != ')')
				{
					System.out.print(" ");
				}
				else if (a.charAt(j) == '(')
				{
					System.out.print("$");
				}
				else if (a.charAt(j) == ')')
				{
					System.out.print("?");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

