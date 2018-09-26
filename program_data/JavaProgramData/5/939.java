package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Double.parseDouble(tempVar);
		}
		String zfc = new String(new char[500]);
		String jiyin = new String(new char[500]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			jiyin = tempVar3.charAt(0);
		}
		int n = 0;
		int i;
		int k;
		int L;
		int N;
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i + 1) == '\0')
			{
				L = i;
			}
		}
		//printf("%d\n",L);
		for (k = 0;jiyin.charAt(k) != '\0';k++)
		{
			if (jiyin.charAt(k + 1) == '\0')
			{
				N = k;
			}
		}
		if (L != N)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;zfc.charAt(i) != '\0';i++)
			{
				if (zfc.charAt(i) != 'A' && zfc.charAt(i) != 'T' && zfc.charAt(i) != 'C' && zfc.charAt(i) != 'G')
				{
					System.out.print("error");
					return 0;
				}
			}
			for (i = 0;jiyin.charAt(i) != '\0';i++)
			{
				if (jiyin.charAt(i) != 'A' && jiyin.charAt(i) != 'T' && jiyin.charAt(i) != 'C' && jiyin.charAt(i) != 'G')
				{
					System.out.print("error");
					return 0;
				}
			}
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) == jiyin.charAt(i))
			{
				n++;
			}
		}
					if (n * 1.0 / L > r)
					{

					   System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}



		}

		return 0;
	}
}

