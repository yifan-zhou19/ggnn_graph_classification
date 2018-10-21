package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int i;
		int j;
		int a;
		int e;
		int f;
		int d;
		int h;
		int k;
		int m;
		int n;
		int[][] y = new int[100][100];
		String x = new String(new char[10000]);
		a = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		for (i = 0;x.charAt(i);i++)
		{

				if (x.charAt(i) <= 'z' && x.charAt(i) >= 'a')
				{
					x = tangible.StringFunctions.changeCharacter(x, i, x.charAt(i) + 'A'-'a');
				}
		}
		for (i = 0;x.charAt(i);i++)
		{
			if (x.charAt(i) == x.charAt(i + 1))
			{
				a++;
			}
			else
			{
				System.out.printf("(%c,%d)",x.charAt(i),a);
				a = 1;
			}
		}
		return 0;
	}

}

