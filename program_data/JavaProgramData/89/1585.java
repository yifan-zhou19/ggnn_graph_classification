package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 int[] p = new int[n];
		 for (int i = 0;i < n;i++)
		 {
			  p[i] = 0;
		 }
		 for (;;)
		 {
			  int i;
			  int j;
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  i = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  j = Integer.parseInt(tempVar3);
			  }
			  if (i == 0 && j == 0)
			  {
			  break;
			  }
			  p[j] = p[j] + 1;
		 }
		 for (k = 0;k < n;k++)
		 {
			  if (p[k] == n - 1)
			  {
				   System.out.printf("%d\n",k);
				   break;
			  }
		 }
		 if (k == n)
		 {
		 System.out.print("NOT FOUND\n");
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(p);
		 return 0;
	}

}

