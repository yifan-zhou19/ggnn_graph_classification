public class node
{
	public String s = new String(new char[100010]);
	public int[] sign = new int[100010];
}

package <missing>;

public class GlobalMembers
{
	public static node x = new node();

	public static void Main()
	{
		int t;
		int i;
		int j;
		int k;
		int[] a = new int[100010];
		int l;
		String s0 = new String(new char[2]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 t = Integer.parseInt(tempVar);
		 }
		s0 = new Scanner(System.in).nextLine();
		for (j = 0;j < t;j++)
		{
			for (i = 0;i < 100010;i++)
			{
				x.sign[i] = 1;
			}
			x.s = new Scanner(System.in).nextLine();
			l = x.s.length();
			for (i = 0;i < l - 1;i++)
			{
				a[i] = 1;
				if (i == l - 2)
				{
					a[i + 1] = 1;
				}
				for (k = i + 1;k < l;k++)
				{
					if (x.s.charAt(k) == x.s.charAt(i) && x.sign[i] != 0)
					{
						a[i]++;
						x.sign[k] = 0;
					}
				}
			}
			for (i = 0;i < l;i++)
			{
				if (a[i] == 1 && x.sign[i] != 0)
				{
					System.out.printf("%c\n",x.s.charAt(i));
					break;
				}
			}
			if (i == l)
			{
				System.out.print("no\n");
			}
		}
	}

}

