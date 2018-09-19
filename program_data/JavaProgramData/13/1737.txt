package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int l = 0;
		int excit = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 int[] num = new int[k];
	 int[] shulie = new int[k];

	 for (i = 1;i <= k;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 num[i - 1] = Integer.parseInt(tempVar2);
		 }
	   for (j = 0;j <= i - 2;j++)
	   {
		   if (num[j] == num[i - 1])
		   {
			   excit = 1;
			  break;
		   }
	   }
		if (excit == 0)
		{
			shulie[l] = num[i - 1];
		 l = l + 1;
		}
		else
		{
			excit = 0;
		}
	 }
	 System.out.printf("%d",shulie[0]);
	 for (i = 2;i <= l;i++)
	 {
			 System.out.printf(" %d",shulie[i - 1]);
	 }
	}
}

