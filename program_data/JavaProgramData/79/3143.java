package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int t = 0;
	int[] n = new int[300];
	int[] m = new int[300];
	for (int i = 0;i < 300;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[i] = Integer.parseInt(tempVar2);
		}
			t++;
		if (m[i] == 0 || n[i] == 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto next;
		}
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	next:
	for (int k0 = 0;k0 < t - 1;k0++)
	{
			int[] s = new int[300];
		int k1 = n[k0];
		int j = 1;
		for (int h = 0;h < n[k0];h = (h + 1) % n[k0])
		{
			if (s[h] != 0)
			{
				continue;
			}

			if (j++==m[k0])
			{
				s[h] = 1;
				k1--;
				j = 1;
			}
			if (k1 == 0)
			{
				System.out.printf("%d\n",h + 1);
				break;
			}
		}
	}
	return 0;
	}

}

