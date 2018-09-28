package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int[] count1 = new int[128];
		int[] count2 = new int[128];
		int b = 1;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		for (i = 0;i <= str1.length() - 1;i++)
		{
			count1[str1.charAt(i)]++;
		}
		for (i = 0;i <= str2.length() - 1;i++)
		{
			count2[str2.charAt(i)]++;
		}
		for (i = 0;i <= 127;i++)
		{
			if (count1[i] != count2[i])
			{
				b = 0;
			}
		}
		if (b == 0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}
	}

}

