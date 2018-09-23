package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int a;
		int b;
		int c;
		int i;
		int[] s = new int[13];
		int t;
		int n;
		s[0] = 0;
		s[1] = 31;
		s[3] = 31;
		s[4] = 30;
		s[5] = 31;
		s[6] = 30;
		s[7] = 31;
		s[8] = 31;
		s[9] = 30;
		s[10] = 31;
		s[11] = 30;
		s[12] = 31;
		t = 0;
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
		for (i = 1;i < b;i++)
		{
			if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0)
			{
				s[2] = 29;
			t = s[i] + t;
			}
			else
			{
				s[2] = 28;
			t = s[i] + t;
			}
		}
		n = t + c;
		System.out.printf("%d\n",n);
	}
}

