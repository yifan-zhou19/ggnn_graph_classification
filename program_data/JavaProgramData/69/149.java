package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[251]);
		String s2 = new String(new char[251]);
		int[] a1 = new int[251];
		int[] a2 = new int[251];
		int len1;
		int len2;
		int len;
		int[] t = new int[251];
		int i;
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
		len1 = s1.length();
		len2 = s2.length();
		if (len1 > len2)
		{
			len = len1;
		}
		else
		{
			len = len2;
		}
		for (i = 0;i < len1;i++)
		{
		a1[i] = s1.charAt(len1 - 1 - i) - '0';
		}
		for (i = 0;i < len2;i++)
		{
		a2[i] = s2.charAt(len2 - 1 - i) - '0';
		}
		for (i = 0;i < len;i++)
		{
			t[i] += a1[i] + a2[i];
			if (t[i] >= 10)
			{
				t[i] -= 10;
				t[i + 1]++;
			}
		}
		if (t[len] != 0)
		{
			len++;
		}
		for (i = len - 1;i > 0;i--)
		{
			if (t[i] == 0)
			{
				len--;
			}
			else
			{
				break;
			}
		}
		for (i = len - 1;i >= 0;i--)
		{
		System.out.printf("%d",t[i]);
		}
		return 0;
	}


}

