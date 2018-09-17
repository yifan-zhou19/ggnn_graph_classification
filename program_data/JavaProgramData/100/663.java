package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String n = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = tempVar.charAt(0);
		}
		int[] zm = new int[26];
		int i;
		int j;
		int cd;
		int jg = 0;
		for (i = 0;i < 26;i++)
		{
			zm[i] = 0;
		}
		cd = n.length();

		for (j = 0;j < cd;j++)
		{
			i = (n.charAt(j) - 'a');
			if (i < 26 && i >= 0)
			{
				zm[i]++;
			}
		}

		for (i = 0;i < 26;i++)
		{
			if (zm[i] > 0)
			{
				jg = 1;
				break;
			}
		}
		if (jg == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (zm[i] > 0)
				{
					System.out.printf("%c=%d\n",'a' + i,zm[i]);
				}
			}
		}
		return 0;
	}
}

