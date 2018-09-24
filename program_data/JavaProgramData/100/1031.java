package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		char stan;
		stan = 'a';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		int k;
		k = zfc.length();
		int e = 0;
		String out = new String(new char[300]);
		int[] ab = new int[300];
		int i;
		for (i = 0;i < k;i++)
		{
			if (zfc.charAt(i) == 'a' || zfc.charAt(i) == 'b' || zfc.charAt(i) == 'c' || zfc.charAt(i) == 'd' || zfc.charAt(i) == 'e' || zfc.charAt(i) == 'f' || zfc.charAt(i) == 'g' || zfc.charAt(i) == 'h' || zfc.charAt(i) == 'i' || zfc.charAt(i) == 'j' || zfc.charAt(i) == 'k' || zfc.charAt(i) == 'l' || zfc.charAt(i) == 'm' || zfc.charAt(i) == 'n' || zfc.charAt(i) == 'o' || zfc.charAt(i) == 'p' || zfc.charAt(i) == 'q' || zfc.charAt(i) == 'r' || zfc.charAt(i) == 's' || zfc.charAt(i) == 't' || zfc.charAt(i) == 'u' || zfc.charAt(i) == 'v' || zfc.charAt(i) == 'w' || zfc.charAt(i) == 'x' || zfc.charAt(i) == 'y' || zfc.charAt(i) == 'z')
			{
				int a = 0;
				int sum = 1;
				for (int j = 0;j < e;j++)
				{
					if (zfc.charAt(i) == out.charAt(j))
					{
						a = 1;
					}
				}
				if (a == 0)
				{
					out = tangible.StringFunctions.changeCharacter(out, e, zfc.charAt(i));
					for (int t = i + 1;t < k;t++)
					{
						if (zfc.charAt(t) == zfc.charAt(i))
						{
							sum++;
						}
					}
					ab[e] = sum;
					e++;
				}
			}
		}
		if (e == 0)
		{
			System.out.print("No");
		}
		char data;
		int x;
		for (i = 0;i < e;i++)
		{
			for (int j = i + 1;j < e;j++)
			{
				if (out.charAt(i) > out.charAt(j))
				{
					data = out.charAt(i);
					out = tangible.StringFunctions.changeCharacter(out, i, out.charAt(j));
					out = tangible.StringFunctions.changeCharacter(out, j, data);
					x = ab[i];
					ab[i] = ab[j];
					ab[j] = x;
				}
			}
		}
		for (i = 0;i < e;i++)
		{
			System.out.printf("%c=%d\n",out.charAt(i),ab[i]);
		}
		return 0;
	}

}

