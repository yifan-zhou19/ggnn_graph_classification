package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int temp;
		char m;
		int[] a = new int[1001];
		int num;
		int i;
		int j;
		int k;
		int[] come = new int[1000];
		int[] leave = new int[1000];
		for (num = 0; ;num++)
		{
			  come[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  m = System.in.read();
			  if (m == '\n')
			  {
			  break;
			  }
		}
		for (num = 0; ;num++)
		{
			  leave[num] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  m = System.in.read();
			  if (m == '\n')
			  {
			  break;
			  }
		}
		for (i = 0; i <= num; i++)
		{
			 for (j = come[i]; j < leave[i]; j++)
			 {
				   a[j]++;
			 }
		}
		temp = a[0];
		for (i = 1;i <= 1000; i++)
		{
			if (a[i] >= temp)
			{
				temp = a[i];
			}
		}
		System.out.print(num + 1);
		System.out.print(" ");
		System.out.print(temp);
		System.out.print("\n");
		return 0;
	}
}

