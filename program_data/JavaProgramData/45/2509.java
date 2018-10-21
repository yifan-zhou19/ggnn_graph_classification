package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String words1 = new String(new char[300]);
		String words2 = new String(new char[300]);
		int i;
		int j;
		int n = 0;
		int m = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			words1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			words2 = tempVar2.charAt(0);
		}
		for (i = 0;words1.charAt(i);i++)
		{
			n++;
		}
		for (i = 0;words2.charAt(i);i++)
		{
			if (words1.charAt(0) == words2.charAt(i))
			{
				for (j = 0;j < n;j++)
				{
					if (words1.charAt(j) != words2.charAt(i + j))
					{
						break;
					}
				}
				System.out.printf("%d",i);
				break;
			}
		}
		return 0;
	}

}

