package <missing>;

public class GlobalMembers
{
		public static int i;
		public static int l;
		public static int count;
		public static String s = new String(new char[101]);
		public static int[] a = new int[101];
		public static int[] y = new int[101];

	public static void ry(int[] y)
	{
		 int i;
		 int j;
		 if (count == l)
		 {
		   return;
		 }
		 for (i = 0;i < l;i++)
		 {
			if (y[i] == 1)
			{
			   j = i + 1;
			   while (y[j] == 0)
			   {
				 j++;
			   }
			   if (j >= l)
			   {
				 continue;
			   }
			   if ((a[i] == 0) && (a[j] == 1))
			   {
				  y[i] = 0;
				  y[j] = 0;
				  count += 2;
				  System.out.printf("%d %d\n",i,j);
				  ry(y);
				  return;
			   }
			}
		 }
	}


	public static int Main()
	{



		s = new Scanner(System.in).nextLine();
		l = s.length();

		for (i = 0;i < l;i++)
		{
		   a[i] = !(s.charAt(i) == s.charAt(0));
		}

		a[l] = -1;

		for (i = 0;i < l;i++)
		{
		   y[i] = 1;
		}
		y[l] = 1;

		count = 0;
		ry(y);
		//printf("2 3\n5 6\n4 7\n8 9\n1 10\n12 13\n11 14\n0 15\n");



		return 0;
	}

}
