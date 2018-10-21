package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int x = 0;
		int n = 0;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (i = 1;i <= n;i++)
			{
				if (i % 7 != 0 && i != 7 && i != 17 && i != 27 && i != 37 && i != 47 && i != 57 && i != 67 && i != 77 && i != 87 && i != 97 && i != 70 && i != 71 && i != 72 && i != 73 && i != 74 && i != 75 && i != 76 && i != 77 && i != 78 && i != 79)
				{
					x += i * i;
				}

			}

	System.out.printf("%d",x);



		return 0;
	}


}

