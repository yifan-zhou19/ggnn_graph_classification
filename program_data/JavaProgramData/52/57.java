package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)

	{

			 int n;
			 int m;
			 int i;
			 int j;

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

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * x=(int *)malloc(sizeof(int)*n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			 int x = (int)malloc((Integer.SIZE / Byte.SIZE) * n);

			 for (i = 0;i < n;i++)
			 {

					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   x + i = Integer.parseInt(tempVar3);
					   }

			 }

			 m = m % n; //???????

			 int tmp;

			 for (j = 0; j < m; j++)

			 {

					   tmp = (x + n - 1);

					   for (i = n - 1;i > 0;i--)

					   {

								*(x + i) = *(x + i - 1);

					   }

					   x = tmp;

			 }

			 for (i = 0;i < n - 1;i++)
			 {

					   System.out.printf("%d ",*(x + i));

			 }

			 System.out.printf("%d",*(x + i));





//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			 free(x);


	}
}

