package <missing>;

public class GlobalMembers
{
	public static void sort(String aa, int n)
	{

	int i;
	int j;
	int k;
	char t;
	char q;
	for (i = 0;i < n - 1;i++)
	{
		k = i;
	for (j = i + 1;j < n;j++)
	{
	if (aa[j].compareTo(aa[k]) < 0)
	{
		k = j;
	}
	}
	t = aa[k];
	q = aa[i];
	aa[k] = q;
	aa[i] = t;
	}


	}

	public static void Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
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
	int m;
	int n;
	m = a.length();
	n = b.length();
	if (m != n)
	{
		System.out.print("NO");
	}
	else
	{
		sort(a, m);
	sort(b, n);

	int i;
	for (i = 0;i < m;i++)
	{
		if (a.charAt(i) != b.charAt(i))
		{
			System.out.print("NO");
			break;
		}
	else if (i == m - 1)
	{
		System.out.print("YES");
	}
	}
	}

	}

}

