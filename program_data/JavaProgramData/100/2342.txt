package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[300]);
		int[] a = new int[52];
		int len;
		int i;
		int flag = 0;
		char c = 'A';
		char d = 'a';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		len = str.length();
		//printf("%d",len);
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) > 64 && str.charAt(i) < 91)
			{
				a[str.charAt(i) - 65]++; //printf("a");
			}
			if (str.charAt(i) > 96 && str.charAt(i) < 123)
			{
				a[26 + str.charAt(i) - 97]++;
			}
		}
		for (i = 0;i < 52;i++)
		{
			if (i < 26)
			{
				if (a[i] != 0)
				{
					c = c + i; //printf("%c %d",c,a[i]);
					//printf("a");
					System.out.printf("%c=%d\n",c,a[i]);
					flag = 1;
					c = 'A';
				}
			}
			else
			{
				if (a[i] != 0)
				{
					d = d + i - 26;
					System.out.printf("%c=%d\n",d,a[i]);
					flag = 1;
					d = 'a';
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("No\n");
		}
	}

}

