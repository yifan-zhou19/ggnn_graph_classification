package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int h;
		 int l;
		 int i;
		 int j = 0;
		 int k = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 1;i <= n;i++)
		 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   h = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   l = Integer.parseInt(tempVar3);
			   }
			   if ((h < 90) || (h>140) || (l < 60) || (l>90))
			   {
				   j = 0;
			   }
			   if ((h <= 140) && (h >= 90) && (l <= 90) && (l >= 60))
			   {
				   j++;
				if (j >= k)
				{
					k = j;
				}
			   }

		 }
		 System.out.printf("%d",k);
	return 0;
	}

}

