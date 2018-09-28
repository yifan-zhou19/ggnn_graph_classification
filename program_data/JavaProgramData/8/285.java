package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void px(int a[],int l1,int b[],int l2);
		int len1;
		int len2;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		len1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= len1;i++)
		{
		 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= len2;i++)
		{
		 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		px(a, len1, b, len2);
		return 0;
	}

		public static void px(int[] a, int l1, int[] b, int l2)
		{
		int i;
		int j;
		int temp;
		for (i = 1;i <= l1 - 1;i++)
		{
		  for (j = i + 1;j <= l1;j++)
		  {
			if (a[i] > a[j])
			{
				  temp = a[j],a[j] = a[i],a[i] = temp;
			}
		  }
		}

		for (i = 1;i <= l2 - 1;i++)
		{
		  for (j = i + 1;j <= l2;j++)
		  {
			if (b[i] > b[j])
			{
				  temp = b[j],b[j] = b[i],b[i] = temp;
			}
		  }
		}
		for (i = 1;i <= l1;i++)
		{
		System.out.print(a[i]);
		System.out.print(" ");
		}
		for (i = 1;i <= l2 - 1;i++)
		{
		System.out.print(b[i]);
		System.out.print(" ");
		}
		System.out.print(b[l2]);
		}

}

