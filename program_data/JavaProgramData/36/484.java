package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void sort(char a[],int n);
		int m;
		int n;
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
		m = a.length();
		n = b.length();
		sort(a, m);
		sort(b, n);
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
	}
	public static void sort(String a, int n)
	{
		int i;
		int j;
		int k;
		char temp;
		for (i = 0;i < n;i++)
		{
			k = i;
		for (j = i + 1;j < n;j++)
		{
			if (a[k].compareTo(a[j]) > 0)
			{
				k = j;
			}
		}
			if (k != i)
			{
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
}

