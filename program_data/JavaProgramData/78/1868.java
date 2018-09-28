package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z; //??????
		int q;
		int s;
		int l;
		int x1;
		int x2;
		int x3;
		int x4;
		for (z = 1;z <= 5;z++) //z?1?5??
		{
		for (q = 1;q <= 5;q++) //??
		{
		for (s = 1;s <= 5;s++) //??
		{
		for (l = 1;l <= 5;l++) //??
		{
			if ((z + q) == (s + l))
			{
				x1 = 1; //??z+q=s+l,?x1=1
			}
			else
			{
				x1 = 0; //????
			}
			if ((z + l) > (s + q))
			{
				x2 = 1; //??z+l>s+q,?x2=1
			}
			else
			{
				x2 = 0; //????
			}
			if ((z + s) < q)
			{
				x3 = 1; //??z+s<q??x3=1
			}
			else
			{
				x3 = 0; //????
			}
			if ((z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
			{
				x4 = 1; //????????x4=1
			}
			else
			{
				x4 = 0; //????
			}
			if (x1 + x2 + x3 + x4 == 4) //??????4?????
			{
				System.out.print("l");
				System.out.print(" ");
				System.out.print(l * 10);
				System.out.print('\n');
				System.out.print("q");
				System.out.print(" ");
				System.out.print(q * 10);
				System.out.print('\n');
				System.out.print("z");
				System.out.print(" ");
				System.out.print(z * 10);
				System.out.print('\n');
				System.out.print("s");
				System.out.print(" ");
				System.out.print(s * 10);
				System.out.print('\n');
			}
		}
		}
		}
		}

		   return 0;
	}
}
