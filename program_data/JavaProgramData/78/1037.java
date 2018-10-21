package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void sort(int *,int *,int *,int *);
		int[] a = new int[4];
		int[] b = new int[4];
		int z;
		int q;
		int s;
		int l;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer_1;
		int pointer_1;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer_2;
		int pointer_2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer_3;
		int pointer_3;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pointer_4;
		int pointer_4;
	   for (z = 10;z <= 50;z += 10)
	   {
			  for (q = 10;q <= 50;q += 10)
			  {
					for (s = 10;s <= 50;s += 10)
					{
						  for (l = 10;l <= 50;l += 10)
						  {
							   if (z + q == s + l && z + l > s + q && z + s < q)
							   {
								b[0] = z,b[1] = q,b[2] = s,b[3] = l;
								a[0] = z,a[1] = q,a[2] = s,a[3] = l;
								 pointer_1 = a[0];
							  pointer_2 = a[1];
							  pointer_3 = a[2];
							  pointer_4 = a[3];
						  tangible.RefObject<Integer> tempRef_pointer_1 = new tangible.RefObject<Integer>(pointer_1);
						  tangible.RefObject<Integer> tempRef_pointer_2 = new tangible.RefObject<Integer>(pointer_2);
						  tangible.RefObject<Integer> tempRef_pointer_3 = new tangible.RefObject<Integer>(pointer_3);
						  tangible.RefObject<Integer> tempRef_pointer_4 = new tangible.RefObject<Integer>(pointer_4);
							  sort(tempRef_pointer_1, tempRef_pointer_2, tempRef_pointer_3, tempRef_pointer_4);
							  pointer_4 = tempRef_pointer_4.argValue;
							  pointer_3 = tempRef_pointer_3.argValue;
							  pointer_2 = tempRef_pointer_2.argValue;
							  pointer_1 = tempRef_pointer_1.argValue;
							   }
						  }

					}
			  }
	   }
	   for (i = 3;i >= 0;i--)
	   {
								  if (a[i] == b[0])
								  {
									  System.out.print("z");
									  System.out.print(" ");
									  System.out.print(a[i]);
									  System.out.print("\n");
								  }
							   if (a[i] == b[1])
							   {
								   System.out.print("q");
								   System.out.print(" ");
								   System.out.print(a[i]);
								   System.out.print("\n");
							   }
							   if (a[i] == b[2])
							   {
								   System.out.print("s");
								   System.out.print(" ");
								   System.out.print(a[i]);
								   System.out.print("\n");
							   }
							   if (a[i] == b[3])
							   {
								   System.out.print("l");
								   System.out.print(" ");
								   System.out.print(a[i]);
								   System.out.print("\n");
							   }
	   }
	   return 0;
	}
	public static void sort(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b, tangible.RefObject<Integer> c, tangible.RefObject<Integer> d)
	{
		if (a.argValue > b.argValue)
		{
			swap(a.argValue, b.argValue);
		}
		if (a.argValue > c.argValue)
		{
			swap(a.argValue, c.argValue);
		}
		if (a.argValue > d.argValue)
		{
			swap(a.argValue, d.argValue);
		}
		if (b.argValue > c.argValue)
		{
			swap(b.argValue, c.argValue);
		}
		if (b.argValue > d.argValue)
		{
			swap(b.argValue, d.argValue);
		}
		if (c.argValue > d.argValue)
		{
			swap(c.argValue, d.argValue);
		}

	}

}

