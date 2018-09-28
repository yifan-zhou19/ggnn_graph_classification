package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String bjs = new String(new char[100]);
		String js = new String(new char[100]);
		int n;
		int l1;
		int l2;
		int i;
		int j;
		int cha;
		int c;
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
					bjs = tempVar2.charAt(0);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					js = tempVar3.charAt(0);
				}
			l1 = bjs.length();
			l2 = js.length();
			cha = l1 - l2;
			for (j = (l2 - 1);j >= 0;j--)
			{
				if (bjs.charAt(j + cha) < js.charAt(j))
				{
					bjs = tangible.StringFunctions.changeCharacter(bjs, j + cha, bjs.charAt(j + cha) + 10 - js.charAt(j) + '0');
					c = 1;
					bjs = tangible.StringFunctions.changeCharacter(bjs, j + cha - 1, bjs.charAt(j + cha - 1) - c);
				}
				else
				{
					bjs = tangible.StringFunctions.changeCharacter(bjs, j + cha, bjs.charAt(j + cha) - js.charAt(j) + '0');
				}
			}
			for (j = 0;j < l1;j++)
			{
			System.out.printf("%c",bjs.charAt(j));
			}
			System.out.print("\n");
			System.out.print("\n");
		}
	}
}

