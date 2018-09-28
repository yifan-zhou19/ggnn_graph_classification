package <missing>;

public class GlobalMembers
{
	   /*????*/
	public static int[] a = new int[N];
	public static int[] b = new int[N];
	public static int[] c = new int[N];
	public static int na;
	public static int nb;
	public static int nc;
	public static int i;
	public static int j;

		/*????*/
	public static void input()
	{
		String ac = new String(new char[N]);
		String bc = new String(new char[N]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ac = tempVar.charAt(0);
		}
		na = ac.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			bc = tempVar2.charAt(0);
		}
		nb = bc.length();
		for (i = 0;i < na;i++)
		{
			a[i] = ac.charAt(na - 1 - i) - 48;
		}
		for (i = 0;i < nb;i++)
		{
			b[i] = bc.charAt(nb - 1 - i) - 48;
		}
	}


		 /*????*/
	public static void jian(int[] a, int[] b, int na, int nb)
	{
		nc = (na > nb)?na:nb;
		for (i = 0;i < nc;i++)
		{
			c[i] += a[i] - b[i];
			if (c[i] < 0)
			{
				c[i] += 10;
			 c[i + 1] -= 1;
			}
		}
	}



	   /*????*/
	   public static void print()
	   {
		   if (c[nc] != 0)
		   {
			   System.out.printf("%d",c[nc]);
		   }
		for (i = nc - 1;i >= 0;i--)
		{
		System.out.printf("%d",c[i]);
		}
	   }

	  /*???*/
	public static void Main()
	{
		int cishu;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			cishu = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= cishu;k++)
		{
			for (i = 0;i < N;i++)
			{
				b[i] = 0;
				a[i] = 0;
			}
			   for (i = 0;i < N;i++)
			   {
				   c[i] = 0;
			   }
			   input();
			jian(a, b, na, nb);
			print();
			System.out.print("\n");
		}
	}

}

