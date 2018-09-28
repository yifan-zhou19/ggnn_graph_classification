package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int shijinzhi = 0;
		int result = 0;
		int q;
		int p = 0;
		int k = 0;
		String n = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (n.charAt(0) >= 48 && n.charAt(0) <= 57)
		{
			j = n.charAt(0) - 48;
		}
		if (n.charAt(0) >= 65 && n.charAt(0) <= 90)
		{
			j = n.charAt(0) - 55;
		}
		if (n.charAt(0) >= 97 && n.charAt(0) <= 122)
		{
			j = n.charAt(0) - 87;
		}
		shijinzhi = shijinzhi + j;
		for (i = 1;;i++)
		{
			if (n.charAt(i) == '\0')
			{
				break;
			}
			else
			{
			if (n.charAt(i) >= 48 && n.charAt(i) <= 57)
			{
				j = n.charAt(i) - 48;
			}
			if (n.charAt(i) >= 65 && n.charAt(i) <= 90)
			{
				j = n.charAt(i) - 55;
			}
			if (n.charAt(i) >= 97 && n.charAt(i) <= 122)
			{
				j = n.charAt(i) - 87;
			}
			shijinzhi = shijinzhi * a + j;
			}
		}
		q = shijinzhi;
		int s = 1;
		int t;
		shijinzhi = shijinzhi / b;
		while (shijinzhi != 0)
		{
			shijinzhi = shijinzhi / b;
			s = s * b;
			p++;
		}
		shijinzhi = q;
		while (shijinzhi != 0)
		{
			t = shijinzhi / s;
			if (t <= 9)
			{
				System.out.printf("%c",t + 48);
			}
			else
			{
				System.out.printf("%c",t + 55);
			}
			shijinzhi = shijinzhi - t * s;
			s = s / b;
			k++;
		}
		if (k < p + 1)
		{
			for (i = 0;i < p + 1 - k;i++)
			{
				System.out.printf("%c",48);
			}
		}
	}





}

