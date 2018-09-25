package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int i;
		 int[] number = new int[1000];
		 int a;
		 for (i = 0; i < n; i++)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number[i] = Integer.parseInt(tempVar2);
			}
		 }
		for (i = 1; i < n; i++)
		{
			if (number[0] < number[i])
			{
			  a = number[i];
			  number[i] = number[0];
			  number[0] = a;
			}
		}
		for (i = 2; i < n; i++)
		{
		  if (number[1] < number[i])
		  {
			 a = number[i];
			 number[i] = number[1];
			 number[1] = a;
		  }
		}
		System.out.printf("%d\n%d", number[0], number[1]);
		 return 0;
	}
}

