package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] n = new int[m];
		int a;
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *b=(int*)malloc(sizeof(int)*a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			int b = (int)malloc((Integer.SIZE / Byte.SIZE) * a);
			if (a == 0)
			{
				n[i] = 60;
				System.out.print("\n");
			}
			else
			{

				int j;
				for (j = 0;j < a;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[j] = tempVar3;
					}
				}
		 int sum = 61;
		 int k;
		 for (k = a;k >= 0 && sum == 61;k--)
		 {
			 if (60 < (k * 3 + (b[k - 1])) && (k * 3 + (b[k - 1])) < +63)
			 {
				 sum = b[k - 1];
			 }
			 else if ((k * 3 + (b[k - 1])) <= 60)
			 {
				 sum = 60 - k * 3;
			 }
		 }
		 n[i] = sum;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(b);
		 System.out.print("\n");
			}
		}
		 int c;
		 for (c = 0;c < m;c++)
		 {
			 System.out.printf("%d\n",n[c]);
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(n);
		 return 0;
	}

}

