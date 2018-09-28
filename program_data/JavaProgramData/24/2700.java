package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] l = new int[210];
		char[][] a = new char[210][30];
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
			l[i] = String.valueOf(a[i]).length();
		}



		int p1;
		int p2;
		p1 = l[0];
		for (i = 0;i < n;i++)
		{
			  if (l[i] >= p1)
			  {
				  p1 = l[i];
			  }
		}
		p2 = p1;
		for (i = 0;i < n;i++)
		{
			if (l[i] <= p2)
			{
				p2 = l[i];
			}
		}



		for (i = 0;i < n;i++)
		{
			if (l[i] == p1)
			{
				 System.out.printf("%s\n",a[i]);
				 break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (l[i] == p2)
			{
				 System.out.printf("%s",a[i]);
				 break;
			}
		}
		return 0;
	}

}

