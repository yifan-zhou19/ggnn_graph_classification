package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String w1 = new String(new char[100]);
		String w2 = new String(new char[100]);
		int len1;
		int len2;
		int[] n1 = new int[128];
		int[] n2 = new int[128];
		int i;
		int temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w2 = tempVar2.charAt(0);
		}
		len1 = w1.length();
		len2 = w2.length();
		if (len1 != len2)
		{
			System.out.print("NO\n");
			return;
		}
		for (i = 0;i < len1;i++)
		{
			temp = (int) w1.charAt(i);
			n1[temp]++;
		}
		for (i = 0;i < len2;i++)
		{
			temp = (int) w2.charAt(i);
			n2[temp]++;
		}
		for (i = 0;i < 128;i++)
		{
			if (n1[i] != n2[i])
			{
				System.out.print("NO\n");
				return;
			}
		}
		System.out.print("YES\n");
	}

}

