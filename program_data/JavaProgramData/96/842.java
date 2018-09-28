package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String N = new String(new char[100]);
		int[] sza = new int[100];
		int[] szb = new int[100];
		int l;
		int i;
		int m;
		int temp;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = tempVar.charAt(0);
		}
		l = N.length();
		for (i = 0;i < l;i++)
		{
			sza[i] = (int)(N.charAt(i) - '0');
		}
		if (l == 1)
		{
				 System.out.printf("0\n%d",sza[0]);
				 return 0;
		}
		temp = sza[0];
		for (i = 0;i < l - 1;i++)
		{
			m = temp * 10 + sza[i + 1];
			szb[i] = m / 13;
			temp = m % 13;
		}
		n = temp;
		for (i = 0;i < l - 1;i++)
		{
			if (i == 0 && i + 1 < l - 1)
			{
				if (szb[i] == 0)
				{
					continue;
				}
			}
			System.out.printf("%d",szb[i]);
		}
		System.out.printf("\n%d",n);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		return 0;
	}
}

