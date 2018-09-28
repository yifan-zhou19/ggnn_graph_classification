package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		float a;
		float b;
		float c;
		float s;
		float d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		j = 1;
		while (j <= m)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			i = 1;
			a = 1F,b = 2F;
			s = 0F;
			while (i <= n)
			{
				c = b / a;
				s = s + c;
				d = b;
				b = a + b;
				a = d;
				i++;
			}
			System.out.printf("%.3f\n",s);
			j++;
		}
		return 0;
	}

}

