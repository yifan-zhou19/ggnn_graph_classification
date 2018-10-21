package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[100]);
		String c2 = new String(new char[100]);
		int i;
		int j;
		int a;
		int b;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		a = c1.length();
		b = c2.length();
		if (a != b)
		{
			System.out.print("NO\n");
		}
		else
		{
			for (i = 0;i < a;i++)
			{
				for (j = 0;j < a;j++)
				{
					if (c1.charAt(i) == c2.charAt(j))
					{
						k++;
					}
				}
			}
			for (i = 0;i < a;i++)
			{
				for (j = i + 1;j < a;j++)
				{
					if (c1.charAt(i) == c1.charAt(j))
					{
						k = k - 2;
					}
				}
			}
			if (k == a)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

