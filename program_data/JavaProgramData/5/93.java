package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String fir = new String(new char[1000]);
		String sec = new String(new char[1000]);
		double l1;
		double l2;
		int i;
		int j;
		int k;
		int flag = 0;
		double m = 0;
		double x;
		double n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}




		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			fir = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sec = tempVar3.charAt(0);
		}
		l1 = fir.length();
		l2 = sec.length();

		for (i = 0;i < l1;i++)
		{
			if (fir.charAt(i) != 'A' && fir.charAt(i) != 'T' && fir.charAt(i) != 'C' && fir.charAt(i) != 'G')
			{
				flag++;
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (sec.charAt(i) != 'A' && sec.charAt(i) != 'G' && sec.charAt(i) != 'C' && sec.charAt(i) != 'T')
			{
				flag++;
			}
		}
		if (l1 != l2)
		{
			flag++;
		}

		if (flag > 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (fir.charAt(i) == sec.charAt(i))
				{
					m++;
				}
			}
			x = m / l1;
			if (x > n)
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

