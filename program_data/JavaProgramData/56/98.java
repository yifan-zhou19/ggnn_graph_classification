package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int[] shu = new int[5];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a;


		int wei = 0;
		do
		{
			a = a / 10;
			wei++;
		}while (a != 0);

		for (i = 0;i < wei;i++)
		{
			shu[i] = b / Math.pow(10,wei - 1 - i);
			b = b - shu[i] * Math.pow(10,wei - 1 - i);
		}
		int sum = 0;
		for (i = 0;i < wei;i++)
		{
			sum = sum + shu[i] * Math.pow(10,i);
		}
		System.out.printf("\n%d",sum);



	}


}

