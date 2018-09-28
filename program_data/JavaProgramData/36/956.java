package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int rearrange = new int(char s1[],char s2[]);
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		k = rearrange(s1, s2);
		if (k != 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}
	public static int rearrange(String s1, String s2)
	{
		int[] count1 = new int[128];
		int[] count2 = new int[128];
		int len1;
		int temp;
		len1 = s1.length();
		temp = s2.length();
		if (len1 != temp)
		{
			return 0;
		}
		for (temp = 0;temp < len1;temp++)
		{
			count1[s1[temp]]++;
			count2[s2[temp]]++;
		}
		for (temp = 0;temp < 128;temp++)
		{
			if (count1[temp] != count2[temp])
			{
				return 0;
			}

		}
		return 1;
	}

}

