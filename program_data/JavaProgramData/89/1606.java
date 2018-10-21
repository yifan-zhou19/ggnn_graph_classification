package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String v = new String(new char[N]);
		int n;
		int i;
		int j;
		int a;
		int b;
		int sign;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			v = tangible.StringFunctions.changeCharacter(v, i, 1);
		}
		while (true)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0 && b == 0)
			{
				break;
			}
			if (a != b)
			{
				v = v.substring(0, a);
			}
		}
		sign = 0;
		for (i = 0;i < n;i++)
		{
			if (v.charAt(i) == 1)
			{
					if (sign == 0)
					{
						sign = 1;
					}
					System.out.printf("%d\n",i);

			}
		}
		if (sign == 0)
		{
			System.out.print("NOT FOUND\n");
		}
		return 0;
	}
}

