package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int x;
		int i;
		int j;
		int l;
		int d;
		String str = new String(new char[100000]);
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (x = 0;x < t;x++)
		{
			d = 0;
			for (i = 0;i < 100000;i++)
			{
				a[i] = 0;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			l = str.length();
			for (i = 0;i < l;i++)
			{
				for (j = 0;j < l;j++)
				{
					if (str.charAt(i) == str.charAt(j))
					{
						a[i]++;
					}
				}
				if (a[i] == 1)
				{
						System.out.printf("%c\n",str.charAt(i));
						d = 1;
						break;
				}
			}
			if (d == 0)
			{
				System.out.print("no\n");
			}
		}
	}

}

