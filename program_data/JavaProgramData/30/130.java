package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s1 = 0;
		int s2 = 0;
		int i;
		int j;
		int a;
		int b;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i <= n;i++)
		{
			s1 = s1 + i * i;
		}


		for (j = 1;j <= n;j++)
		{
			a = j % 10;
			 b = j / 10;


			if (a == 7 || b == 7 || j % 7 == 0)
			{
				s2 = s2 + j * j;
			}
		}


		System.out.printf("%d",s1 - s2);
		return 0;
	}




}

