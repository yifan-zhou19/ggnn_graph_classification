package <missing>;

public class GlobalMembers
{
	public static void input(tangible.RefObject<Integer> n1, int[] data1, tangible.RefObject<Integer> n2, int[] data2)
	{
		 n1.argValue = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 n2.argValue = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (int i = 0;i < n1.argValue;++i)
		 {
			 data1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 for (int i = 0;i < n2.argValue;++i)
		 {
			 data2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
		 return;
	}
	public static void bubblesort(int n, int[] data)
	{
		 for (int i = n - 1;i > 0;--i)
		 {
			 for (int j = 0;j < i;++j)
			 {
				 if (data[j] > data[j + 1])
				 {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				 }
			 }
		 }
		 return;
	}
	public static int combine(int n1, int[] data1, int n2, int[] data2, int[] data3)
	{
		 for (int i = 0;i < n1;++i)
		 {
			 data3[i] = data1[i];
		 }
		 for (int i = n1;i < n1 + n2;++i)
		 {
			 data3[i] = data2[i - n1];
		 }
		 return n1 + n2;
	}
	public static void print(int n, int[] data)
	{
		 System.out.print(data[0]);
		 for (int i = 1;i < n;++i)
		 {
			 System.out.print(' ');
			 System.out.print(data[i]);
		 }
		 System.out.print("\n");
		 return;
	}
	public static int Main()
	{
		int n1;
		int n2;
		int[] a1 = new int[101];
		int[] a2 = new int[101];
		int[] a3 = new int[201];
	tangible.RefObject<Integer> tempRef_n1 = new tangible.RefObject<Integer>(n1);
	tangible.RefObject<Integer> tempRef_n2 = new tangible.RefObject<Integer>(n2);
		input(tempRef_n1, a1, tempRef_n2, a2);
		n2 = tempRef_n2.argValue;
		n1 = tempRef_n1.argValue;
		bubblesort(n1, a1);
		bubblesort(n2, a2);
	//    print(n1,a1);
	//    print(n2,a2);
		int n3 = combine(n1, a1, n2, a2, a3);
		print(n3, a3);
		return 0;
	}

}

