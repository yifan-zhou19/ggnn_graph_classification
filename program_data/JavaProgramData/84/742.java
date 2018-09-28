package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		int t;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			int NUMBER;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				NUMBER = Integer.parseInt(tempVar2);
			}
			switch (i)
			{
			case 0:
				s = NUMBER;
				break;
			case 1:
				t = NUMBER;
				if (s < t)
				{
					r = s;
					s = t;
					t = r;
				}
				break;
			default:
				if (NUMBER > s)
				{
					r = s;
					s = t;
					t = r;
					r = NUMBER;
					NUMBER = s;
					s = r;
				}
				else if (NUMBER > t)
				{
					r = NUMBER;
					NUMBER = t;
					t = r;
				}
				break;
			}
		}
		System.out.printf("%d\n%d\n",s,t);
		return 0;
	}
}

