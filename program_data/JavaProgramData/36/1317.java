package <missing>;

public class GlobalMembers
{
		public static void sort(String c, int n)
		{
			int i;
			int k;
			char temp;
			for (k = n - 1;k > 0;k--)
			{
				for (i = 0;i < k;i++)
				{
					if (c[i].compareTo(c[i + 1]) > 0)
					{
						temp = c[i];
						c[i] = c[i + 1];
						c[i + 1] = temp;
					}
				}
			}
		}
	public static void Main(String[] args)
	{

		int len1;
		int len2;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
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
		len1 = a.length();
		len2 = b.length();
		sort(a, len1);
		sort(b, len2);
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

