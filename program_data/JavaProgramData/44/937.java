package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int x;
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(a[i]));
		}
	}
	public static int reverse(int x)
	{
		int wang;
		int qian;
		int bai;
		int shi;
		int ge;
		wang = x / 10000;
		qian = (x - 10000 * wang) / 1000;
		bai = (x - 10000 * wang - 1000 * qian) / 100;
		shi = (x - 10000 * wang - 1000 * qian - 100 * bai) / 10;
		ge = x - 10000 * wang - 1000 * qian - 100 * bai - 10 * shi;
		if (wang != 0)
		{
			return (10000 * ge+1000 * shi + 100 * bai + 10 * qian + wang);
		}
		else if (qian != 0)
		{
			return (1000 * ge+100 * shi + 10 * bai + qian);
		}
		else if (bai != 0)
		{
			return (100 * ge+10 * shi + bai);
		}
		else if (shi != 0)
		{
			return (10 * ge + shi);
		}
		else
		{
			return (ge);
		}
	}

}

