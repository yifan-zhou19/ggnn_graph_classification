public class cha
{
	public char zimu;
	public int n;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int num = 1;
		int i;
		int j;
		int k;
		int l;
		int a;
		String c = new String(new char[10000]);
		cha[] x = tangible.Arrays.initializeWithDefaultchaInstances(26);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		for (i = 0;i < t;i++)
		{
			num = 1;
			c = new Scanner(System.in).nextLine();
			x[0].zimu = c.charAt(0);
			x[0].n = 0;
			l = c.length();
			for (j = 1;j < l;j++)
			{
				a = 0;
				for (k = 0;k < num;k++)
				{
					if (x[k].zimu == c.charAt(j))
					{
						x[k].n++;
						a++;
					}
				}
				if (a == 0)
				{
					x[num].zimu = c.charAt(j);
					x[num].n = 0;
					num++;
				}
			}
			a = 0;
			for (j = 0;j < num;j++)
			{
				if (x[j].n == 0)
				{
					System.out.printf("%c\n",x[j].zimu);
					a++;
					break;
				}
			}
			if (a == 0)
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}
}

