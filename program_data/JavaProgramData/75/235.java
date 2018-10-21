package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] r = new int[1000];
		int i;
		int j;
		int k = 0;
		int max = 0;
		final String c = "";
		final String d = "";
		for (i = 0;i < 2000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, tempVar2);
			}
			 if (c.charAt(i) != ',')
			 {
				 i = i + 1;
				 break;
			 }
		}
		 for (j = 0;j < i;j++)
		 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[j] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(null, 1);
		   if (tempVar4 != null)
		   {
			   d = tangible.StringFunctions.changeCharacter(d, j, tempVar4);
		   }

		 }
		  System.out.printf("%d ",i);
		 for (j = 0;j < 1000;j++)
		 {
			 for (k = 0;k < i;k++)
			 {
			 if (j >= a[k] != 0 && j < b[k])
			 {
			  r[j] = r[j] + 1;
			 }
			 }
		 }
		 for (j = 0;j < 1000;j++)
		 {
		   if (r[j] > max)
		   {
			   max = r[j];
		   }
		 }
		 System.out.printf("%d",max);

		return 0;
	}
}

