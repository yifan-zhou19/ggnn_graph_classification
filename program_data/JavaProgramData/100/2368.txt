package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int i;
		int j;
		int k;
		int l;
		int t = 0;
			String b = new String(new char[300]);
			int[] c = new int[52];
			for (l = 0;l < 52;l++)
			{
				c[l] = 0;
			}

		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar);
			}
			if (b.charAt(i) == '\n')
			{
				break;
			}

		}
		if (b.charAt(0) == '\n')
		{
			System.out.print("NO\n");
		}
		for (i = 0;i < 52;i++)
		{
		for (j = 0;;j++)
		{
			if (b.charAt(j) == a[i])
			{
				c[i]++;
			}
			if (b.charAt(j) == '\n')
			{
				break;
			}
		}
		}
		for (k = 0;k < 52;k++)
		{
			if (c[k] != 0)
			{
				System.out.printf("%c=%d\n",a[k],c[k]);
			}
		}
		for (l = 0;l < 52;l++)
		{
		if (c[l] != 0)
		{
			t++;
		}
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}

	}
}

