package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		int length1;
		int length2;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
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
			length1 = s1.length();
			length2 = s2.length();
			for (i = 0;i < 100;i++)
			{
				a[i] = 0;
				b[i] = 0;
			}
			for (i = 0;i < length1;i++)
			{
				a[length1 - 1 - i] = s1.charAt(i) - '0';
			}
			for (i = 0;i < length2;i++)
			{
				b[length2 - 1 - i] = s2.charAt(i) - '0';
			}
			for (i = 0;i < length1;i++)
			{
				a[i] -= b[i];
				if (a[i] < 0)
				{
					a[i + 1]--;
					a[i] += 10;
				}
			}
			for (i = length1 - 1;i >= 0;i--)
			{
				if (a[i] != 0)
				{
					j = i;
					break;
				}
			}
			for (i = j;i >= 0;i--)
			{
				System.out.printf("%d",a[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

