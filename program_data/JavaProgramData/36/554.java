package <missing>;

public class GlobalMembers
{
	public static void swap(String a, int n)
	{
		int i;
		int j;
		char t;
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - j - 1;i++)
			{
			if (a[i].compareTo(a[i + 1]) > 0)
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			}
			}
		}

	}
	public static void Main()
	{
		String a = new String(new char[20]);
		String b = new String(new char[20]);
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
		int al;
		int bl;
		al = a.length();
		bl = b.length();
		swap(a, al);
		swap(b, bl);
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}

}

