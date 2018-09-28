package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int z;
		  int q;
		  int s;
		  int l;
		  for (l = 5;l >= 4;l--)
		  {
						   for (q = l - 1;q >= 3;q--)
						   {
											  for (z = q - 1;z >= 2;z--)
											  {
																 for (s = z - 1;s >= 1;s--)
																 {
																					if (z + q == s + l && z + l > s + q && z + s < q)
																					{
																												System.out.print("l ");
																												System.out.printf("%d\n",l * 10);
																												System.out.print("q ");
																												System.out.printf("%d\n",q * 10);
																												System.out.print("z ");
																												System.out.printf("%d\n",z * 10);
																												System.out.print("s ");
																												System.out.printf("%d\n",s * 10);
																					}
																 }
											  }
						   }
		  }
		  System.in.read();
		  System.in.read();
	}

}
