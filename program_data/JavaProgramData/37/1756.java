package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100000]);
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		 a = new Scanner(System.in).nextLine();
		 m = a.length();
		 for (j = 0;j < m;j++)
		 {
			for (k = 0,l = 0;k < m;k++)
			{
				if (a.charAt(j) == a.charAt(k))
				{
			l = l + 1;
				}
			}
			if (l == 1)
			{
				System.out.printf("%c\n",a.charAt(j));
			break;
			}
		 }
		 if (j >= m)
		 {
		 System.out.print("no\n");
		 }
		}




	}

}

