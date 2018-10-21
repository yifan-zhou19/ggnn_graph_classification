package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] a = new int[4];
		int[] b = new int[4];
		int[] c = new int[4];
		int i;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
			for (s = 10;s <= 50;s = s + 10)
			{
			for (l = 10;l <= 50;l = l + 10) //??????????
			{
			if ((z + q == s + l) && (z + l > s + q) && (z + s < q) && (z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l)) //????
			{
			a[0] = z;
			a[1] = q;
			a[2] = s;
			a[3] = l;
			}
			}
			}
			}
		} //??????
		for (i = 0;i <= 3;i++)
		{
			b[i] = a[i]; //?????? ????????????
		}
		sort(a[0], a[0] + 4); //??????
		for (i = 0;i <= 3;i++)
		{
			c[i] = a[3 - i];
		} //??????
		for (i = 0;i <= 3;i++)
		{
			if (c[i] == b[0])
			{
				System.out.print("z");
				System.out.print(" ");
				System.out.print(c[i]);
				System.out.print("\n");
			}
		 if (c[i] == b[1])
		 {
			 System.out.print("q");
			 System.out.print(" ");
			 System.out.print(c[i]);
			 System.out.print("\n");
		 }
		 if (c[i] == b[2])
		 {
			 System.out.print("s");
			 System.out.print(" ");
			 System.out.print(c[i]);
			 System.out.print("\n");
		 }
		 if (c[i] == b[3])
		 {
			 System.out.print("l");
			 System.out.print(" ");
			 System.out.print(c[i]);
			 System.out.print("\n");
		 }
		} //????????????
		return 0;
	}
}
