package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100000]);
		String c = new String(new char[26]);
		int t;
		int i;
		int[] num = new int[26];
		int j;
		int u;
		int count;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			j = 0;
			count = 0; //count???????
			while (s.charAt(j) != '\0')
			{
				for (u = 0;u < count;u++)
				{
					if (s.charAt(j) == c.charAt(u))
					{
						num[u]++;
						j++;
						break;
					}
				}
				if (u == count)
				{
					c = tangible.StringFunctions.changeCharacter(c, u, s.charAt(j));
					num[u] = 1;
					count++;
					j++;
				}
			}
			for (u = 0;u < count;u++)
			{
				if (num[u] == 1)
				{
					System.out.printf("%c\n",c.charAt(u));
					break;
				}
			}
			if (u == count)
			{
				System.out.print("no\n");
			}
		}
	}

}

