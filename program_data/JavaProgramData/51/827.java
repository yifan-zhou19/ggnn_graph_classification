package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
		String[] s1 = {""};
		int n;
		int i;
		int j;
		int[] a = new int[501];
		int max = 0;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 s = new Scanner(System.in).nextLine();
	//printf("%d\n",a[0]);
		 for (i = 0;i <= s.length() - n;i++)
		 {
			 for (j = 0;j < n;j++)
			 {
				 *(*(s1 + i) + j) = *(s.Substring(i) + j);
			 }
		 }
			   // printf("%c\n",s1[0][0]);
	   // puts(s1[2]);
		 for (i = 0;i <= s.length() - n;i++)
		 {
			 for (j = i;j <= s.length() - n;j++)
			 {
				 if (strcmp(*(s1 + i),*(s1 + j)) == 0 && *(s1 + i) != ' ')
				 {
				 a[i] = (a + i) + 1;
				 *(s.Substring(j)) = ' ';
				 }
			 }
		 }
		 //  puts(s1[2]);

		for (i = 0;i <= s.length() - n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		if (max == 1)
		{
			System.out.print("NO\n");
		}
		else
		{
	   System.out.printf("%d\n",max);
	  // printf("%c\n",s1[0][0]);
	   //	printf("%d %d\n",max,a[0]);
		for (i = 0;i <= s.length() - n;i++)
		{
			if (a[i] == max)
			{
				System.out.printf("%s\n",*(s1 + i));
			}
		}

		}
	}
}

