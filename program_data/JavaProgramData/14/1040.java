public class Top
{
	public int num;
	public float score;
}

package <missing>;

public class GlobalMembers
{
	public static Top[] Top =
	{
		new Top(0, 0),
		null,
		null,
		null
	};
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static Top * p = new Top();

	public static void maopao(int n)
	{
		int i;
		for (i = 1; i < n; i++)
		{
			for (p = Top; p < Top + n - i; p++)
			{
				if ((p.score) < ((p + 1).score))
				{
					Top[3] = p;
					*p = (p + 1);
					*(p + 1) = Top[3];
				}
			}
		}
	}

	public static void sort(float a, int n)
	{
		p = Top + 2;
		if (a > (p.score))
		{
			p.score = a;
			p.num = n;
		}
		maopao(3);
	}

	public static int Main()
	{
		int i;
		int n;
		int num;
		float yw;
		float sx;
		float score;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				yw = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sx = Float.parseFloat(tempVar4);
			}
			float score = yw + sx;
			sort(score, num);
		}
		for (p = Top;p < Top + 3;p++)
		{
			System.out.printf("%d %g\n", p.num, p.score);
		}

		return 0;
	}
}

