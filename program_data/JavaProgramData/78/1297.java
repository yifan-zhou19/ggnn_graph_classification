package <missing>;

public class GlobalMembers
{
	public static void f(int z,int q,int s,int l)
	{
		int i;
		for (i = 5;i > 0;i--)
		{
			if (z == i)
			{
				System.out.print("z ");
				System.out.print(10 * i);
				System.out.print("\n");
			}
			if (q == i)
			{
				System.out.print("q ");
				System.out.print(10 * i);
				System.out.print("\n");
			}
			if (s == i)
			{
				System.out.print("s ");
				System.out.print(10 * i);
				System.out.print("\n");
			}
			if (l == i)
			{
				System.out.print("l ");
				System.out.print(10 * i);
				System.out.print("\n");
			}
		}
	}

	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z < 6;z++)
		{
			//if(z==2) cout<<2<<endl;
			for (q = 1;q < 6;q++)
			{
				if (q != z) //if(z==2&&q==4) cout<<q<<endl;
				{

				for (s = 1;s < 6;s++)
				{
					if (s != q && s != z)
					{

					//if(z==2&&q==4&&s==1) cout<<2<<endl;
					l = z + q - s;
					if (l > 0 && l < 6 && l != z && l != q && l != s)
					{
						if (z + l > s + q)
						{
							if (z + s < q)
							{
								f(z, q, s, l);
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
