package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n >= 0;n--)
		{
			switch (n)
			{
			case 7:
			case 17:
			case 27:
			case 37:
			case 47:
			case 57:
			case 67:
			case 77:
			case 87:
			case 97:
				s = s;
				continue;
			}
			if (n % 7 == 0 || n >= 70 && n <= 79)
			{
				continue;
			}
			else
			{
				s = s + n * n;
			}
		}


		System.out.printf("%d\n",s);
		return 0;
	}


}

