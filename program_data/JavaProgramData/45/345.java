package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int la = 0;
		int lb = 0;
		int judge;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		for (i = 1;a.charAt(i) != '\0';i++)
		{
			la++;
		}
		for (i = 1;b.charAt(i) != '\0';i++)
		{
			lb++;
		}
		for (i = 0;i <= la - lb;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				judge = 1;
				for (j = 1;j <= lb - 1;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
						judge = 0;
						j = lb + 100;
					}
				}
				if (judge == 1)
				{
					System.out.printf("%d",i);
					i = la + 100;
				}
			}
		}
		return 0;
	}

}

