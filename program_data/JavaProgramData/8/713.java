package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//??????? 
	//??????? 
	//??????
	//***********************************************************************
	public static void in(int n, int[] a)
	{
		for (int i = 0; i < n; i++)
		{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void arrange(int n, int[] a)
	{
		int temp;
		for (int i = 0; i < n; i++)
		{
				for (int j = 0; j < n - i - 1; j++)
				{
						if (a[j] > a[j + 1])
						{
								temp = a[j];
								a[j] = a[j + 1];
								a[j + 1] = temp;
						}
				}
		}
	}
											//???????? 
	public static void connect(int n1, int n2, int[] a, int[] b, int[] c)
	{
		int l = 0;
		for (int i = 0; i < n1; i++, l++)
		{
				c[l] = a[i];
		}
		for (int j = 0; j < n2; j++, l++)
		{
				c[l] = b[j];
		}
	}
	public static void out(int n, int[] c)
	{
		 for (int i = 0; i < n - 1; i++)
		 {
				 System.out.print(c[i]);
				 System.out.print(" ");
		 }
		 System.out.print(c[n - 1]);
		 System.out.print("\n");
	}
	public static int Main() //???
	{
		int n1;
		int n2;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[2000];
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		in(n1, a); //????
		in(n2, b);
		arrange(n1, a);
		arrange(n2, b);
		connect(n1, n2, a, b, c);
		out(n1 + n2, c);
		return 0;
	} //?????

}

