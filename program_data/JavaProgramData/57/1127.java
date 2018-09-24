package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String dc = new String(new char[50]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dc = tempVar2.charAt(0);
			}
		   // printf("%s",dc);
		   m = dc.length() - 1;
		 //printf("%d",m);
		 if (dc.charAt(m) == 'g')
		 {
			 dc = dc.substring(0, m - 2);
		 }
		 else
		 {
			 dc = dc.substring(0, m - 1);
		 }

		System.out.printf("%s\n",dc);
		}

	}


}

