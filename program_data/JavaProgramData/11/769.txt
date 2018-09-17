package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		int[] k = new int[20];
		k[1] = 31;
		k[2] = 28;
		k[3] = 31;
		k[4] = 30;
		k[5] = 31;
		k[6] = 30;
		k[7] = 31;
		k[8] = 31;
		k[9] = 30;
		k[10] = 31;
		k[11] = 30;
		k[12] = 31;
		int i = 1;
		int sum = 0;
		while (i < b)
		{
			  sum = sum + k[i];
			  i++;
		}
		sum = sum + c;
		if (b > 2)
		{
			if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0)
			{

		sum++;
			}
		}
		System.out.printf("%d\n",sum);
		System.in.read();
		System.in.read();
	}


}

