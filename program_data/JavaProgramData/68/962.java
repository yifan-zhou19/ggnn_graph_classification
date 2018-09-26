package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//?????????
		int[] ss = new int[50000];
		int i;
		int d;
		int j;
		int k = 1;
		ss[0] = 2;
		for (i = 3;i < 50000;i = i + 2)
		{
			d = 0;
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					d = 1;
					break;
				}
			}
			if (d == 0)
			{
				ss[k] = i;
				k++;
			} //k++???
		}




		//??
		int sushu = int x;
		int n;
		int a;
		int b;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a = 6;a <= n;a = a + 2)
		{
			t = 0;
			for (i = 0;i <= a / 2;i++)
			{
				b = a - ss[i];
				if (sushu(b) != 0)
				{
					System.out.printf("%d=%d+%d\n",a,ss[i],b);
					break;
				}


			}

		}

		return 0;


	}
	public static int sushu(int x)
	{


		int d = 0;
		int j;

		for (j = 2;j <= Math.sqrt(x);j++)
		{
			if (x % j == 0)
			{
				d = 1;
				break;
			}
		}
		if (d == 0)
		{
			return 1;
		}
		else
		{
			return 0; //k++???
		}

	}
}

