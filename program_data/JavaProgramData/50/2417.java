package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		for (i = 1;i < 13;i++)
		{
			switch (i)
			{
			case 1:
				w += 12;
				break;
			case 2:
				w += 31;
				break;
			case 3:
				w += 28;
				break;
			case 4:
				w += 31;
				break;
			case 5:
				w += 30;
				break;
			case 6:
				w += 31;
				break;
			case 7:
				w += 30;
				break;
			case 8:
				w += 31;
				break;
			case 9:
				w += 31;
				break;
			case 10:
				w += 30;
				break;
			case 11:
				w += 31;
				break;
			case 12:
				w += 30;
				break;
			}
			if (w % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}
		return 0;
	}

}

