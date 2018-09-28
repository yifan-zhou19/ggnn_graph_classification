package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int[] mar = new int[100];
		int n;
		int i;
		int t;
		int k;
		int max1;
		int max;
		int min1;
		int min;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		i = 0;
		t = 0;
		max = 0;
		min = 65535;
		while (i < n)
		{
			if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{
			t++;
			mar[t] = i;
			k = 0;
			while ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{
				i++;
				k++;
			}
			if (max < k)
			{
				max = k;
				max1 = t;
			}
			if (min > k)
			{
				min = k;
				min1 = t;
			}
			}
			i++;
		}
		for (i = mar[max1];i < mar[max1] + max;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		for (i = mar[min1];i < mar[min1] + min;i++)
		{
			System.out.printf("%c",a.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}

}
