package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String p1;
		String p2;
		int i;
		int j;
		int c;
		int t;
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
	p1 = a,p2 = b;
		c = a.length();
		for (i = 0;i < c - 1;i++)
		{
			for (j = i + 1;j < c;j++)
			{
				if (a.charAt(j) > a.charAt(i))
				{
					t = (p1.Substring(j));
					*(p1.Substring(j)) = *(p1.Substring(i));
					*(p1.Substring(i)) = t;
				}
			}
		}
		for (i = 0;i < c - 1;i++)
		{
			for (j = i + 1;j < c;j++)
			{
				if (b.charAt(j) > b.charAt(i))
				{
					t = (p2.Substring(j));
					*(p2.Substring(j)) = *(p2.Substring(i));
					*(p2.Substring(i)) = t;
				}
			}
		}
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

