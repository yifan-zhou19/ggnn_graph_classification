package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int[] year = new int[200];
		 int[] m1 = new int[200];
		 int[] m2 = new int[200];
		 int i;
		 int j;
		 int t;
		 int a;
		 int[] run = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //??????????????
		 int[] feirun = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  for (i = 0;i < 200;i++)
		  {
				  year[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  m1[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				  m2[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 if (m1[i] < m2[i])
		 {
		  t = m1[i];
				 m1[i] = m2[i];
		  m2[i] = t;
		 } //?m1[i]??????
		 if ((year[i] % 4 == 0) && (year[i] % 100 != 0) || (year[i] % 400 == 0)) //???????
		 {
			a = 0;
			for (j = m2[i];j < m1[i];j++)
			{
			a = a + run[j]; //???????
			}
			if (a % 7 == 0) //??????????
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
					 System.out.print("NO");
					 System.out.print("\n");
			}
		 }
	   else
	   { //?????
			a = 0;
			for (j = m2[i];j < m1[i];j++)
			{
				   a = a + feirun[j];
			}
			if (a % 7 == 0)
			{
			System.out.print("YES");
			System.out.print("\n");
			}
				 else
				 {
			System.out.print("NO");
			System.out.print("\n");
				 }
	   }
		  }
		return 0;
	}
}

