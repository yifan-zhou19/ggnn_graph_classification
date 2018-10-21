package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s = new int[200];
		int[] z = new int[200];
		int a;
		int b;
		a = 0;
		b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i] - z[i] == 1)
			{
				b++;
			}
			if (s[i] - z[i] == 2)
			{
				a++;
			}
			if (s[i] - z[i] == -1)
			{
				a++;
			}
			if (s[i] - z[i] == -2)
			{
				b++;
			}
		}
		if (b > a)
		{
			System.out.print("B");
		}
		else
		{
			if (b < a)
			{
			   System.out.print("A");
			}
			else
			{
			System.out.print("Tie");
			}
		}
		return 0;
	}

}

