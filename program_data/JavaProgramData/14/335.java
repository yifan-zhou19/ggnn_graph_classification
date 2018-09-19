public class student
{
	   public int id;
	   public int[] Gra = new int[2];
}

package <missing>;

public class GlobalMembers
{
	public static int[] sum = new int[1000000];
		   public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000000);
	public static int Main()
	{
		   int n;

		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (int i = 0;i < n;i++)
		  {
			  stu[i].id = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  stu[i].Gra[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  stu[i].Gra[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  sum[i] = stu[i].Gra[0] + stu[i].Gra[1];
		  }
		  int max = 0;
		  int imax = 0;
		  for (int i = 0;i < 3;i++)
		  {
			  max = 0;
			  for (int j = 0;j < n;j++)
			  {
				  if (max < sum[j])
				  {
				  max = sum[j];
				  imax = j;
				  }
			  }

			  System.out.print(stu[imax].id);
			  System.out.print(" ");
			  System.out.print(sum[imax]);
			  System.out.print("\n");
			  sum[imax] = 0;


		  }

		 return 0;
	}


}

