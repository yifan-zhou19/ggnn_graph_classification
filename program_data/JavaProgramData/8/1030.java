package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a1 = new int[10000];
	public static int[] a2 = new int[10000];
	public static int[] a3 = new int[10000];
	public static void X1() //???????????????
	{
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.out.print("\n");
	   for (int i = 0;i < m;i++)
	   {
		   a1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	   for (int i = 0;i < n;i++)
	   {
		   a2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
	}
	public static void X2() //???????????
	{
		int change;
		for (int i = 0;i < m - 1;i++)
		{
		   for (int j = i + 1;j < m;j++)
		   {
			  if (a1[i] > a1[j])
			  {
				 change = a1[i];
				 a1[i] = a1[j];
				 a1[j] = change;
			  }
		   }
		}
		for (int i = 0;i < n - 1;i++)
		{
		   for (int j = i + 1;j < n;j++)
		   {
			  if (a2[i] > a2[j])
			  {
				 change = a2[i];
				 a2[i] = a2[j];
				 a2[j] = change;
			  }
		   }
		}
	}
	public static void X3() //?????????
	{
		for (int i = 0;i < m;i++)
		{
			a3[i] = a1[i];
		}
		for (int i = 0;i < n;i++)
		{
			a3[i + m] = a2[i];
		}
	}
	public static void X4() //????????
	{
	   for (int i = 0;i < m + n - 1;i++)
	   {
			System.out.print(a3[i]);
			System.out.print(" ");
	   }
		System.out.print(a3[m + n - 1]);
		System.out.print("\n");
	}
	public static int Main()
	{
		X1(); //??????
		X2();
		X3();
		X4();
		return 0;
	}



}

