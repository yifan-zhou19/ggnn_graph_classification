package <missing>;

public class GlobalMembers
{
	public static int check(int a)
	{
		if (a > 7)
		{
		return a - 7;
		}
		else
		{
		return a;
		}

	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] m = new int[12];
		int i;
		m[0] = 12 % 7 + n;
		m[0] = check(m[0]);
		//printf("%d",m[0]);
		for (i = 1;i < 12;i++)
		{
			switch (i)
			{
			case 1:
		case 3:
	case 5:
	case 7:
	case 8:
	case 10:
			m[i] = 31 % 7 + m[i - 1];
			break;
			case 2:
			m[i] = 28 % 7 + m[i - 1];
			break;
			case 4:
		case 6:
	case 9:
	case 11:
			m[i] = 30 % 7 + m[i - 1];
			}
			m[i] = check(m[i]);
		}
		for (i = 1;i <= 12;i++)
		{
	   if (m[i - 1] == 5)
	   {
		System.out.printf("%d\n",i);
	   }
		}
	}

}

