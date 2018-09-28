package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] zf = new char[1000][21];
		int[] jg = new int[1000];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zf[i] = tempVar2.charAt(0);
			}
		}
		for (int i = 0;i < n;i++)
		{
			for (int t = 0;t < String.valueOf(zf[i]).length();t++)
			{
			  if ((zf[i][t] >= '0') && (zf[i][t] <= '9'))
			  {
				  jg[i] = jg[i] + 1;
			  }
			  if ((zf[i][t] >= 'a') && (zf[i][t] <= 'z'))
			  {
				  jg[i] = jg[i] + 1;
			  }
			  if ((zf[i][t] >= 'A') && (zf[i][t] <= 'Z'))
			  {
				  jg[i] = jg[i] + 1;
			  }
			  if (zf[i][t] == '_')
			  {
				  jg[i] = jg[i] + 1;
			  }
			}
		}
	   for (int i = 0;i < n;i++)
	   {
			 if ((zf[i][0] >= '0') && (zf[i][0] <= '9'))
			 {
				 jg[i] = jg[i] - 1;
			 }
	   }
		for (int i = 0;i < n;i++)
		{
			if (jg[i] == String.valueOf(zf[i]).length())
			{
		System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}


}

