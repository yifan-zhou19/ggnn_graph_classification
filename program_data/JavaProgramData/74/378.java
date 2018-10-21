package <missing>;

public class GlobalMembers
{
	public static int sushu(int i)
	{
		int m;
		int n = 1;
		if (i == 2)
		{
			return (1);
		}
		else
		{
		for (m = 2;m <= i - 1;m++)
		{
			if (i % m == 0)
			{
				n = 0;
				break;
			}

		}
		}
	   if (n == 1)
	   {
		   return 1;
	   }
			else
			{
				return 0;
			}
	}

	public static int huiwen(int n)
	{
		int i;
		int j;
		int k;
		int m = 0;
		j = 0;
		k = n;
		for (i = 0;j == 0;i++)
		{
			if (k / 10 == 0)
			{
				j = 1;
			}
			k = k / 10;
		}

		k = n;
		for (j = 1;j <= i;j++)
		{
			m = m * 10 + k % 10;
			k = k / 10;
		}
		 if (m == n)
		 {
			 return 1;
		 }
		else
		{
			return 0;
		}
	}

	public static void Main()
	{
		 int huiwen = int;
		 int sushu = int;
		 int a;
		 int b;
		 int c;
		 int i;
		 int j;
		 c = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }
		 for (i = a;i <= b;i++)
		 {
			 if (huiwen(i) * sushu(i) != 0)
			 {
				 if (c == 1)
				 {
					 System.out.print(",");
				 }
				 System.out.printf("%d",i);
				 c = 1;


			 }

		 }
		 if (c == 0)
		 {
			 System.out.print("no\n");
		 }
	}

}

