package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int t;
		int count = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[N]; //????a[N]
		for (i = 0;i < N;i++)
		{
			 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (a[i] % 2 != 0)
			 {
				count = count + 1; //?????????
			 }
		}
		int[] b = new int[count]; //??????b[count]
		k = 0;
		for (i = 0;i < N;i++)
		{
			 if (a[i] % 2 != 0)
			 {
				 b[k] = a[i];
				 k++; //?a[N]???????b[count]
			 }
		}
		for (j = 1;j < count;j++)
		{
			 for (k = 0;k < count - j;k++)
			 {
				  if (b[k] > b[k + 1])
				  {
					  t = b[k];
					  b[k] = b[k + 1];
					  b[k + 1] = t; //�???�?b[count]????????
				  }
			 }
		}
		for (k = 0;k < count - 1;k++)
		{
			 System.out.print(b[k]);
			 System.out.print(",");
		}
		System.out.print(b[count - 1]);
		System.out.print("\n");
		return 0;
	}

}

