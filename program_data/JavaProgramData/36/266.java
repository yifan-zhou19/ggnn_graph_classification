package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int s;
		int t;
		s = a.length();
		t = b.length();
		int i;
		int j;
		int k;
		char r;
		for (i = 0;i < s;i++)
		{
			for (j = i;j < t;j++)
			{
				if (b.charAt(j) == a.charAt(i))
				{
					r = b.charAt(i);
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
					b = tangible.StringFunctions.changeCharacter(b, j, r);
				}
			}
		}
			k = strcmp(a,b);
			if (k == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
	}
}

