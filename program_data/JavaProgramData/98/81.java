package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		char[][] a = new char[1000][41];
		int p = 0;
		int i = 0;
		int n;
		/*gets(a[0]);
		printf("%d",strlen(a[0]));*/
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (p == 0)
			{
				System.out.printf("%s",a[i]);
				p = p + String.valueOf(a[i]).length();
			}
			else if (p + 1 + String.valueOf(a[i]).length() <= 80)
			{
				System.out.printf(" %s",a[i]);
				p = p + String.valueOf(a[i]).length() + 1;
			}
			else
			{
			/*	printf("(%i)",p);*/
				p = 0;
				i--;
				System.out.print("\n");
			}
		}
	}
}

