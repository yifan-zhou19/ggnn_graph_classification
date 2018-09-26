package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int w;
		int a;
		int b;
		int day;
		int s = 0;

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
			{
				day = 0;
				break;
			}
			case 2:
			case 4:
			case 6:
			case 8:
			case 9:
			case 11:
			{
				day = 31;
				break;
			}
			case 3:
			{
				day = 28;
				break;
			}
			default:
			{
				day = 30;
				break;
			}
			}
			s = s + day;
			a = 12 + s;
			b = a % 7 + w;
			if (b % 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
		}

	}


}

