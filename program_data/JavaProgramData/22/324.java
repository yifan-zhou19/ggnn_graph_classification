package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
	int max;
	int submax;
	int l;
	int t;
	int k;
	int j;
	int i;
	int[] b = new int[10000];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		j = 0;
		t = 0;
		for (i = 1;i <= 500;i++)
		{
		b[i] = 0;
		}
		for (i = 0;i <= l - 1;i++)
		{


			if (a.charAt(i) == ',')
			{
			t = t + 1;
			for (k = j;k <= i - 1;k++)
			{
				if (a.charAt(k) == '0')
				{
					b[t] = b[t] * 10 + 0;
				}
			if (a.charAt(k) == '1')
			{
				b[t] = b[t] * 10 + 1;
			}
			if (a.charAt(k) == '2')
			{
				b[t] = b[t] * 10 + 2;
			}
			if (a.charAt(k) == '3')
			{
				b[t] = b[t] * 10 + 3;
			}
			if (a.charAt(k) == '4')
			{
				b[t] = b[t] * 10 + 4;
			}
			if (a.charAt(k) == '5')
			{
				b[t] = b[t] * 10 + 5;
			}
			if (a.charAt(k) == '6')
			{
				b[t] = b[t] * 10 + 6;
			}
			if (a.charAt(k) == '7')
			{
				b[t] = b[t] * 10 + 7;
			}
			if (a.charAt(k) == '8')
			{
				b[t] = b[t] * 10 + 8;
			}
			if (a.charAt(k) == '9')
			{
				b[t] = b[t] * 10 + 9;
			}
			}
		j = i + 1;
			}

		}
		t = t + 1;
	for (k = j;k <= l - 1;k++)
	{
				if (a.charAt(k) == '0')
				{
					b[t] = b[t] * 10 + 0;
				}
			if (a.charAt(k) == '1')
			{
				b[t] = b[t] * 10 + 1;
			}
			if (a.charAt(k) == '2')
			{
				b[t] = b[t] * 10 + 2;
			}
			if (a.charAt(k) == '3')
			{
				b[t] = b[t] * 10 + 3;
			}
			if (a.charAt(k) == '4')
			{
				b[t] = b[t] * 10 + 4;
			}
			if (a.charAt(k) == '5')
			{
				b[t] = b[t] * 10 + 5;
			}
			if (a.charAt(k) == '6')
			{
				b[t] = b[t] * 10 + 6;
			}
			if (a.charAt(k) == '7')
			{
				b[t] = b[t] * 10 + 7;
			}
			if (a.charAt(k) == '8')
			{
				b[t] = b[t] * 10 + 8;
			}
			if (a.charAt(k) == '9')
			{
				b[t] = b[t] * 10 + 9;
			}
	}
	max = 0;
	for (i = 1;i <= t;i++)
	{
		if (b[i] > max)
		{
			max = b[i];
		}
	}
	submax = -1;

	for (i = 1;i <= t;i++)
	{
	if (b[i] != max && b[i] > submax)
	{
		submax = b[i];
	}
	}
	if (submax != -1)
	{
		System.out.printf("%d",submax);
	}
	else
	{
		System.out.print("No");
	}
	}



}
