package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1001]);
		int i;
		int j;
		int l;
		int y;
		int[] x = new int[100];
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
			y = a.charAt(i) - 'A';
		 x[y]++;
		 if (a.charAt(i) == a.charAt(i + 1))
		 {
			 continue;
		 }
		 else
		 {
			 System.out.printf("(%c,%d)",a.charAt(i),x[y]);
		   x[y] = 0;
		 }
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

