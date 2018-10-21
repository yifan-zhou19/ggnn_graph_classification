package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String a = new String(new char[500]);
		char[][] str =
		{
			{'\0', '\0', '\0', '\0', '\0', '\0'},
			{'\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] c = new int[500];
		int n;
		int l;
		int i;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		l = a.length();
		for (i = 0;i <= l - n;i++)
		{
		  for (j = 0;j <= n - 1;j++)
		  {
			str[i][j] = a.charAt(i + j);
		  }
		}
		for (i = 0;i <= l - n;i++)
		{
		 for (j = i;j <= l - n;j++)
		 {
		 if (strcmp(str[j],str[i]) == 0)
		 {
		 c[i]++;
		 }
		 }
		} //??????????c[]
		max = c[0];
		for (i = 1;i <= l - n;i++)
		{
		if (c[i] > max)
		{
			max = c[i]; //?????????
		}
		}
		if (max == 1)
		{
			System.out.print("NO");
		}
		else
		{
		  System.out.printf("%d\n",max);
		  for (i = 0;i <= l - n;i++)
		  {
		  if (c[i] == max)
		  {
		  System.out.printf("%s\n",str[i]);
		  }
		  }
		}
		return 0;
	}

}

