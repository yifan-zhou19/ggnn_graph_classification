package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[50]);
		String a2 = new String(new char[50]);
		int i;
		int j;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a2 = tempVar2.charAt(0);
		}
		for (i = 0;a1.charAt(i) != '\0';i++)
		{
			for (j = 0;a2.charAt(j) != '\0';j++)
			{
				if (a1.charAt(i) == a2.charAt(j))
				{
					System.out.printf("%d",j);
					m++;
				}
				if (m == 1)
				{
					break;
				}
			}
		}
		return 0;
	}


}

