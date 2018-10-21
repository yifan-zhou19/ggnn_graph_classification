package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num = 0;
		int l1;
		int l2;
		int a = 0;
		double p;
		String fir = new String(new char[501]);
		String sec = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
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
		if (l1 != l2)
		{
			System.out.print("error\n");
			a = 1;
		}
		for (i = 0;i < l1;i++)
		{
			if ((fir.charAt(i) != 65 && fir.charAt(i) != 67 && fir.charAt(i) != 71 && fir.charAt(i) != 84) || (sec.charAt(i) != 65 && sec.charAt(i) != 67 && sec.charAt(i) != 71 && sec.charAt(i) != 84))
			{
				if (a == 0)
				{
					System.out.print("error\n");
					a = 1;
				}
				break;
			}
			if (fir.charAt(i) == sec.charAt(i))
			{
				num += 1;
			}
		}
		if (num * 1.0 / l1 >= p != 0 && a == 0)
		{
			System.out.print("yes\n");
		}
		else if (num * 1.0 / l1 < p && a == 0)
		{
			System.out.print("no\n");
		}
		return 0;
	}


}

