package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int sam;
		sam = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0)
			{
				sam = sam;
			}
			else
			{
				if (i < 10)
				{
					if (i != 7)
					{
						sam = sam + i * i;
					}
					else
					{
						sam = sam;
					}
				}
				else
				{
					if (i / 10 == 7)
					{
					 sam = sam;
					}
					else
					{
						a = i % 10;
						if (a == 7)
						{
						sam = sam;
						}
						else
						{
						sam = sam + i * i;
						}
					}
				}
			}

		}
		System.out.printf("%d",sam);
		return 0;
	}
}

