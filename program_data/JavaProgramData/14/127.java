public class student
{
		public int num;
		public int score1;
		public int score2;

}

package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[100000];
		public static student[] a = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static void Main()
	{
		int max = new int(int b[],int n);

			int i;
			int j = 0;
			int n;
			int c;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}

		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 a[i].num = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i].score1 = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a[i].score2 = Integer.parseInt(tempVar4);
			 }
			  b[i] = a[i].score1 + a[i].score2;
		 }
		while (j < 3)
		{
				   c = max(b, n);
			 for (i = 0;i < n;i++)
			 {
				 if (b[i] == c)
				 {
					 System.out.printf("%d %d\n",a[i].num,b[i]);
					 b[i] = 0;
					 j = j + 1;
					 if (j == 3)
					 {
						 break;
					 }
				 }

			 }
		}



	}
	public static int max(int[] b, int n)
	{
		int c;
		int i;
		   c = b[0];
		  for (i = 0;i < n;i++)
		  {
		  if (c < b[i])
		  {
			  c = b[i];
		  }
		  }
		  return (c);
	}

}

