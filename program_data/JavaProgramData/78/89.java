package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int iz;
		int iq;
		int is;
		int il;
		int z;
		int q;
		int s;
		int l;
		for (iz = 10;iz <= 50;iz += 10)
		{

			for (iq = 10;iq <= 50;iq += 10)
			{

				for (is = 10;is <= 50;is += 10)
				{

					for (il = 10;il <= 50;il += 10)
					{

						if ((iz + iq == is + il) && (iz + il > iq + is) && (iz + is < iq))
						{
							z = iz;
							q = iq;
							s = is;
							l = il;
							break;
						}
					}
				}
			}
		}

		System.out.printf("l %d\n",l);
		System.out.printf("q %d\n",q);
		System.out.printf("z %d\n",z);
		System.out.printf("s %d\n",s);
		return 0;
	}



}
