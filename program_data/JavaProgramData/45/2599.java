package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		int k;
		int i;
		int j;
		int f;
		int l;
		int t = 0;
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
		k = b.length();
		l = a.length();
		for (i = 0;i < k;i++)
		{
			f = 0;
			t = 0;
			c = c.substring(0, t);
			if (b.charAt(i) == a.charAt(0))
			{
				f = i;
				for (j = i;j < i + l;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, t, b.charAt(j));
					t = t + 1;
				}
				c = tangible.StringFunctions.changeCharacter(c, t, '\0');
				if (strcmp(c,a) == 0)
				{
					System.out.printf("%d",f);
				break;
				}
			}
		}
	}


}

