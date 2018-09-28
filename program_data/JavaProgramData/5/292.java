package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int w;
		int s;
		float n;
		float p;
		float q;
		float o;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
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
		i = a.length();
		j = b.length();
		w = 0;
		s = 0;
		for (k = 0;a.charAt(k);k++)
		{
			if (a.charAt(k) != 'A' && a.charAt(k) != 'T' && a.charAt(k) != 'G' && a.charAt(k) != 'C')
			{
			w++;
			}
		}
		for (k = 0;b.charAt(k);k++)
		{
			if (b.charAt(k) != 'A' && b.charAt(k) != 'T' && b.charAt(k) != 'G' && b.charAt(k) != 'C')
			{
			w++;
			}
		}
		if ((i != j) || w != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (l = 0;a.charAt(l);l++)
			{
			if (a.charAt(l) == b.charAt(l))
			{
				s++;
			}
			}
		p = i;
		q = s;
		o = q / p;
		if (o > n)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		return 0;
	}
}

