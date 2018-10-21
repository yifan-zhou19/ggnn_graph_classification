package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int w;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		for (i = 0;i < 12;i++)
		{
			int d = 0;
			for (j = 0;j < i;j++)
			{
				d = d + m[j];
			}
			d = d + 13;
			switch (w % 7)
			{
			case 0:
				d = d - 1;
				break;
			case 1:
				d = d - 0;
				break;
			case 2:
				d = d - 6;
				break;
			case 3:
				d = d - 5;
				break;
			case 4:
				d = d - 4;
				break;
			case 5:
				d = d - 3;
				break;
			case 6:
				d = d - 2;
				break;
			}
			if (d % 7 == 5)
			{
				System.out.printf("%d\n",i + 1);
			}
		}
	}

}

