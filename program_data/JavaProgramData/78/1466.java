package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int Q;
		int S;
		int L;
		int Z;
		for (z = 1;z < 6;z++)
		{
		for (q = 1;q < 6;q++)
		{
		for (s = 1;s < 6;s++)
		{
		for (l = 1;l < 6;l++)
		{
			 if (z + q == s + l && z + l > s + q && z + s < q)
			 {
			  Z = z;
			  Q = q;
			  L = l;
			  S = s;
			 break;
			 }
		}
		}
		}
		}
		   for (i = 5;i > 0;i--)
		   {
		   if (Z == i)
		   {
			   System.out.print("z ");
			   System.out.print(Z * 10);
			   System.out.print("\n");
		   }
		   if (S == i)
		   {
			   System.out.print("s ");
			   System.out.print(S * 10);
			   System.out.print("\n");
		   }
		   if (L == i)
		   {
			   System.out.print("l ");
			   System.out.print(L * 10);
			   System.out.print("\n");
		   }
		   if (Q == i)
		   {
			   System.out.print("q ");
			   System.out.print(Q * 10);
			   System.out.print("\n");
		   }
		   }
		return 0;
	}
}
