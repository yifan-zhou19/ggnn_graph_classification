package <missing>;

public class GlobalMembers
{
	public static void change(String a)
	{
		int i;
		int j;
		int k;
		char temp;
		k = a.length();
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j <= k;j++)
			{
				if (a[i].compareTo(a[j]) < 0)
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}




	public static void Main()
	{
		int l1;
		int l2;
		int k = 0;
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
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
		l1 = a.length();
		l2 = b.length();
		if (l1 == l2)
		{
			change(a);
			change(b);
			for (i = 0;i < l1;i++)
			{
				if (a.charAt(i) != b.charAt(i))
				{
					k = 1;
				}
			}
			if (k == 0)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
		else
		{
			System.out.print("NO");
		}
	}
}

