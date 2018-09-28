package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c = 0;
		int t;
		String a = new String(new char[20]);
		String b = new String(new char[20]);
		String pa;
		String pb;
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
		pa = a;
		pb = b;
		t = a.length();

		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (*(pa.Substring(i)) == *(pb.Substring(j)))
				{
					c++;
				}
			}
		}

		if (c >= t)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		}
	}

}

