package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] zfc = new char[n][21];
		char a;
		char b;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc[i] = tempVar2.charAt(0);
			}
			m = String.valueOf(zfc[i]).length();
			p = 0;
		  for (k = 0;k < m;k++)
		  {
			if (k == 0)
			{
				if (zfc[i][k] == '_' || (zfc[i][k] >= 'a' && zfc[i][k] <= 'z') || (zfc[i][k] >= 'A' && zfc[i][k] <= 'Z'))
				{
				p++;
				}
			}
			if (k != 0)
			{
			   if ((zfc[i][k] >= '0' && zfc[i][k] <= '9') || (zfc[i][k] >= 'a' && zfc[i][k] <= 'z') || (zfc[i][k] >= 'A' && zfc[i][k] <= 'Z' || zfc[i][k] == '_'))
			   {
				   p++;
			   }
			}
		  }
				 if (p == m)
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

