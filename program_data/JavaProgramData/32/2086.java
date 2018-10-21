package <missing>;

public class GlobalMembers
{
	public static int str2(tangible.RefObject<String> str, int[] a)
	{
		int length = str.argValue.intValue().length();
		int i;
		for (i = 0;i < length;i++)
		{
			a[length - i - 1] = str.argValue.charAt(i) - '0';
		}
		return length;
	}
	public static void print_b(int[] a, int length)
	{
		int t = length - 1;
		int i;
		while (a[t] == 0 && t > 0)
		{
			t--;
		}
		for (i = t;i >= 0;i--)
		{
			System.out.printf("%d",a[i]);
		}
	}
	public static int sub_b(int[] a, int alength, int[] b, int blength, int[] c)
	{
		int i;
		for (i = 0;i < alength;i++)
		{
			c[i] = a[i];
			if (i < blength)
			{
				c[i] -= b[i];
			}
		}
		for (i = 0;i < alength;i++)
		{
			if (c[i] < 0)
			{
				c[i + 1]--;
				c[i] += 10;
			}
		}
		return c[alength - 1]?alength:(alength - 1);
	}
	public static void Main()
	{
		String s1 = new String(new char[M]);
		String s2 = new String(new char[M]);
		int[] a = new int[M];
		int[] b = new int[M];
		int[] c = new int[M];
		int alength;
		int blength;
		int clength;
		int i;
		int n;
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
				s1 = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s2 = tempVar3.charAt(0);
			}
		tangible.RefObject<String> tempRef_s1 = new tangible.RefObject<String>(s1);
			alength = str2(tempRef_s1, a);
			s1 = tempRef_s1.argValue;
		tangible.RefObject<String> tempRef_s2 = new tangible.RefObject<String>(s2);
			blength = str2(tempRef_s2, b);
			s2 = tempRef_s2.argValue;
			clength = sub_b(a, alength, b, blength, c);
			print_b(c, clength);
			System.out.print("\n");
		}
	}



}

