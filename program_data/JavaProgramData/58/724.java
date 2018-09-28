package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int l;
		int j;
		int p;
		int m;
		String c = new String(new char[81]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		c = new Scanner(System.in).nextLine();
		//printf("ssss:%s\n",c);


		for (i = 0;i < n;i++)
		{
			c = new Scanner(System.in).nextLine();
			//printf("aaaaaa:%s\n",c);
			l = c.length();
			for (j = 0;j < l;j++)
			{
				if ((c.charAt(j) > 47 && c.charAt(j) < 58) || (c.charAt(j)>64 && c.charAt(j) < 91) || (c.charAt(j) < 123 && c.charAt(j)>96) || c.charAt(j) == 95)
				{
					m = 1;
				}
				else
				{
					m = 0;
					break;
				}
			}
			if (c.charAt(0) > 47 && c.charAt(0) < 58)
			{
				m = 0;
			}
			System.out.printf("%d\n",m);
		}
		return 0;
	}

}

