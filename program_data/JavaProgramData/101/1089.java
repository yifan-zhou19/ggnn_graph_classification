package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		int a = 0;
		int b = 0;
		int c = 0;
		int r;
		int s;
		int t;
		int[] P = new int[3];
		int i;
		r = (b > a) + (c == a);
		s = (a > b) + (a > c);
		t = (c > b) + (b > a); //??????????
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
			for (c = 0;c <= 2;c++) //????????????????
			{
		if ((r + a == 2) && (s + b == 2) && (t + c == 2)) //????
		{
		P[0] = a;
		P[1] = b;
		P[2] = c;
		}
			}
			}
		}
		for (i = 0;i <= 2;i++)
		{
			if (P[i] == 2)
			{
				ch = i + 65;
				System.out.print(ch);
			}
		}
		for (i = 0;i <= 2;i++)
		{
			if (P[i] == 1)
			{
				ch = i + 65;
				System.out.print(ch);
			}
		}
		for (i = 0;i <= 2;i++)
		{
			if (P[i] == 0)
			{
				ch = i + 65;
				System.out.print(ch);
			}
		}


		return 0;
	}
}
