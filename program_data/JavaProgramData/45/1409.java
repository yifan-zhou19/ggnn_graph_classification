package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l1;
		int l2;
		int i;
		int j;
		int a = 0;
		String ds = new String(new char[100]);
		String dw = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ds = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			dw = tempVar2.charAt(0);
		}
		l1 = dw.length();
		l2 = ds.length();

		for (i = 0;i < l1;i++)
		{
			if (dw.charAt(i) == ds.charAt(0))
			{
				for (j = 0;j < l2;j++)
				{
					if (dw.charAt(i + j) == ds.charAt(j))
					{
						a = a + 1;
					}
				}
				if (a == l2)
				{
					System.out.printf("%d",i);
				}
			}
			if (a == l2)
			{
				break;
			}
		}

		return 0;
	}



}

