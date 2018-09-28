package <missing>;

public class GlobalMembers
{
	public static int[] num1 = new int[10000];
	public static int[] num2 = new int[10000];
	public static int n;

	public static int Main()
	{
		char str;
		int temp = 0;
		int i;
		int max = 0;
		int tmp;
		int j;
		n = 0;
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		while (str != '\n')
		{
			 if (str == ',')
			 {
				   num1[n] = temp;
				   temp = 0;
				   n++;
			 }
			 else
			 {
				 temp = temp * 10 + str - '0';
			 }
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 str = tempVar2.charAt(0);
			 }
		}
		num1[n] = temp;
		n++;
		for (i = 0;i < n;i++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  num2[i] = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(null, 1);
			  if (tempVar4 != null)
			  {
				  str = tempVar4.charAt(0);
			  }
		}

	   for (i = 0;i < 1000;i++)
	   {
			 tmp = 0;
			 for (j = 0;j < n;j++)
			 {
			 if (i >= num1[j] != 0 && i < num2[j])
			 {
				  tmp++;
			 }
			 }
			 if (tmp > max)
			 {
				max = tmp;
			 }
	   }
	   System.out.printf("%d %d",n,max);

		return 0;
	}

}

