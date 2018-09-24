package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[128];
	public static String str = new String(new char[1000]);
	public static int Main()
	{
		int l1;
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		n = str.length();
		for (l1 = 0;l1 < n;l1++)
		{
			num[str.charAt(l1)]++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		n = str.length();
		for (l1 = 0;l1 < n;l1++)
		{
			num[str.charAt(l1)]--;
		}

		for (l1 = 0;l1 < 128;l1++)
		{
			if (num[l1] != 0)
			{
				break;
			}
		}
		if (l1 == 128)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}

}

