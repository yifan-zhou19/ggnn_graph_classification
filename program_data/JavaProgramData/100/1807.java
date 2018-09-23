package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[300]);
		int i;
		int[] sz = new int[26];
		int[] z = new int[26];
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zfc = tempVar.charAt(0);
		}
		for (i = 0;zfc.charAt(i) != '\0';i++)
		{
			for (j = 65;j < 91;j++)
			{
				if (zfc.charAt(i) == j)
				{
					 sz[j - 65]++;
					 sum++;
				}

			}
			for (j = 97;j < 123;j++)
			{
				 if (zfc.charAt(i) == j)
				 {
					z[j - 97]++;
					sum++;
				 }
			}
		}
		   if (sum == 0)
		   {
		   System.out.print("No");
		   }
		   else
		   {
			   for (j = 65;j < 91;j++)
			   {
				   if (sz[j - 65] != 0)
				   {
					 System.out.printf("%c=%d\n",j,sz[j - 65]);
				   }
			   }
			   for (j = 97;j < 123;j++)
			   {
				  if (z[j - 97] != 0)
				  {
					 System.out.printf("%c=%d\n",j,z[j - 97]);
				  }
			   }
		   }


			  return 0;
	}





}

