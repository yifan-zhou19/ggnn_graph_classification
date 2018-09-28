package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int[][] s = new int[200][2];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][0] == s[i][1])
			{
				a = a;
				b = b;
			}
			if (s[i][0] == 0 && s[i][1] == 1)
			{
				a++;
				b = b;
			}
			if (s[i][0] == 0 && s[i][1] == 2)
			{
				a = a;
				b++;
			}
			if (s[i][0] == 1 && s[i][1] == 0)
			{
				a = a;
				b++;
			}
			if (s[i][0] == 1 && s[i][1] == 2)
			{
				a++;
				b = b;
			}
			if (s[i][0] == 2 && s[i][1] == 1)
			{
				a = a;
				b++;
			}
			if (s[i][0] == 2 && s[i][1] == 0)
			{
				a++;
				b = b;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}

}

