package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		t = 0;
		for (i = 1;i < m;i++)
		{
			switch (i)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					t += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					t += 30;
					break;
				default:
					if (y % 400 == 0)
					{
						t += 29;
					}
					else if ((y % 100 != 0) && (y % 4 == 0))
					{
						t += 29;
					}
					else
					{
						t += 28;
					}
			}
		}
		t += d;
		System.out.printf("%d",t);
	}
}

