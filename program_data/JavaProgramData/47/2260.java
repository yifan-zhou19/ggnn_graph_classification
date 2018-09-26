package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????????n?????i?j?p ?q??????num
		int i;
		int j;
		int p;
		int num;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100]; //?????100???a
		for (i = 1;i <= n;i++) //????
		{
						 num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 a[i] = num;
		}
		p = (n - n % 2) / 2;
		for (i = 1;i <= p;i++) //????
		{
						 q = a[n + 1 - i];
						 a[n + 1 - i] = a[i];
						 a[i] = q; //??????????
		}
		for (i = 1;i <= n;i++) //????
		{
						 if (i != n)
						 {
						 System.out.print(a[i]);
						 System.out.print(" ");
						 }
						 else
						 {
						 System.out.print(a[i]);
						 }
		}
		return 0;
	}

}

