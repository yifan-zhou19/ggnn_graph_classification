package <missing>;

public class GlobalMembers
{
	public static void sub(String a, String b)
	{
		int l1;
		int l2;
		int i;
		int j;
		int k;
		l1 = a.length();
		l2 = b.length();
		for (i = l1 - 1,j = l2 - 1;j >= 0;i--,j--)
		{
			if (a[i].compareTo(b[j]) > 0)
			{
				a[i] = a[i] - b[j].Substring(48);
			}
			else if (a[i].equals(b[j]))
			{
				a[i] = '0';
			}
			else
			{
				a[i] = a[i] - b[j].Substring(58);
				for (k = i - 1;a[k].equals('0');k--)
				{
					a[k] = '9';
				}
				a[k] = a[k] - 1;
			}
		}
		if (a[0].equals('0'))
		{
			for (i = 1;i < l1;i++)
			{
				System.out.printf("%c",a[i]);
			}
			System.out.print("\n");
		}
		else
		{
			System.out.printf("%s\n",a);
		}
	}



	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 1;m <= n;m++)
		{
			if (m > 1)
			{
				System.out.print("\n");
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			sub(a, b);
		}
	}
}

