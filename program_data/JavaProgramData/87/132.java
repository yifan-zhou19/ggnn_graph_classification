package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] h1 = new int[MAX];
		int[] h2 = new int[MAX];
		int[] m1 = new int[MAX];
		int[] m2 = new int[MAX];
		int[] s1 = new int[MAX];
		int[] s2 = new int[MAX];
		int[] second = new int[MAX];
		int a;
		int b;
		int c;
		int i;
		int p = 0;
		for (i = 0;i < MAX;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				h1[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				h2[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				m2[i] = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				s2[i] = Integer.parseInt(tempVar6);
			}
			if (h1[i] == 0 && m1[i] == 0 && s1[i] == 0 && h2[i] == 0 && m2[i] == 0 && s2[i] == 0)
			{
				break;
			}
			h2[i] = h2[i] + 12;
			a = (h2[i] - h1[i] - 1) * 60 * 60;

			b = (60 - m1[i] - 1) * 60;

			c = 60 - s1[i];

			second[i] = a + b + c + (m2[i] * 60) + s2[i];
			p++;
		}
		for (i = 0;i < p;i++)
		{
			System.out.printf("%d\n",second[i]);
		}

		return 0;
	}
}

