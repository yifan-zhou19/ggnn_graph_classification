package <missing>;

public class GlobalMembers
{
	public static int compare(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		int k1 = s1.length();
		int k2 = s2.length();
		if (k1 != k2)
		{
			System.out.print("NO\n");
			return 0;
		}
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		for (i = 0;i < k1;i++)
		{
			a[i] = s1.charAt(i) - '0';
			b[i] = s2.charAt(i) - '0';
		}
		qsort(a,k1,4,compare);
		qsort(b,k1,4,compare);
		int count = 0;
		for (i = 0;i < k1;i++)
		{
			if (a[i] == b[i])
			{
				count++;
			}
		}
		if (count == k1)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}









		return 0;
	}

}

