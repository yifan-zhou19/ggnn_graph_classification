package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		int k;
		int[] num = new int[510];
		int max;
		int sum = 0;
		String str = new String(new char[510]);
		char[][] a = new char[510][6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		m = str.length();
		for (i = 0;i <= (m - n);i++)
		{
		   for (j = 0;j < n;j++)
		   {
		   a[i][j] = str.charAt(i + j);
		   }
		 for (k = 0;k <= (m - n);k++)
		 {
			t = strcmp(a[i],a[k]);
			if (t == 0)
			{
			  num[k] = num[k] + 1;
			  break;
			}

		 }
		}
		max = num[0];
		for (i = 0;i <= (m - n);i++)
		{
		   if (num[i] > max)
		   {
			   max = num[i];
		   }
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{

		   System.out.printf("%d\n",max);
		   for (i = 0;i <= (m - n);i++)
		   {
			   if (num[i] == max)
			   {
			   System.out.printf("%s\n",a[i]);
			   }
		   }
		}


		 return 0;


	}
}

