package <missing>;

public class GlobalMembers
{
	public static void sort(String a, int n)
	{
		if (n == 1)
		{
			return;
		}
		else
		{
			int i;
			int k;
			char temp;
			for (k = 0,i = 0;i < n;i++)
			{
				if (a[i].compareTo(a[k]) > 0)
				{
					k = i;
				}
			}
			temp = a[k];
			a[k] = a[n - 1];
			a[n - 1] = temp; //switch
			sort(a, n - 1); //sort the rest
		}

	}

	public static void Main()
	{
		String a = new String(new char[N]);
		String b = new String(new char[N]);
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

		sort(a, a.length());
		sort(b, b.length());
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
}

