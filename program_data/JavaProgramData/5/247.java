package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String moban = new String(new char[500]);
		String hubu = new String(new char[500]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			moban = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			hubu = tempVar3.charAt(0);
		}
		int m;
		int n;
		m = moban.length();
		n = hubu.length();
		if (m != n)
		{
			System.out.print("error");
		}
		else
		{
			int count = 0;
			for (int i = 0;i < n;i++)
			{
				if (moban.charAt(i) != 'A' && moban.charAt(i) != 'T' && moban.charAt(i) != 'C' && moban.charAt(i) != 'G')
				{
					count++;
				}
				if (hubu.charAt(i) != 'A' && hubu.charAt(i) != 'T' && hubu.charAt(i) != 'C' && hubu.charAt(i) != 'G')
				{
					count++;
				}


			}
			if (count != 0)
			{
				System.out.print("error");
			}
			else
			{
				int sum = 0;
				for (int i = 0;i < n;i++)
				{
					if (moban.charAt(i) == hubu.charAt(i))
					{
						sum++;
					}


				}
					double result = (double)sum / n;
					if (result > k)
					{
						System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}


			}


		}
		//scanf("%lf",&k);
		return 0;
	}
}

