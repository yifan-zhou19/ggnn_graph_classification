package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[1000],n,m,i,j,t;
		 int[] p = new int[1000];
		 int n;
		 int m;
		 int i;
		 int j;
		 int t;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 m = Integer.parseInt(tempVar2);
		 }
		 for (i = 0;i < n;i++)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 p[i] = (int)malloc(1000);
			 for (j = 0;j < m;j++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 p[i] + j = tempVar3;
				 }
			 }
		 }

		for (j = 0;j < m + n - 1;j++)
		{
			if (j < m)
			{
				t = 0;
			}
			else
			{
				t = j - m + 1;
			}
			for (i = t;i < n && i <= j;i++)
			{
				System.out.printf("%d\n",*(p[i] + j - i));
			}
		}

			 return 0;
	}


}

