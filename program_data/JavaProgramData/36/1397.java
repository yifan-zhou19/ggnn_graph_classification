package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int[] c = new int[200];
		int[] d = new int[200];
		int j;
		int i;
		int k = 0;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		n = a.length();
		m = b.length();
		if (m != n)
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
				c[a.charAt(i)]++;
				d[b.charAt(i)]++;

			}
			for (i = 0;i < 200;i++)
			{
				if (c[i] == d[i])
				{
					k++;
				}
			}
			if (k == 200)
			{
				System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}



		}
	}
}

