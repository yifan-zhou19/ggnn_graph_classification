package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int a;
		int b;

	for (z = 1;z < 6;z++)
	{
	  for (s = 1;s < 6;s++)
	  {
		  l = 7 - s;
		  q = 7 - z;
			 if ((z + l > q + s) && (z + s < q))

			 {
				 a = s;
				 b = z;
			 }
	  }
	}


	l = 6 - a;
	q = 6 - b;
	   System.out.printf("l %d\n",l * 10);
	System.out.printf("q %d\n",q * 10);
	System.out.printf("z %d\n",b * 10);
	System.out.printf("s %d",a * 10);

		return 0;
	}

}
