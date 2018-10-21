package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int[] count1 = new int[128];
		int[] count2 = new int[128];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		int strl1 = str1.length();
		int strl2 = str2.length();
		if (strl1 != strl2)
		{
			System.out.print("NO");
			return 0;
		}
		for (int i = 0;i < strl1;i++)
		{
			count1[str1.charAt(i)]++;
		}
		for (int i = 0;i < strl2;i++)
		{
			count2[str2.charAt(i)]++;
		}
		for (int i = 0;i < 128;i++)
		{
			if (count1[i] != count2[i])
			{
				System.out.print("NO");
				return 0;
			}
		}
		System.out.print("YES");
		return 0;
	}

}

