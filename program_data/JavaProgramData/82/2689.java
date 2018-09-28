package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int normalcnt = 0;
		int normalstt = 0;
		int tempcnt = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			int a;
			int b;
			int curnml = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
			{
				curnml = 1;
			}
			else
			{
				curnml = 0;
			}

			if (normalstt != 0)
			{
				//????
				if (curnml != 0) //????
				{
					tempcnt++;
				}
				else //????
				{
					if (tempcnt > normalcnt)
					{
						normalcnt = tempcnt;
					}
					normalstt = 0;
					tempcnt = 0;
				}
			}
			else
			{
				//?????
				if (curnml != 0) //???
				{
					normalstt = 1;
					tempcnt++;
				}
			}
		}

		//????????
		if (normalstt != 0 && tempcnt > normalcnt)
		{
			normalcnt = tempcnt;
		}

		System.out.printf("%d",normalcnt);

		return 0;
	}
}

