package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c1 = new String(new char[50]);
		String c2 = new String(new char[50]);
		int[] num1 = new int[300];
		int i;
		int[] num2 = new int[300];
		int k1;
		int k2;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c1 = tempVar.charAt(0);
		}
		scanf(" ");
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c2 = tempVar2.charAt(0);
		}
		k1 = c1.length();
		k2 = c2.length();
		if (k1 != k2)
		{
			System.out.print("NO");
		}
		else if (k1 == k2)
		{
		 for (i = 0;i < k1;i++)
		 {
			num1[c1.charAt(i)] = num1[c1.charAt(i)] + 1;
			num2[c2.charAt(i)] = num2[c2.charAt(i)] + 1;
		 }
		p = 0;
		for (i = 0;i < 300;i++)
		{
			if (num1[i] != num2[i])
			{
				p = 1;
			}
		}
		if (p == 0)
		{
			System.out.print("YES");
		}
		else if (p == 1)
		{
			System.out.print("NO");
		}
		}
	}

}

