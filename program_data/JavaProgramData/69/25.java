package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[250]);
		String s2 = new String(new char[250]);
		int[] a = new int[250];
		int[] b = new int[250];
		int[] c = new int[250];
		int i;
		int j;
		int len1;
		int len2;
		int max;
		for (i = 0;i < 250;i++)
		{
			a[i] = 0;
			b[i] = 0;
			c[i] = 0;
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		len1 = s1.length();
		len2 = s2.length();
		for (i = 0;i < len1;i++)
		{
			a[len1 - i - 1] = s1.charAt(i) - '0';
		}
		for (i = 0;i < len2;i++)
		{
			b[len2 - i - 1] = s2.charAt(i) - '0';
		}
		if (a[0] == 0 && b[0] == 0 && len1 == 1 && len2 == 1)
		{
			System.out.print("0");
		}
		else
		{
		for (i = 0;i < len1 || i < len2;i++)
		{
			if (a[i] + b[i] + c[i] < 10)
			{
				c[i] = a[i] + b[i] + c[i];
			}
			else
			{
				c[i] = a[i] + b[i] + c[i] - 10;
				c[i + 1] = c[i + 1] + 1;
			}
		}

		if (len1 > len2)
		{
			max = len1;
		}
		else
		{
			max = len2;
		}

		for (i = max;i >= 0;i--)
		{
			if (c[i] != 0)
			{
				break;
			}
		}

		for (j = i;j >= 0;j--)
		{
			System.out.printf("%d",c[j]);
		}
		System.out.print("\n");
		}
	}






}

