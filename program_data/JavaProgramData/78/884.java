package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int a1;
		int b2;
		int c3;
		int i;

		for (z = 10;z < 60;z = z + 10)
		{
			for (q = 10;q < 60;q = q + 10)
			{

				for (s = 10;s < 60;s = s + 10)
				{

				   for (l = 10;l < 60;l = l + 10)
				   {

								a1 = (z + q == s + l);
								b2 = ((z + l) > (s + q));
								c3 = ((z + s) < q);
								if (a1 + b2 + c3 == 3)
								{
								  if (z != q && z != s && z != l && q != s && q != l && s != l)
								  {
										for (i = 50;i >= 10;i = i - 10)
										{
										  if (z == i)
										  {
											  System.out.print("z");
											  System.out.print(' ');
											  System.out.print(z);
											  System.out.print("\n");
										  }
										  if (q == i)
										  {
											  System.out.print("q");
											  System.out.print(' ');
											  System.out.print(q);
											  System.out.print("\n");
										  }
										  if (s == i)
										  {
											  System.out.print("s");
											  System.out.print(' ');
											  System.out.print(s);
											  System.out.print("\n");
										  }
										  if (l == i)
										  {
											  System.out.print("l");
											  System.out.print(' ');
											  System.out.print(l);
											  System.out.print("\n");
										  }
										}
								  }
								}
				   }
				}
			}
		}
		return 0;
	}
}
