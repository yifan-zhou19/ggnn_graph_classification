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
		int i;
		int p;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (z = 10;z <= 50;z += 10)
		{
		 for (q = 10;q <= 50;q += 10)
		 {
		   for (s = 10;s <= 50;s += 10)
		   {
			 for (l = 10;l <= 50;l += 10)
			 {

			 if (z != q && z != s && z != l && q != s && q != l && s != l && z + q == s + l && z + l > s + q && z + s < q)
			 {
				a[0] = z;
				a[1] = q;
				a[2] = s;
				a[3] = l;
			 }
			 }
		   }
		 }
		}
				z = a[0];
				q = a[1];
				s = a[2];
				l = a[3];
		   for (j = 1;j <= 3;j++)
		   {
			   for (i = 0;i <= 3 - j;i++)
			   {
				  if (a[i] < a[i + 1])
				  {
					  p = a[i];
					  a[i] = a[i + 1];
					  a[i + 1] = p;
				  }
			   }
		   }
			   if (a[0] == z)
			   {
			   System.out.print("z ");
			   System.out.print(z);
			   System.out.print("\n");
			   }
			   if (a[0] == q)
			   {
			   System.out.print("q ");
			   System.out.print(q);
			   System.out.print("\n");
			   }
			   if (a[0] == s)
			   {
			   System.out.print("s ");
			   System.out.print(s);
			   System.out.print("\n");
			   }
			   if (a[0] == l)
			   {
			   System.out.print("l ");
			   System.out.print(l);
			   System.out.print("\n");
			   }
			   if (a[1] == z)
			   {
			   System.out.print("z ");
			   System.out.print(z);
			   System.out.print("\n");
			   }
			   if (a[1] == q)
			   {
			   System.out.print("q ");
			   System.out.print(q);
			   System.out.print("\n");
			   }
			   if (a[1] == s)
			   {
			   System.out.print("s ");
			   System.out.print(s);
			   System.out.print("\n");
			   }
			   if (a[1] == l)
			   {
			   System.out.print("l ");
			   System.out.print(l);
			   System.out.print("\n");
			   }
			   if (a[2] == z)
			   {
			   System.out.print("z ");
			   System.out.print(z);
			   System.out.print("\n");
			   }
			   if (a[2] == q)
			   {
			   System.out.print("q ");
			   System.out.print(q);
			   System.out.print("\n");
			   }
			   if (a[2] == s)
			   {
			   System.out.print("s ");
			   System.out.print(s);
			   System.out.print("\n");
			   }
			   if (a[2] == l)
			   {
			   System.out.print("l ");
			   System.out.print(l);
			   System.out.print("\n");
			   }
			   if (a[3] == z)
			   {
			   System.out.print("z ");
			   System.out.print(z);
			   System.out.print("\n");
			   }
			   if (a[3] == q)
			   {
			   System.out.print("q ");
			   System.out.print(q);
			   System.out.print("\n");
			   }
			   if (a[3] == s)
			   {
			   System.out.print("s ");
			   System.out.print(s);
			   System.out.print("\n");
			   }
			   if (a[3] == l)
			   {
			   System.out.print("l ");
			   System.out.print(l);
			   System.out.print("\n");
			   }
	return 0;
	}





}
