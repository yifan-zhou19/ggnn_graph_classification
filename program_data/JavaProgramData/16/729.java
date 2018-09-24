package <missing>;

public class GlobalMembers
{
	///#include <math.h>
	///#include <stdlib.h>

	public static int Main()
	{
		int num;
		int temp = 0;
		int sub = 0;
		int dv = 10;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		int a;
		int b = 1;

		if (num == 0)
		{
			System.out.print("0");
			return 0;
		}

		while (num != sub)
		{
			temp = (num - (num / dv) * dv - sub) / (dv / 10);
			sub += temp * (dv / 10);

			System.out.printf("%d",temp);
			dv *= 10;
		}

		return 0;
	}


}

