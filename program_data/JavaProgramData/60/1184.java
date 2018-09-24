package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[] sushu = new int[10000];
		 int i;
		 int n;
		 int j;
		 int s = 0;
		 int flag = 0;
		 int m = 0;
		 for (i = 2;i < 10000;i++)
		 {
			 flag = 0;
			 if (i == 2)
			 {
				sushu[s] = i;
				s++;
			 }
			 else
			 {
				 for (j = 2;j < i;j++)
				 {
					 if (i % j == 0)
					 {
						 flag = 1;
						 break;
					 }
				 }
				 if (flag == 0)
				 {
				 sushu[s] = i;
					 s++;
				 }
			 }
		 }

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 0;sushu[i + 1] <= n;i++)
		 {
			if (sushu[i + 1] - sushu[i] == 2)
			{
				System.out.printf("%d %d\n",sushu[i],sushu[i + 1]);
				m = 1;
			}
		 }
		 if (m == 0)
		 {
			 System.out.print("empty");
		 }
	return 0;
	}

}

