package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String S = new String(new char[100]);
		String sub = new String(new char[100]);
		String replace = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			S = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			replace = tempVar3.charAt(0);
		}
		int a;
		int b;
		int c;
		int i;
		int j;
		a = S.length();
		b = sub.length();
		c = replace.length();
		int k;
		int m;
		for (i = 0;i < a;i++)
		{
			if (S.charAt(i) == sub.charAt(0))
			{
				for (j = 0;j < b;j++)
				{
					if (S.charAt(i + j) != sub.charAt(j))
					{
						break;
					}
				}
				if (S.charAt(i + b - 1) == sub.charAt(b - 1))
				{
					m = i;
					for (k = 0;k < m;k++)
					{
						System.out.printf("%c",S.charAt(k));
					}
					System.out.printf("%s",replace);
					for (k = i + b;k < a;k++)
					{
						System.out.printf("%c",S.charAt(k));
					}
					break;
				}
			}
		}
		if (i == a)
		{
			System.out.printf("%s",S);
		}
	}




}

