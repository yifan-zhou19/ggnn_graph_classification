package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void same(char a[],char b[]);
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
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
		same(a, b);
	}
	public static void same(String a, String b)
	{
		int i;
		int j;
		int t;
		int n;
		if (a.length() == b.length())
		{
		for (j = 0;j < a.length() - 1;j++)
		{
			for (i = 0;i < a.length() - 1 - j;i++)
			{
				if (a[i].compareTo(a[i + 1]) >= 0)
				{
					t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
				}
			}
		}
		for (j = 0;j < b.length() - 1;j++)
		{
			for (i = 0;i < b.length() - 1 - j;i++)
			{
				if (b[i].compareTo(b[i + 1]) >= 0)
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
		for (i = 0,n = 0;i < a.length() - 1;i++)
		{
			if (a[i].equals(b[i]))
			{
				n++;
			}
			else
			{
				break;
			}
		}
		if (n == a.length() - 1)
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

