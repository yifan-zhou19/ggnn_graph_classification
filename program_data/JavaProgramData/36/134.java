package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int[] m = new int[130];
		int[] n = new int[130];
		String a = new String(new char[300]);
		String b = new String(new char[300]);
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
		if (a.length() != b.length())
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i <= a.length() - 1;i++)
			{
				++m[a.charAt(i)];
				++n[b.charAt(i)];
			}
			for (j = 50;j <= 122;j++)
			{
				if (m[j] != n[j])
				{
					System.out.print("NO\n");
					break;
				}
			}
			 if (j == 123)
			 {
			 System.out.print("YES\n");
			 }
		}
	}

}

