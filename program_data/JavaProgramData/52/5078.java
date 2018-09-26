package <missing>;

public class GlobalMembers
{
	/*************************
	 ***??:??? 1200012776
	 ***????:????
	 ***??:2012?12?5?
	 *************************/
	public static int n;
	public static int m;
	public static int[] a = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 's', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'e', so pointers on this parameter are left unchanged:
	public static void daoxu(int * s, int * e) //????s???e?????
	{
		int temp;
		for (; s < e; s++, e--)
		{
			temp = s;
			*s = e;
			*e = temp;
		}
	}
	public static int Main()
	{
		int i;
		int[] p = a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[0]++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		daoxu(a, a + n - m - 1); //?????????0?n-m-1??,??n-m?n-1??,?????0?n-1??
		daoxu(a + n - m, a + n - 1);
		daoxu(a, a + n - 1);
		p = a;
		System.out.print(p++);
		for (; p < a + n; p++)
		{
			System.out.print(" ");
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}


}

