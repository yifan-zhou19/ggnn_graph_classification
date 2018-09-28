package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int Max;
		int Min;
		double j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *num=(int*)malloc(n *2 *sizeof(int));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		int num = (int)malloc(n * 2 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 2 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num + i = Integer.parseInt(tempVar2);
			}
		}

		 for (i = 1,Max = 0;i < 2 * n;i = i + 2)
		 {
			 if (Max < *(num + i))
			 {
				 Max = (num + i);
			 }
		 }
		 for (i = 0,Min = (num);i < 2 * n - 1;i = i + 2)
		 {
			 if (Min > *(num + i))
			 {
				 Min = (num + i);
			 }
		 }
		 //printf("%d",k);
		 for (j = Min;j <= Max;j = j + 0.5)
		 {
			for (i = 0,k = 1;i < 2 * n;i = i + 2)
			{
				if (j >= *(num + i) && j <= *(num + i + 1))
				{
							k = 0;
							break;
				}
			}
			//printf("j=%lf k=%d\n",j,k);
			if (k != 0)
			{
				System.out.print("no\n");
				return 0;
			}

		 }

		 System.out.printf("%d %d",Min,Max);
		 return 0;
	}

}

