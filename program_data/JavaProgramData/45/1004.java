package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;b.charAt(i) != 0;i++)
		{
			int same = 0;
			if (a.charAt(0) == b.charAt(i))
			{
				same = 1;
				for (j = 1;a[j] = 0;j++)
				{
					if (a.charAt(j) != b.charAt(i + j))
					{
						same = 0;
						break;
					}
				}
				if (same == 1)
				{
					System.out.printf("%d",i);
					break;
				}
			}
		}
		return 0;
	}




}

