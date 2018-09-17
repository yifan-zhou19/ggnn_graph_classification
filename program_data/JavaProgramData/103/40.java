package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int t;
		int s;
		int l;
		int r;
		int[] c = new int[1000];
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
		}
		for (i = 0;i < l;i++)
		{
			t = 1;
			for (j = 1;i + j < l;j++)
			{
					if (a.charAt(i) == a.charAt(i + j))
					{
						t++;
					}
					else
					{
					break;
					}
			}
			System.out.printf("(%c,%d)",a.charAt(i),t);
			i = i + j - 1;
		}
		System.in.read();
		System.in.read();
	}

}

