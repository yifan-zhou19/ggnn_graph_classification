package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] s1 = new int[200];
		int[] s2 = new int[200];
		int a = 0;
		int b = 0;
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
				s1[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s2[i] = Integer.parseInt(tempVar3);
			}
			if ((s1[i] - s2[i]) == 1)
			{
				b++;
			}
			else if ((s2[i] - s1[i]) == 1)
			{
				a++;
			}
			else if (s2[i] > s1[i])
			{
				b++;
			}
			else if (s2[i] < s1[i])
			{
				a++;
			}
		}
		if (a < b)
		{
			System.out.print("B");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a > b)
		{
			System.out.print("A");
		}
		return 0;
	}


}

