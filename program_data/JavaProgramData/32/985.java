package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a1 = new int[Max + 10];
		int[] a2 = new int[Max + 10];
		String s1 = new String(new char[Max + 10]);
		String s2 = new String(new char[Max + 10]);
		int i;
		int j;
		int k = 0;
		int e;
		int f;
		int n;
		int L1;
		int L2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		do
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s2 = tempVar3.charAt(0);
		}
		L1 = s1.length();
		L2 = s2.length();
		j = 0;
		if (L1 == 1 && L2 == 1)
		{
			e = s1.charAt(0) - '0';
			f = s2.charAt(0) - '0';
			System.out.printf("%d",e - f);
		}
		else
		{
		for (i = L1 - 1;i >= 0;i--)
		{
			a1[j++] = s1.charAt(i) - '0';
		}
		j = 0;
		for (i = L2 - 1;i >= 0;i--)
		{
			a2[j++] = s2.charAt(i) - '0';
		}
		for (i = 0;i < Max;i++)
		{
			a1[i] -= a2[i];
			if (a1[i] < 0)
			{
				a1[i] += 10;
				a1[i + 1]--;
			}
		}
		for (i = Max;i >= 0;i--)
		{
			if (a1[i] != 0)
			{
				j = i;
				break;
			}
		}
		for (i = j;i >= 0;i--)
		{
			System.out.printf("%d",a1[i]);
	if (i == 0)
	{
	System.out.print("\n");
	}
		}
		for (i = 0;i < Max;i++)
		{
			a1[i] = 0;
			a2[i] = 0;
		}
		System.in.read();
		k++;
		}
		}while (k < n);
		return 0;
	}


}

