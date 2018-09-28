package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[128];
		int[] a2 = new int[128];
		int i;
		String t1 = new String(new char[1000]);
		String t2 = new String(new char[1000]);
		t1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		t2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < 128;i++)
		{
			a1[i] = a2[i] = 0;
		}
		i = 0;
		while (t1.charAt(i) && t2.charAt(i))
		{
			a1[t1.charAt(i)]++;
			a2[t2.charAt(i)]++;
			i++;
		}
		if (t1.charAt(i) || t2.charAt(i))
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < 128;i++)
			{
				if (a1[i] != a2[i])
				{
					System.out.print("NO");
					break;
				}
			}
			if (i == 128)
			{
				System.out.print("YES");
			}
		}
		return 0;
	}
}

