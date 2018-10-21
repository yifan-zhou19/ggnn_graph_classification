package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str1 = new String(new char[1000]);
		String str2 = new String(new char[1000]);
		int len1;
		int len2;
		int i;
		int j;
		int temp;
		int num = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		len1 = str1.length();
		len2 = str2.length();
		for (i = 0;i < len1;i++)
		{
			a[i] = str1.charAt(i);
			b[i] = str2.charAt(i);
		}
		for (i = 0;i < len1;i++)
		{
			for (j = 0;j < len1 - 1 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < len1;i++)
		{
			for (j = 0;j < len1 - 1 - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < len1;i++)
		{
			if (len1 != len2)
			{
				System.out.print("NO");
				break;
			}
			if (a[i] == b[i])
			{
				num++;
			}
		}
		if (num == len1)
		{
			System.out.print("YES");
		}
		if (num != len1 && num != 0)
		{
			System.out.print("NO");
		}
	}
}

