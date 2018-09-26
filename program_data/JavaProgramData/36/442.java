package <missing>;

public class GlobalMembers
{
	public static int search(String a, String b, int i, int x)
	{
		int q;
		for (q = 0;q <= x - 1;q++)
		{
			if (a[i].equals(b[q]))
			{
			b[q] = '0';
		return (q);
			}
		}
		return (-1);
	}

	public static void Main(String[] args)
	{

		String a = new String(new char[30]);
		String b = new String(new char[30]);
		int m;
		int i;
		int j;
		int z;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
	m = a.length();
	n = b.length();
	if (m != n)
	{
	System.out.print("NO\n");
	}
	else
	{
			for (i = 0;i <= m - 1;i++)
			{
			z = search(a, b, i, m);
		if (z == -1)
		{
			  System.out.print("NO\n");
		   break;
		}
			}
		if (z != -1)
		{
		System.out.print("YES\n");
		}
	}



	}




}

