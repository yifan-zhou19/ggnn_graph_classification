package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int A; //????ABC????3??????????i,j,????x
		int B;
		int C;
		int i;
		int j;
		int x;
		int[] a = new int[3]; //????
		char[] b = {'A', 'B', 'C'};
		char p;
		for (A = 0;A <= 2;A++) //???????????????
		{
			for (B = 0;B <= 2;B++)
			{
				for (C = 0;C <= 2;C++)
				{
					if ((B > A) + (C == A) == 2 - A && (A > B) + (A > C) == 2 - B && (C > B) + (B > A) == 2 - C) //??????????
					{
						a[0] = A;
						a[1] = B;
						a[2] = C;
					}
				}
			}
		}
		for (i = 0;i <= 1;i++) //?????????a[3],b[3]??
		{
			for (j = 0;j <= 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					p = a[j + 1];
					a[j + 1] = a[j];
					a[j] = p;
					x = b[j + 1];
					b[j + 1] = b[j];
					b[j] = x;
				}
			}
		}
		for (i = 0;i <= 2;i++) //????????
		{
			System.out.print(b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}
