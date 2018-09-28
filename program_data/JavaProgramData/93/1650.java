package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int[] result = new int[4];
		char c = 'n';

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

		if (a % 3 == 0)
		{
			result[1] = 3;
		}
		else
		{
			result[1] = 0;
		}

		if (a % 5 == 0)
		{
			result[2] = 5;
		}
		else
		{
			result[2] = 0;
		}

		if (a % 7 == 0)
		{
			result[3] = 7;
		}
		else
		{
			result[3] = 0;
		}


		if (result[1] != 0 && result[2] == 0 && result[3] == 0)
		{
			System.out.printf("%d",result[1]);
		}

		if (result[1] == 0 && result[2] != 0 && result[3] == 0)
		{
			System.out.printf("%d",result[2]);
		}

		if (result[1] == 0 && result[2] == 0 && result[3] != 0)
		{
			System.out.printf("%d",result[3]);
		}

		if (result[1] != 0 && result[2] != 0 && result[3] == 0)
		{
			System.out.printf("%d %d",result[1],result[2]);
		}

		if (result[1] != 0 && result[2] == 0 && result[3] != 0)
		{
			System.out.printf("%d %d",result[1],result[3]);
		}

		if (result[1] == 0 && result[2] != 0 && result[3] != 0)
		{
			System.out.printf("%d %d",result[2],result[3]);
		}

		if (result[1] != 0 && result[2] != 0 && result[3] != 0)
		{
			System.out.printf("%d %d %d",result[1],result[2],result[3]);
		}



		if (result[1] == 0 && result[2] == 0 && result[3] == 0)
		{
			System.out.printf("%c",c);
		}

		return 0;
	}


}

