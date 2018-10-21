package <missing>;

public class GlobalMembers
{
	public static void sort(String a, int n)
	{
		int i;
		int j;
		int k;
		char t;
		for (i = 0;i < n - 1;i++)
		{
			k = i;
			for (j = i + 1;j < n;j++)
			{
				if (a[j].compareTo(a[k]) > 0)
				{
					k = j;
				}
			}
			if (k != i)
			{
				t = a[i];
				a[i] = a[k];
				a[k] = t;
			}
		}
	}

	public static void Main()
	{
		int m;
		int n;
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
		m = a.length();
		n = b.length();
		 sort(a, m);
		 sort(b, n);
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

