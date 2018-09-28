package <missing>;

public class GlobalMembers
{
	public static char a;
	public static char b;
	public static String s = new String(new char[10000]);
	public static int numa = 1;
	public static int numb = 0;
	public static int[] ida = new int[10000];
	public static int[] idb = new int[10000];
	public static void test(int x)
	{
		int i;
		for (i = 0;i < numa + numb;i++)
		{
			if (s.charAt(i) == a)
			{
				ida[x] = i;
			}
			else if (s.charAt(i) == b)
			{
				idb[x] = i;
				s = tangible.StringFunctions.changeCharacter(s, ida[x], ' ');
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				if (x < (numa + numb) / 2 - 1)
				{
					test(x + 1);
				}
			}
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		s = tangible.StringFunctions.changeCharacter(s, 0, a);
		int i;
		for (i = 1;;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, tempVar2);
			}
			if (s.charAt(i) == a)
			{
				numa++;
			}
			else if (s.charAt(i) != a)
			{
				b = s.charAt(i);
				numb++;
			}
			if (numa == numb)
			{
				break;
			}
		}
		test(0);
		for (i = 0;i < (numa + numb) / 2;i++)
		{
			System.out.printf("%d %d\n",ida[i],idb[i]);
		}
		return 0;
	}



}

