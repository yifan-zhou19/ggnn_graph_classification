package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 3;
		int a;
		int b;
		int c = 1;
		int d = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.out.print("6=3+3\n8=3+5\n");
		for (i = 10;i <= n;i = i + 2)
		{
		   for (j = 3;j <= i / 2;)
		   {
			   if (j == 3)
			   {
				   for (b = 2;b < i - j;b = b + 1)
				   {
					   if ((i - j) % b == 0)
					   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					   }
					   else
					   {
						   continue;
					   }
				   }
			   }
			else
			{
				for (a = 3;a < Math.sqrt(j) + 2;a = a + 2)
				{
				   if (j % a == 0)
				   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					   goto loop;
				   }
				   else
				   {
					   for (b = 3;b < Math.sqrt(i - j) + 2;b = b + 2)
					   {
					   if ((i - j) % b == 0)
					   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
						goto loop;
					   }
					   else
					   {
						   continue;
					   }
					   }
				   }
				}
			}
			System.out.printf("%d=%d+%d\n",i,j,i - j);
			break;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	loop:
	j = j + 2;
		   }
		}

	}
}

