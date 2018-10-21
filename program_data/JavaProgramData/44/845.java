package <missing>;

public class GlobalMembers
{
	public static void reverse(String a)
	{
		int i;
		int j;
		int m;
		int t;
		int n;
		m = a.length();
		n = m / 2;

		if (a[0].equals(45))
		{
			for (i = 1;i < n + 1;i++)
			{
				t = a[i];
				a[i] = a[m - i];
				a[m - i] = t;

			}
		System.out.printf("%c",a[0]);
			for (i = 1;i < m;i++)
			{
				if (!a[i].equals('0'))
				{
				System.out.printf("%c",a[i]);
				break;
				}
			else
			{
				continue;
			}
			}
			for (i = i + 1;i < m;i++)
			{
			System.out.printf("%c",a[i]);
			}
			System.out.print("\n");
		}
		else
		{
			for (i = 0;i < n;i++)
			{
			t = a[i];
			a[i] = a[m - i - 1];
			a[m - i - 1] = t;
			}
			for (i = 0;i < m;i++)
			{
				if (!a[i].equals('0'))
				{
				System.out.printf("%c",a[i]);
				break;
				}
			else
			{
				continue;
			}
			}
			for (i = i + 1;i < m;i++)
			{
			System.out.printf("%c",a[i]);
			}
			System.out.print("\n");
		}
	}
	public static void Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int k;
		int t;
		int m;
		for (k = 0;k < 6;k++)
		{
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = tempVar.charAt(0);
		 }
		 reverse(a);
		}
	}
}

