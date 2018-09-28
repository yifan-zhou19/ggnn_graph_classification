package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 //k?????????,m???????????,t????????
	 int N;
	 int k = 0;
	 int m;
	 int t;

	 //a?????????
	 int[] a = new int[500];

	 N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i = 0;i < N;i++)
	 {
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  if (m % 2 != 0) //??????????
	  {
	   a[k] = m;
	   k++;
	  }
	 }

	 for (int i = 0;i < k - 1;i++) //????
	 {
	  for (int j = 0;j < k - 1 - i;j++)
	  {
	   if (a[j] > a[j + 1])
	   {
			t = a[j];
			a[j] = a[j + 1];
			a[j + 1] = t;
	   }
	  }
	 }

	 System.out.print(a[0]);
	 for (int i = 1;i < k;i++)
	 {
		 System.out.print(',');
		 System.out.print(a[i]);
	 }
	 return 0;
	}
}

