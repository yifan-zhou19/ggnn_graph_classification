package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int j = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pp;
		int pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pp = (int)malloc((Integer.SIZE / Byte.SIZE) * n);
		if (n == 1)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b = Integer.parseInt(tempVar3);
				}
				 if ((a >= 90) && (a <= 140) && (b >= 60) && (b <= 90))
				 {
					   j++;
				 }
				 else
				 {
					  j = 0;
				 }
				 System.out.printf("%d",j);
		}
		else
		{
			for (k = 0;k < n;k++)
			{
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 a = Integer.parseInt(tempVar4);
				 }
				 String tempVar5 = ConsoleInput.scanfRead();
				 if (tempVar5 != null)
				 {
					 b = Integer.parseInt(tempVar5);
				 }
				 if ((a >= 90) && (a <= 140) && (b >= 60) && (b <= 90))
				 {
					   j++;
				 }
				 else
				 {
					  j = 0;
				 }
				 *(pp + k) = j;
			}
			 for (k = 0;k < (n - 1);k++)
			 {
				 if (*(pp + k) >= *(pp + k + 1))
				 {
					  *(pp + k + 1) = *(pp + k);
				 }
			 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			 free(pp);
			 System.out.printf("%d",*(pp + n - 1));
		}
		return 0;
	}
}

