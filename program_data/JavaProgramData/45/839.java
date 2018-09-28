package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int i = 0;
		int j;
		int p;
		int flag = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		System.out.print(" ");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		System.out.print("\n");
		while (a.charAt(i) && flag != 0)
		{
			p = i;
			j = 0;
			while (a.charAt(i) && b.charAt(j) && a.charAt(i) == b.charAt(j))
			{
				i++;
				j++;
			}
			if ((b.charAt(j)) == null)
			{
			flag = 0;
			}
			else
			{
			i = p + 1;
			}

		}
			if (flag == 0)
			{
			System.out.printf("%d\n",p);
			}

			return 0;
	}
}

