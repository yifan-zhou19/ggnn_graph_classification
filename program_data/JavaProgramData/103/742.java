package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[1000]);
		int i;
		int changdu;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		changdu = x.length();
		for (i = 0;i < changdu;i++)
		{
			if (x.charAt(i) >= 'a' && x.charAt(i) <= 'z')
			{
				x.charAt(i) -= 32;
			}
		}
		if (changdu == 1)
		{
			System.out.printf("(%c,%d)",x.charAt(0),1);
		}
		for (i = 0;i < changdu - 1;i++)
		{
			if (x.charAt(i) == x.charAt(i + 1))
			{
				num++;
			}
			if (x.charAt(i) != x.charAt(i + 1))
			{
				System.out.printf("(%c,%d)",x.charAt(i),++num);
				num = 0;
			}
			if ((x.charAt(i) == x.charAt(i + 1)) && (i == changdu - 2))
			{
				System.out.printf("(%c,%d)",x.charAt(i),++num);
			}
			if ((x.charAt(i) != x.charAt(i + 1)) && (i == changdu - 2))
			{
				System.out.printf("(%c,%d)",x.charAt(i + 1),1);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

