package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word_z = new String(new char[50]);
		String word_bz = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word_z = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word_bz = tempVar2.charAt(0);
		}
		int i;
		int j;
		int p = 0;
		int a;
		int b;
		int n1;
		int n2;
		n1 = word_bz.length();
		n2 = word_z.length();
		for (i = 0;i < n1;i++)
		{
			if (word_bz.charAt(i) == word_z.charAt(0))
			{
				a = b = i;
				break;
			}
		}
		for (j = 0;j < n2;j++)
		{
			if (word_bz.charAt(a) == word_z.charAt(j))
			{
				a++;
				p++;
			}
		}
		if (p == n2)
		{
			System.out.printf("%d",b);
		}
		return 0;
	}
}

