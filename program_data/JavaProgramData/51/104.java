package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[502]);
		int max;
		int[] frequency = new int[251];
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		max = 1;
		if (n == 2)
		{
			for (i = 0;i < s.length() - 2;i++)
			{
				frequency[i] = 1;
				for (j = i + 1;j < s.length() - 1;j++)
				{
					if (s.charAt(i) == s.charAt(j) && s.charAt(i + 1) == s.charAt(j + 1))
					{
						frequency[i]++;
					}
				}
				if (max < frequency[i])
				{
					max = frequency[i];
				}
			}
			if (max == 1)
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.printf("%d\n",max);
				for (i = 0;i < s.length() - 2;i++)
				{
					if (frequency[i] == max)
					{
						System.out.printf("%c%c\n",s.charAt(i),s.charAt(i + 1));
					}
				}
			}
		}
		if (n == 3)
		{
			for (i = 0;i < s.length() - 3;i++)
			{
				frequency[i] = 1;
				for (j = i + 1;j < s.length() - 2;j++)
				{
					if (s.charAt(i) == s.charAt(j) && s.charAt(i + 1) == s.charAt(j + 1) && s.charAt(i + 2) == s.charAt(j + 2))
					{
						frequency[i]++;
					}
				}
				if (max < frequency[i])
				{
					max = frequency[i];
				}
			}
			if (max == 1)
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.printf("%d\n",max);
				for (i = 0;i < s.length() - 3;i++)
				{
					if (frequency[i] == max)
					{
						System.out.printf("%c%c%c\n",s.charAt(i),s.charAt(i + 1),s.charAt(i + 2));
					}
				}
			}
		}
		if (n == 4)
		{
			for (i = 0;i < s.length() - 4;i++)
			{
				frequency[i] = 1;
				for (j = i + 1;j < s.length() - 3;j++)
				{
					if (s.charAt(i) == s.charAt(j) && s.charAt(i + 1) == s.charAt(j + 1) && s.charAt(i + 2) == s.charAt(j + 2) && s.charAt(i + 3) == s.charAt(j + 3))
					{
						frequency[i]++;
					}
				}
				if (max < frequency[i])
				{
					max = frequency[i];
				}
			}
			if (max == 1)
			{
				System.out.print("NO\n");
			}
			else
			{
				System.out.printf("%d\n",max);
				for (i = 0;i < s.length() - 4;i++)
				{
					if (frequency[i] == max)
					{
						System.out.printf("%c%c%c%c\n",s.charAt(i),s.charAt(i + 1),s.charAt(i + 2),s.charAt(i + 3));
					}
				}
			}
		}
		return 0;
	}
}

