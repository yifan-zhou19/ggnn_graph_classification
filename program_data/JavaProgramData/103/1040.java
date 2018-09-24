package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		int k;
		String bs = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bs = tempVar.charAt(0);
		}
		int[] a = new int[1000];
		String cs = new String(new char[1000]);
		for (i = 0;bs.charAt(i) != '\0';i++)
		{
			if (bs.charAt(i) >= 'a' && bs.charAt(i) <= 'z')
			{
			bs = tangible.StringFunctions.changeCharacter(bs, i, bs.charAt(i) - 'a'+'A');
			}
			a[i] = 1;
		}
		cs = tangible.StringFunctions.changeCharacter(cs, 0, bs.charAt(0));
		for (i = 1;bs.charAt(i) != '\0';i++)
		{
			if (bs.charAt(i) == cs.charAt(n))
			{
			a[n]++;
			}
			else
			{
				n++;
				cs = tangible.StringFunctions.changeCharacter(cs, n, bs.charAt(i));
			}
		}
		for (i = 0;i <= n;i++)
		{
			System.out.printf("(%c,%d)",cs.charAt(i),a[i]);
		}
	}
}

