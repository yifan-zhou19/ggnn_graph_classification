package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		int[] count1 = new int[500];
		int[] count2 = new int[500];
		int i;
		int n;
		int m;
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
		n = str1.length();
		m = str2.length();
		for (i = 0;i < n;i++)
		{
			if (str1.charAt(i) <= 'Z' && str1.charAt(i) >= 'A')
			{
				count1[str1.charAt(i)]++;
			}
			else if (str1.charAt(i) <= 'z' && str1.charAt(i) >= 'a')
			{
				count1[str1.charAt(i)]++;
			}
		}
		for (i = 0;i < m;i++)
		{
			if (str2.charAt(i) <= 'Z' && str2.charAt(i) >= 'A')
			{
				count2[str2.charAt(i)]++;
			}
			else if (str2.charAt(i) <= 'z' && str2.charAt(i) >= 'a')
			{
				count2[str2.charAt(i)]++;
			}
		}
		for (i = 0;i < 500;i++)
		{
			if (count1[i] != count2[i])
			{
				System.out.print("NO");
				break;
			}
		}
		if (i >= 500)
		{
			System.out.print("YES");
		}
	}


}

