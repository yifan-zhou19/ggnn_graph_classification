package <missing>;

public class GlobalMembers
{
	public static int fxiao(int[] N1, int n)
	{
		int i;
		int xiao;
		xiao = N1[0];
		for (i = 0;i < n;i++)
		{
			if (N1[i] < xiao)
			{
				xiao = N1[i];
			}
		}
		return xiao;
	}
	public static int fda(int[] N2, int n)
	{
		int i;
		int da;
		da = N2[0];
		for (i = 0;i < n;i++)
		{
			if (N2[i] > da)
			{
				da = N2[i];
			}
		}
		return da;
	}

	public static void Main()
	{
		int[] N1 = new int[1002];
		int[] N2 = new int[1002];
		String b = new String(new char[1002]);
		int i;
		int j;
		int num;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				N1[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
			}
			if (b.charAt(i) != ',')
			{
				num = i + 1;
				break;
			}
		}
		for (i = 0;i < num;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N2[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, tempVar4);
			}
		}
		System.out.printf("%d ",num);
		int min = fxiao(N1, num);
		int max = fda(N2, num);
		int[] N = new int[1001];
		int k;
		for (i = min;i <= max;i++)
		{
			for (j = 0;j < num;j++)
			{
				if (i >= N1[j] != 0 && i < N2[j])
				{
					N[i]++;
				}
			}
		}
		int p = fda(N, max - min + 1);
		System.out.printf("%d\n",p);
	}
}

