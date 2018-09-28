package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		int n1;
		int n2;
		int i;
		int t;
		int[] c1 = new int[128];
		int[] c2 = new int[128];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		for (i = 0;i < 128;i++)
		{
			c1[i] = c2[i] = 0;
		}
		n1 = s1.length();
		n2 = s2.length();
		if (n1 != n2)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < n1 - 1;i++)
			{
				t = s1.charAt(i);
				c1[i]++;
			}
			for (i = 0;i < n2 - 1;i++)
			{
				t = s2.charAt(i);
				c2[i]++;
			}
			for (i = 0;i < 128;i++)
			{
				if (c1[i] != c2[i])
				{
					break;
				}
			}
			if (i == 128)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}
	}
}

