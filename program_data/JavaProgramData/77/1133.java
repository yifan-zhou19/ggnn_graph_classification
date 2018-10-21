public class ranking
{
			public int sex;
			public int order;
}

package <missing>;

public class GlobalMembers
{
	public static ranking[] stu = tangible.Arrays.initializeWithDefaultrankingInstances(100);
	public static void check(int len)
	{
		 int x;
		 int y;
		 for (x = 0; x < len - 1; x++)
		 {
				  if (stu[x].sex == 1 && stu[x + 1].sex == 0)
				  {
								System.out.print(stu[x].order);
								System.out.print(" ");
								System.out.print(stu[x + 1].order);
								System.out.print("\n");
								for (y = x; y < len - 2; y++)
								{
										 stu[y] = stu[y + 2];
								}
								return;
				  }
		 }
	}

	public static int Main(String[] args)
	{
		String ary = new String(new char[100]);
		char boy;
		char girl;
		int len;
		int[] order = new int[100];
		int i;
		int j;
		int k;
		ary = new Scanner(System.in).nextLine();
		len = ary.length();
		if (len % 2 == 0)
		{
				 for (i = 0; i < len; i++)
				 {
						  order[i] = ary.charAt(i) == ary.charAt(0)? 1:0;
				 }

				 for (j = 0; j < len; j++)
				 {
						  stu[j].sex = order[j];
						  stu[j].order = j;
				 }
				 while (len != 0)
				 {
							   check(len);
							   len -= 2;
				 }
		}
		else
		{
		System.out.print("wrong input");
		System.out.print("\n");
		}



		return EXIT_SUCCESS;
	}
}

