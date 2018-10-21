package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int sort = new int(int * *p,int n,int m);
		 int[][] p;
		 int m;
		 int n;
		 int i;
		 int j;
		 int a;
		 p = new int[5];
		 for (i = 0;i < 5;i++)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 *(p + i) = (int)malloc(5 * (Integer.SIZE / Byte.SIZE));
		 }
		 for (i = 0;i < 5;i++)
		 {
			 for (j = 0;j < 5;j++)
			 {
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 *(p + i) + j = tempVar;
				 }
			 }
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 m = Integer.parseInt(tempVar3);
		 }
		 a = sort(p, n, m);
		 if (a == 1)
		 {
			 for (i = 0;i < 5;i++)
			 {
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",*(*(p + i) + j));
				}
				System.out.printf("%d\n",*(*(p + i) + j));
			 }
		 }
		 if (a == 0)
		 {
			 System.out.print("error");
		 }
		 return 0;
	}
	public static int sort(int[][] p, int n, int m)
	{
		int k; //temp????????????//
		int temp;
		if (m >= 0 && m < 5 && n >= 0 && n < 5)
		{
			for (k = 0;k < 5;k++)
			{
				temp = (*(p + m) + k);
				*(*(p + m) + k) = *(*(p + n) + k);
				*(*(p + n) + k) = temp;
			}
			return 1; //?????????????????1//
		}
		else
		{
			return 0;
		}
	}
}

