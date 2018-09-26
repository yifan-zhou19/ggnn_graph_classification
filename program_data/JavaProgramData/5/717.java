package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int i;
		int n;
		int j;
		int k;
		float v;
		j = 0;
		k = 0;
		n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			v = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			j = j + 1;
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			k = k + 1;
			if ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		if (j != k)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				n = n + 1;
			}
		}
		if (v * j < n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

