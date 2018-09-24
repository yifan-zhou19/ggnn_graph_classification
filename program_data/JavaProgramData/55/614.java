package <missing>;

public class GlobalMembers
{
	public static int change1(String a, int n1)
	{
		int s = 0;
		int temp;
		int len;
		int i;
		len = a.length();

		for (i = 0;i < len;i++)
		{
			if (a[i].compareTo('0') >= 0 && a[i].compareTo('9') <= 0)
			{
				temp = a[i] - '0';
			}
			if (a[i].compareTo('a') >= 0 && a[i].compareTo('z') <= 0)
			{
				temp = a[i] - 'a' + 10;
			}
			if (a[i].compareTo('A') >= 0 && a[i].compareTo('Z') <= 0)
			{
				temp = a[i] - 'A' + 10;
			}

			s = s * n1 + temp;

		}

		return s;
	}

	public static void change2(int s, int n2, String b)
	{
		int i = 0;
		int j;
		int temp;
		int add;
		while (s > 0)
		{
			add = s % n2;

			if (add >= 10)
			{
				b[i] = add - 10 + 'A';
			}
			else
			{
				b[i] = add + '0';
			}


			i++;
			s = s / n2;

		}
			for (j = 0;j <= i / 2 - 1;j++)
			{
				temp = b[j];
				b[j] = b[i - 1 - j];
				b[i - 1 - j] = temp;
			}
	}



	public static void Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] b = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int n1;
		int n2;
		int len;
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n2 = Integer.parseInt(tempVar3);
		}

		s = change1(a, n1);

		change2(s, n2, b);
		len = b.length();
		if (len > 0)
		{
		for (i = 0;i < len;i++)
		{
		   System.out.printf("%c",b[i]);
		}
		System.out.print("\n");
		}
		if (len == 0)
		{
			System.out.print("0\n");
		}
	}




}

