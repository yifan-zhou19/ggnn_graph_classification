package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		int[] a = new int[300];
		int i;
		int t;
		int n = 0;
		int k = 0;
		int max;
		int b = 0;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;i < s.length();i++)
		{
			if (b == 0)
			{
			if (s.charAt(i) != '-')
			{
			b = 1;
			t = s.charAt(i) - 48;
			f = 1;
			}
			else
			{
				b = 1;
				t = 48 - s.charAt(++i);
				f = -1;
			}
			}
			else if (s.charAt(i) == ',')
			{
				b = 0;
				a[n] = t;
				n++;
				t = 0;
			}
			else
			{
				t = t * 10 + f * (s.charAt(i) - 48);
			}
		}
		a[n] = t;
		n++;
		max = a[0];
		for (i = 1;i < n;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		k = max + 1;
		for (i = 0;i < n;i++)
		{
			if (a[i] < max)
			{
				if (k > max)
				{
					k = a[i];
				}
				else if (a[i] > k)
				{
					k = a[i];
				}
			}
		}
		if (k > max)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",k);
		}
	}
}

