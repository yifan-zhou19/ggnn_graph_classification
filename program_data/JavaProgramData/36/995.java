package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] sa = new int[128];
		int[] sb = new int[128];
		int i;
		int j = 0;
		int k = 1;
		int n;
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
		if (a.length() != b.length())
		{
			k = 0;
		}
		else
		{
			for (i = 0;i < a.length();i++)
			{
				j = (int)(a.charAt(i));
				n = (int)(b.charAt(i));
				sa[j] = sa[j] + 1;
				sb[n] = sb[n] + 1;
			}
		}
			for (i = 0;i < 128;i++)
			{
				if (sa[i] != sb[i])
				{
					k = 0;
					break;
				}
			}
		if (k == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
	}
}

