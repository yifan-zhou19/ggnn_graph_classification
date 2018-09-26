package <missing>;

public class GlobalMembers
{
	public static void com(String str)
	{
	 int k;
	 int i;
	 int j;
	 int f = 0;
	 int flag;
	 k = str.length() - 1;

	 for (i = 0;i < k;i++)
	 {
		 if (str[i].equals('0'))
		 {
		 continue;
		 }
		 else
		 {
			 flag = 1;
		 for (j = i + 1;j <= k;j++)
		 {
				if (str[i].equals(str[j]))
				{
				str[j] = '0';
				flag = 0;
				}
		 }
		 }
			if (flag == 1)
			{
			  f = 1;
			  System.out.printf("%c",str[i]);
			  break;
			}
	 }
			if (f != 1)
			{
			if (!str[k].equals('0'))
			{
			System.out.printf("%c\n",str[k]);
			}
			else
			{
			System.out.print("no\n");
			}
			}
	}
	public static int Main()
	{
		int t;
		int i;
		char[][] a = new char[200][10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		com(a[i]);
		System.out.print("\n");
		}
	}

}

