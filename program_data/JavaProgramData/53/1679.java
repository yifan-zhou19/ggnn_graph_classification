package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 int[] num = new int[300];
	 int temp;
	 int flag = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 num[0] = Integer.parseInt(tempVar2);
	 }
	 for (i = 1;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  temp = Integer.parseInt(tempVar3);
	  }
	  for (j = 0;j < i;j++)
	  {
	   if (temp == num[j])
	   {
		flag = 1;
		break;
	   }
	  }
	  if (flag != 0)
	  {
	   i--;
	   n--;
	  }
	  else
	  {
	   num[i] = temp;
	  }
	  flag = 0;
	 }
	System.out.printf("%d",num[0]);
	 for (i = 1;i < n;i++)
	 {
	  System.out.printf(",%d",num[i]);
	 }
	return 0;
	}
}

