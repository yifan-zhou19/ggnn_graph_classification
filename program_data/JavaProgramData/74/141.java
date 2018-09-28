package <missing>;

public class GlobalMembers
{
	public static int ss(int num)
	{
	   int i;
	   int j;
	   int k;
	   k = Math.sqrt(num) + 1;
	   if (num == 2)
	   {
		   return 0;
	   }
	   if (num == 1)
	   {
		   return 1;
	   }
	   for (i = 2;i <= k;i++)
	   {
		   if ((num % i) == 0)
		   {
			   return 1;
		   }
	   }
	   return 0;
	}

	public static int huiwen(int num)
	{
		int i;
		int j;
		int k;
		int x;

		String num2 = new String(new char[10]);

		k = 1;
		while (num >= 10)
		{

			num2 = tangible.StringFunctions.changeCharacter(num2, k, num % 10 + 48);
		   num = num / 10;
		   k++;

		}
		num2 = tangible.StringFunctions.changeCharacter(num2, k, num + 48);

		x = k / 2 + 1;
		for (i = 1;i <= x;i++)
		{
		   if (num2.charAt(i) != num2.charAt(k - i + 1))
		   {
			   return 0;
		   }
		}
		return 1;
	}

	public static int Main()
	{
		int i;
		int n;
		int m;
		int k;
		int ans;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		k = 0;
		for (i = n;i <= m;i++)
		{
		   ans = ss(i);
		   if (ans == 0)
		   {
			  if (huiwen(i) == 1)
			  {
			   if (k == 0)
			   {
				   System.out.printf("%d",i);
			   }
				  else
				  {
					  System.out.printf(",%d",i);
				  }
				k++;
			  }
		   }
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}
	}
}

