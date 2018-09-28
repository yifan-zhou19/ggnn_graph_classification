package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] d = new int[255];
		int[] c = new int[255];
		int i;
		int lena;
		int lenb;
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
		lena = a.length();
		lenb = b.length();
		for (i = 0;i < lena;i++)
		{
			c[a.charAt(i)]++;
		}
		for (i = 0;i < lenb;i++)
		{
			d[b.charAt(i)]++;
		}
		for (i = 65;i <= 122;i++)
		{
			if (d[i] != c[i])
			{
				System.out.print("NO");
				return 0;
			}
		}
		System.out.print("YES");
		return 0;
	}
}

