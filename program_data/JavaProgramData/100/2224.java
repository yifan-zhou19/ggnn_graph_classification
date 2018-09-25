package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[1000]);
		c = new Scanner(System.in).nextLine();
		int[] n = new int[1000];
		int r;
		int q;
		int m = 65;
		int p = 97;
		int num = 0;
		r = c.length();
		int a = 65;
		do
		{
			n[a] = 0;
			int i = 0;
			do
			{
				if (c.charAt(i) == a)
				{
					n[a]++;
					i++;
				}
				else
				{
					i++;
				}
			}while (i <= (r - 1));
			a++;
		}while (a <= 90);
		int b = 97;
		do
		{
			int i = 0;
			n[b] = 0;
			do
			{
				if (c.charAt(i) == b)
				{
					n[b]++;
					i++;
				}
				else
				{
					i++;
				}
			}while (i <= (r - 1));
			b++;
		}while (b <= 122);
		do
		{
			if (n[m] != 0)
			{
				 num = num + 1;
				 System.out.printf("%c=%d\n",m,n[m]);
			}
			m++;
		}while (m <= 90);
		do
		{
			if (n[p] != 0)

			{
				 num = num + 1;
				 System.out.printf("%c=%d\n",p,n[p]);
			}
			p++;
		}while (p <= 122);
		if (num == 0)
		{
			System.out.print("No\n");
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		return 0;
	}
}

