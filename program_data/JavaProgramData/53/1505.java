package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int MEDIA = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] NUMO = new int[n];
		int k = 0;
		for (int i = 0;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				MEDIA = Integer.parseInt(tempVar2);
			}
			for (int j = 0;j < k;j++)
			{
				if (NUMO[j] == MEDIA)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto SPEEEE;
				}
			}
			NUMO[k] = MEDIA;
			k++;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			SPEEEE:
			;
		}
		for (int i = 0;i < k - 1;i++)
		{
		System.out.printf("%d,",NUMO[i]);
		}
		System.out.printf("%d",NUMO[k - 1]);
	}
}

