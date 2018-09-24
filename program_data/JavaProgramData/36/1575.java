package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int counta;
		int countb;
		int i;
		int j;
		for (i = 0;i <= 127;i++)
		{
			counta = 0;
			countb = 0;
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) == i)
				{
					counta++;
				}
			}
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				if (b.charAt(j) == i)
				{
					countb++;
				}
			}
			if (counta != countb)
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
		return 0;
	}
}

