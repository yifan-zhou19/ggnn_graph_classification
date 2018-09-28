package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int k = 0;
		int[] flag = new int[550];
		int t;
		int j = 1;
		int i = 0;
		int max;
		String s = new String(new char[550]);
		char[][] s1 =
		{
			{0, '\0', '\0', '\0', '\0', '\0'}
		}; //?x?
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		t = s.length();
		x = t - n + 1; //x?????????
		do
		{
		*(*(s1 + j) + k) = *(s.Substring(i));
		i++;
		k++;
		if (k == n)
		{
		i = j;
		j++;
		k = 0;
		}
		}while (j <= x);
		for (i = 1;i <= x - 1;i++)
		{
						   for (j = i + 1;j <= x;j++)
						   {
						   if (strcmp(*(s1 + i),*(s1 + j)) == 0)
						   {
						   flag[i]++;
						   }
						   }
		}
		  max = flag[1];
		for (i = 2;i <= x;i++)
		{
						 if (flag[i] > max)
						 {
						 max = flag[i];
						 }

		}
		if (max == 0)
		{
		System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",max + 1);
		for (i = 1;i <= x;i++)
		{
						 if (flag[i] == max)
						 {
						 System.out.printf("%s\n",*(s1 + i));
						 }
		}
		}
		return 0;
	}


}

