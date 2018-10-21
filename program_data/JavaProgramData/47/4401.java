package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 2 || n>99)
		{
			System.out.print("It is a wrong number!");
		}
		if (n == 10)
		{
						 for (i = 1;i <= n + 1;i++)
						 {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  a[i] = Integer.parseInt(tempVar2);
						  }
						 }

						  for (i = 1;i <= n + 1;i++)
						  {
						   if (i == 1)
						   {
						   System.out.printf("%d",a[n + 1]);
						   }
						   else
						   {
						   System.out.printf(" %d",a[n + 2 - i]);
						   }
						  }
		}


		else
		{

						  for (i = 1;i <= n;i++)
						  {
						  String tempVar3 = ConsoleInput.scanfRead();
						  if (tempVar3 != null)
						  {
							  a[i] = Integer.parseInt(tempVar3);
						  }
						  }

						  for (i = 1;i <= n;i++)
						  {
						  if (i == 1)
						  {
						  System.out.printf("%d",a[n]);
						  }
						  else
						  {
						  System.out.printf(" %d",a[n + 1 - i]);
						  }
						  }
		}
	}
}

