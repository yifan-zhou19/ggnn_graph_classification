package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[10005]);

		int m;
		int n;
		int i;
		int k;
		int[] ch1 = new int[2005];
		int max;
		int min;
		int zd;
		int zx;
		int zd1;
		int zx1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		ch = new Scanner(System.in).nextLine();
		m = ch.length();
		for (i = 0,k = 0;i < m;i++)
		{
			if (ch.charAt(i) == ' ')
			{
				k = i + 1;
			}
			else if (ch.charAt(i) == ',')
			{
				k = i + 1;
			}
			else
			{

				ch1[k]++;
			}
		}
		min = ch1[0];
		zx = 0;
		max = ch1[0];
		zd = 0;
		for (i = 0;i < m;i++)
		{
			if (ch1[i] == 0)
			{
				continue;
			}
			if (ch1[i] < min)
			{
				min = ch1[i];
				zx = i;
			}
			if (ch1[i] > max)
			{
				max = ch1[i];
				zd = i;
			}
		}
		//printf("??%d ????%d ??%d ????%d\n",max,zd,min,zx);
		zd1 = zd;
		for (zd = zd;zd < zd1 + max;zd++)
		{
			System.out.printf("%c",ch.charAt(zd));
		}
		System.out.print("\n");

		zx1 = zx;
		for (zx;zx < zx1 + min;zx++)
		{
			System.out.printf("%c",ch.charAt(zx));
		}
		System.out.print("\n");

		return 0;
	}
}

