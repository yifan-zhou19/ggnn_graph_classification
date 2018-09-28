package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String str = new String(new char[2000]);
		int[] ann = new int[200];

		char[][] arr = new char[200][100];
		int i = 0;
		int k = 0;
		int j = 0;
		int l;
		int m1;
		int m2;
		int len;
		int n;
		str = new Scanner(System.in).nextLine();

		len = str.length();
		for (l = 0;l <= len;l++)
		{
		  arr[i][j] = str.charAt(l);
		  if ((arr[i][j] == 32) || (arr[i][j] == 44) || (arr[i][j] == 0))
		  {
			  arr[i][j] = 0;
			  ann[i] = j;
			  i++;
			  j = -1;
		  }
		  j++;
		}
		n = i;

		m1 = 0;
		m2 = 0;

		for (i = 1;i < n;i++)
		{
			if (ann[m1] < ann[i])
			{
				m1 = i;
			}
			if ((ann[m2] > ann[i]) && (ann[i] > 0))
			{
				m2 = i;
			}
		}

		//for (i=0;i<n;i++) {
		//	printf("%s %d\n",arr[i],ann[i]);
		//}

		System.out.println(arr[m1]);
		System.out.println(arr[m2]);

	}
}
