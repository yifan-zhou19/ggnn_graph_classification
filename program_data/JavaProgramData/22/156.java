package <missing>;

public class GlobalMembers
{
	public static int checkNum(char c)
	{
		if (c >= 48 && c <= 57)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void change(tangible.RefObject<Integer> p, tangible.RefObject<Integer> q)
	{
		p.argValue = p.argValue + q.argValue;
		q.argValue = p.argValue - q.argValue;
		p.argValue = p.argValue - q.argValue;
	}

	public static int Main()
	{
		String s = new String(new char[1000]);
		int i;
		int j;
		int t;
		int[] a = new int[500];
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		i = 0;
		while (s.charAt(i) != '\0')
		{
			if (checkNum(s.charAt(i)) == 0)
			{
				i++;
				continue;
			}
			else
			{
				t = 0;
				while (checkNum(s.charAt(i)) != 0)
				{
					t = t * 10 + s.charAt(i) - 48;
					i++;
				}
				a[count] = t;
				count++;
			}
		}
		if (count == 1)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0;i < count - 1;i++)
			{
				for (j = i + 1;j < count;j++)
				{
					if (a[i] > a[j])
					{
							change(a[i], a[j]);
					}
				}
			}
			i = count - 2;
			j = i + 1;
			while (a[j] == a[i] && i >= 0)
			{
				i--;
			}
			if (i < 0)
			{
				System.out.print("No\n");
			}
			else
			{
				System.out.printf("%d\n",a[i]);
			}
		}
	}

}

