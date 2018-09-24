package <missing>;

public class GlobalMembers
{
	public static void sort(tangible.RefObject<Float> p1, tangible.RefObject<Float> p2, int cri)
	{ //cri:1���&#190;&#196;D?&#172;-1���&#190;&#197;&#174;
		if ((p1.argValue - p2.argValue) * cri > 0)
		{
			float temp = p1.argValue;
			p1.argValue = p2.argValue;
			p2.argValue = temp;
		}
	}

	public static int Main()
	{
		int k;
		int boynum;
		int b;
		int g;
		b = 0;
		g = 0;
		float tempheight;
		String tempsex = new String(new char[7]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		float[] boy = new float[k];
		float[] girl = new float[k];
		for (int i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tempsex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				tempheight = Float.parseFloat(tempVar3);
			}
			if (strcmp(tempsex,"male\0") == 0)
			{
				boy[b] = tempheight;
				b++;
			}
			else
			{
				girl[g] = tempheight;
				g++;
			}

			if (i == k)
			{
				boynum = b;
			}
		}
		for (int i = 1;i <= boynum - 1;i++)
		{
			for (int j = i + 1;j <= boynum;j++)
			{
				sort(boy[i - 1], boy[j - 1], 1);
			}
		}
		for (int i = 1;i <= k - boynum - 1;i++)
		{
			for (int j = i + 1;j <= k - boynum;j++)
			{
				sort(girl[i - 1], girl[j - 1], -1);
			}
		}
		System.out.printf("%.2f",boy[0]);
		for (int i = 2;i <= boynum;i++)
		{
			System.out.printf(" %.2f",boy[i - 1]);
		}
		for (int i = 1;i <= k - boynum;i++)
		{
			System.out.printf(" %.2f",girl[i - 1]);
		}

	}
}

