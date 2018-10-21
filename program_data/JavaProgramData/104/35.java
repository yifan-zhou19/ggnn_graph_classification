package <missing>;

public class GlobalMembers
{
	public static int k = 0;
	public static void findrouteA(int[] ay, int n, int m)
	{
		if (n == 1)
		{
			ay[k++] = 1;
		}
		else
		{
			ay[k++] = (int)Math.pow(2,n - 1) - 1 + m;
			findrouteA(ay, n - 1, (int)(m + 1) / 2);
		}
	}

	public static int Main()
	{
		int a;
		int b;
		int[] ay = new int[10]; //????a,b???
		int[] by = new int[10];
		int i;
		int j;
		int end1;
		int end2;
		int an; //??a,b?????????
		int am;
		int bn;
		int bm;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 1,j = 1;j < a + 1;i++,j += j)
		{
			;
		}
		an = i - 1;
		am = a - (int)Math.pow(2,i - 2) + 1;

		for (i = 1,j = 1;j < b + 1;i++,j += j)
		{
			;
		}
		bn = i - 1;
		bm = b - (int)Math.pow(2,i - 2) + 1; //you cuo


		findrouteA(ay, an, am);
		end1 = k - 1;
		k = 0;
		findrouteA(by, bn, bm);
		end2 = k - 1;


		for (end1,end2;ay[end1] == by[end2];end1--,end2--)
		{
			;
		}
		System.out.printf("%d",ay[end1 + 1]);
		return 0;
	}


}

