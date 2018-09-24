package <missing>;

public class GlobalMembers
{
		public static int a;
		public static int[] an1 = new int[MAX + 10];
		public static int[] an2 = new int[MAX + 10];
		public static char[] szLine1 = {0};
		public static char[] szLine2 = {0};
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			szLine1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			szLine2 = tempVar2.charAt(0);
		}
		int i;
		int j;
		int nLen1 = szLine1.length();
		int nLen2 = szLine2.length();
		j = 0;
		for (i = nLen1 - 1;i >= 0;i--)
		{
							   an1[j++] = szLine1[i] - '0';
		}
		j = 0;
		for (i = nLen2 - 1;i >= 0;i--)
		{
							   an2[j++] = szLine2[i] - '0';
		}
		for (i = 0;i < MAX;i++)
		{
						  an1[i] += an2[i];
						  if (an1[i] >= 10)
						  {
										an1[i] -= 10;
										an1[i + 1]++;
						  }
		}
		for (i = MAX;i >= 0;i--)
		{
						   if (an1[i] != 0)
						   {
							  a = i;
							  break;
						   }

		}
		for (i = a;i >= 0;i--)
		{
		System.out.printf("%d",an1[i]);
		}

	}

}

