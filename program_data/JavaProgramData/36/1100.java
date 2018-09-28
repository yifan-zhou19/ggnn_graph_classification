package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n1;
		int n2;
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		int count = 0;
		String s = new String(new char[50]);
		String w = new String(new char[50]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = tempVar2.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			n1 = s.charAt(i) - 'a';
			count1[n1]++;

		}
		for (i = 0;w.charAt(i) != '\0';i++)
		{
			n2 = w.charAt(i) - 'a';
			count2[n2]++;
		}
		for (i = 0;i < 26;i++)
		{
			if (count1[i] == count2[i])
			{
				count++;
			}
		}
		if (count == 26)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}


}

