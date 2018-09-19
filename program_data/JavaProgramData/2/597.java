package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int n;
		int m;
		int sum = 0;
		int min;
		int max;
		int[] ID = new int[1000];
		int[] a = new int[26];
		String[] name = {""};
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
			ID[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			name[i] = tempVar3.charAt(0);
		}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(name[i]).length();j++)
			{
			   a[name[i][j] - 'A']++;
			}
		}

	   max = a[0];
	   k = 0;
	   for (i = 0;i < 26;i++)
	   {
		   if (a[i] > max)
		   {
		   max = a[i];
		   k = i;
		   }
	   }

	   System.out.printf("%c\n%d\n",k + 'A',a[k]);

	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < String.valueOf(name[i]).length();j++)
		   {
			   if (name[i][j] == 'A' + k)
			   {
				   System.out.printf("%d\n",ID[i]);
			   }
		   }
	   }




	}

}

