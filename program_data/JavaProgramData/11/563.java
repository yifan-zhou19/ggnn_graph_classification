package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i;
		int e;
		int[] s = new int[12];
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
		{
			s[1] = 29;
		}
		else
		{
			s[1] = 28;
		}
		s[0] = 31;
		s[2] = 31;
		s[3] = 30;
		s[4] = 31;
		s[5] = 30;
		s[6] = 31;
		s[7] = 31;
		s[8] = 30;
		s[9] = 31;
		s[10] = 30;
		s[11] = 31;
		for (i = 1;i <= b;i++)
		{
			d = d + s[i - 2];
		}
		e = d + c;
		System.out.printf("%d",e);
		return 0;
	}


}

